
const Card = (props) =>{
    return(
        <div>
            <div>
                <img src="https://media0.giphy.com/media/eSwGh3YK54JKU/giphy.gif?cid=ecf05e47l1ch52303bc91asamf6ijvi6yz2vq0ghwjkd3322&rid=giphy.gif&ct=g" alt="" />
            </div>
            <div>
                <h3>{props.itemName}</h3>
                <p>{props.itemDescription}</p>
            </div>
        </div>
    );
}

export default Card;