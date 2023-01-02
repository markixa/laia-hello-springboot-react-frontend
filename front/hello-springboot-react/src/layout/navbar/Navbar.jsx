import React from "react";
import './Navbar.css'

export default function Navbar() {
  return (
    <nav className="navbar">
      <div className="container-fluid">
        <a className="navbar-brand" href="#">
          Full Stack Application 
        </a>
        <button
          className="navbar-toggler navbar-btn"
          type="button"
          data-bs-toggle="collapse"
          data-bs-target="#navbarSupportedContent"
          aria-controls="navbarSupportedContent"
          aria-expanded="false"
          aria-label="Toggle navigation"
        >
          <span className="navbar-toggler-icon"></span>
        </button>
        <button className="navbar-btn">
          Add user
        </button>
      </div>
    </nav>
  );
}
