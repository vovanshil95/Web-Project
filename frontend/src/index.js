import React, { useState } from 'react';
import ReactDOM from 'react-dom';
import Card from './components/Card.js'
import Header from './components/Header';

const StartApp = () =>{
  return(
    <div>
      <Header/>
      <Card itemName="default" itemDescription="dfdlfklskldflsdfsdfsdf"/>
    </div>
  );
}

ReactDOM.render(<StartApp/>,
  document.getElementById('root')
);

