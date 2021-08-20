import React, { Component } from "react";

class HeaderComponent extends Component {
  constructor(props) {
    super(props);

    this.state = {};
  }



  render() {
    return (
      <div>
        <header>
          <nav class="navbar navbar-expand-md navbar-dark bg-dark justify-content-between">
            <a href="" class="navbar-brand">Student Registration For Transport</a>
            <form class="form-inline">
              <a
                class="btn btn-outline-primary my-2 my-sm-0"
                type="submit"
                href="/"
              >
                Admin
              </a>
            </form>
          </nav>
        </header>
      </div>
    );
  }
}

export default HeaderComponent;
