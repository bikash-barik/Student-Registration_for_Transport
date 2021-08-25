import React from 'react';
import './App.css';
import {BrowserRouter as Router, Route, Switch} from 'react-router-dom'
import StudentRegistration from './components/StudentRegistration';
import ListStudentComponent from './components/ListStudentComponent';
import HeaderComponent from './components/HeaderComponent';
import FooterComponent from './components/FooterComponent';
import CreateStudentComponent from './components/CreateStudentComponent';
import UpdateStudentComponent from './components/UpdateStudentComponent';
import ViewStudentComponent from './components/ViewStudentComponent';
import Register from './components/register';

function App() {
  return (
    <div>
        <Router>
              <HeaderComponent />
                <div className="container">
                    <Switch> 
                          <Route path = "/" exact component = {StudentRegistration}></Route>
                          <Route path = "/Students" component = {ListStudentComponent}></Route>
                          <Route path = "/add-Student/:id" component = {CreateStudentComponent}></Route>
                          <Route path = "/view-Student/:id" component = {ViewStudentComponent}></Route>
                          <Route path = "/register" component = {Register}></Route>
                          {/* <Route path = "/update-Student/:id" component = {UpdateStudentComponent}></Route> */}
                    </Switch>
                </div>
              <FooterComponent />
        </Router>
    </div>
    
  );
}

export default App;
