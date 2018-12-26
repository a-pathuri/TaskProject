import React, { Component } from 'react'
import MUIDataTable from "mui-datatables";

export default class SortingTable extends Component {

  render() {
    const columns = ["taskDescription","taskFeedback", "taskName", "taskNote","taskStatus","emailAddress","fullName"," password","username"];
    let data=[];
    if( this.props.sortingData){
    this.props.sortingData.map((item)=>{
        return(
        data.push([item.taskDescription,item.taskFeedback,item.taskName,item.taskNote,item.taskStatus,item.user.emailAddress,item.user.fullName,item.user.password,item.user.username])
        )
    })
}


    return (
      <div className="col-lg-12">
       <MUIDataTable
  title={"Employee List"}
  data={data}
  columns={columns}
/>
      </div>
    )
  }
}
