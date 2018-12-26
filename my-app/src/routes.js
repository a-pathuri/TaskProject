import React from 'react';
import { Route} from 'react-router';
import App from './App';
import Home from './Components/Home/Home';
import Search from './Components/searchPage/search'
import CreateUser from './Components/CreateUser/CreateUser';


export default (
    <Route exact path="/"  component={App}>
    <Route path="/home" component={Home} />
      <Route path="/search" component={Search} />
      <Route path="/createUser" component={CreateUser} />
    </Route>
  );