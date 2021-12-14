import React from 'react';
import ReactDOM from 'react-dom';
import { BrowserRouter, Routes ,Route } from 'react-router-dom';
import {DatePicker, Button, PageHeader, Layout, Menu, Breadcrumb} from 'antd';
import "antd/dist/antd.css";

const StartApp = () =>{
  return(

    <BrowserRouter>
      <div>
      <Layout>
      
      </Layout>
        <Routes>
          <Route path='login' element={<DatePicker/>}/>
          <Route path='register' element={<Button type="primary">fgfgfgfg</Button>}/>
        </Routes>
      </div>
    </BrowserRouter>
  );
}

ReactDOM.render(<StartApp/>,
  document.getElementById('root')
);

