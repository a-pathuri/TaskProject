import React, { Component } from 'react'
import SortingTable from '../SortingTable';
import {getJson} from '../../Helper';

export default class search extends Component {
    constructor() {
        super();
    
        this.state = {
          searchTerm: '',
          
        };
      }
      handleChange(e) {
        this.setState({searchTerm: e.target.value});
      }
      handleSubmit(e) {
        let self=this;
        e.preventDefault();
        if (this.state.searchTerm.length < 4) {
          alert('error Please enter more than 3 letters when searching.');
        }else {
          let promise = getJson('http://localhost:8080/find',{taskName:this.state.searchTerm});
          promise.then((data)=>{
           console.log(data);
           self.setState({taskData:data})
          }).fail(()=>{
    
          });
    
      }
      }
  render() {
    return (
      <div>
        <div>
          <form
            action=""
            id="searchForm"
            name="searchForm"
            className="py-3 "
            onSubmit={this.handleSubmit.bind(this)}
            noValidate
          >
          <div className="input-group">
         
            <input
              type="text"
              placeholder="Keyword or Item/Model #"
              id="search"
              autoComplete="off"
              className="form-control border-radius--none bordered--none"
              value={this.state.searchTerm}
              onChange={this.handleChange.bind(this)}
              required
            />
            <button
              type="submit"
              id="searchBtn"
              className="input-group-addon bg--cta cursor--pointer bordered--none padding-horiz-md border-radius--none font-18"
              onClick={this.handleSubmit.bind(this)}
            >
              <i className="fa fa-search" />
            </button>
          </div>
          </form>
          {(this.state.taskData)&&
          <SortingTable sortingData={this.state.taskData} />
          }
        </div>
      </div>
    )
  }
}
