import React, { Component } from 'react'
import {postIt} from '../../Helper';

export default class CreateUser extends Component {
  constructor(){
    super();
this.state={
  password: '',
      custEmail: '',
      custName: '',
      FullName:''
}
  }
  handleSubmit(){
    let formData = {
      password: this.state.password,
      custEmail: this.state.custEmail,
      custName: this.state.custName,
      FullName: this.state.FullName,
    };
    let promise =postIt('http://localhost:8080/usertask',formData);
    promise.then((res)=>{
      console.log(res);
    })
  }

  render() {
    return (
      <div className="row">
       <form className="col-lg-10 ">
  <div className="form-group">
    <label for="exampleInputEmail1">Email address</label>
    <input 
      type="email" 
      className="form-control" 
      id="exampleInputEmail1" 
      aria-describedby="emailHelp" 
      placeholder="Enter email"
      value={this.state.custEmail}
      onChange={(e) => this.setState({ custEmail: e.target.value})} />
  </div>
  <div className="form-group">
    <label for="exampleInputPassword1">Password</label>
    <input 
     type="password" 
     className="form-control" 
     id="exampleInputPassword1" 
     placeholder="Password"
     value={this.state.password}
     onChange={(e) => this.setState({ password: e.target.value})}
    />
  </div>
  <div className="form-group">
    <label for="exampleInputPassword1">userName</label>
    <input 
      type="text" 
      className="form-control" 
      id="exampleInputuserName" 
      placeholder="userName"
      value={this.state.username}
      onChange={(e) => this.setState({ username: e.target.value})}
      />
  </div>
  <div className="form-group">
    <label for="exampleInputPassword1">FullName</label>
    <input 
      type="text" 
      className="form-control" 
      id="exampleInputFullName" 
      placeholder="FullName"
      value={this.state.FullName}
      onChange={(e) => this.setState({ FullName: e.target.value})}
      />
  </div>
  <button type="submit" onClick={this.handleSubmit.bind(this)} className="btn btn-primary">Submit</button>
</form>
      </div>
    )
  }
}
