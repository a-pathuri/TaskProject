import React from 'react';
import ReactDOM from 'react-dom';
import './index.css';
import * as serviceWorker from './serviceWorker';
import { Router, browserHistory } from 'react-router';
import routes from './routes';

// ReactDOM.render(<App />, document.getElementById('root'));
ReactDOM.render(
    <Router onUpdate={() => window.scrollTo(0, 0)} routes = { routes } history = { browserHistory }/>,
    document.getElementById('root')
  );
  

// If you want your app to work offline and load faster, you can change
// unregister() to register() below. Note this comes with some pitfalls.
// Learn more about service workers: http://bit.ly/CRA-PWA
serviceWorker.unregister();
