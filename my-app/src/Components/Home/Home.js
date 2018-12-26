import React, { Component } from 'react';
import {getJson} from '../../Helper';
import SortingTable from '../SortingTable';

export default class Home extends Component {
    constructor(){
        super();
        this.state={
          taskData:''
        };

    }
    componentDidMount(){

    let promise = getJson('http://localhost:8080/task');
    debugger;
    promise.then((data)=>{
        this.setState({taskData:data});
    })
    }
  render() {
    return (
      <div className="py-6">
        {(this.state.taskData)&&
        <SortingTable sortingData={this.state.taskData}/>
        }
      </div>
    )
  }
}
