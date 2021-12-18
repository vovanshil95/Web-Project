package com.WebProject.service;

import com.WebProject.Exceptions.SameCredentialsException;
import com.WebProject.entity.UserEntity;
import com.WebProject.repository.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;


@Service
public class UserService {

    @Autowired
    UserRepo userRepo;

    public Optional<UserEntity> getUserByCredentials(String email, String password) throws SameCredentialsException {
        List<UserEntity> users = StreamSupport.stream(userRepo.findAll().spliterator(), false)
                .filter(user -> user.getEmail().equals(email) && user.getPassword().equals(password)).collect(Collectors.toList());
        if (users.size() > 1) {
            throw new SameCredentialsException("There is more then 1 user with same email and password");
        } else if (users.size() == 0) {
            return Optional.empty();
        } else {
            return Optional.of(users.get(0));
        }
    }

}
