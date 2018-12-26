import React, { Component } from 'react'

export default class Header extends Component {
  render() {
    return (
        <header className="container">
        <div className="row">
        <div className="col-12">
        <nav className="navbar navbar-expand-lg navbar-light bg-light">
        {/* <a className="navbar-brand col-lg-2" href="#">Navbar</a> */}
        <div className="collapse navbar-collapse" id="navbarNavAltMarkup">
          <div className="navbar-nav col-lg-10 pt-3">
            <a className="nav-item nav-link active col-lg-2" href="/home">Home <span className="sr-only">(current)</span></a>
            <a className="nav-item nav-link col-lg-2" href="/createUser">CreateUser</a>
            <a className="nav-item nav-link col-lg-2 " href="/search">Search</a>
          </div>
        </div>
      </nav>
      </div>
      </div>
             
              </header>
    )
  }
}
