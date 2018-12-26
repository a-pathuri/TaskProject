// eslint-disable-next-line
import React, { Component } from 'react';
import './App.css';
import $ from 'jquery';
import Header from './Components/Header';


class App extends Component {
  constructor() {
    super();
  }


  render(){
    console.log($);
    return (
      <div>
        <Header/>
        <main>
        
        {this.props.children}
          
        </main>
      </div>
    );
  }
}

export default App;
