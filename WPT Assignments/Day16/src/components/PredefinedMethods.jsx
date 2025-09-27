import { Component, useEffect, useState } from "react";

class MyComponent extends Component {
  constructor(props) {
    super(props);
    this.state = { color: 'red' };
  }

  static getDerivedStateFromProps(nextProps, prevState) {
    if (nextProps.color !== prevState.color) {
      return { color: nextProps.color };
    }
    return null;
  }
  render() {
    return(
    <>
      <div className="main">
        <h1>Predefined render Methods</h1>
        <div className="main_container">
        <h1>Color is {this.state.color}</h1>
        </div>
        <div className="inner_container"></div>
      </div>
    </>
  );
  }
  componentDidMount() {
    console.log("Compound Did Mount")

  }
   
}
export default MyComponent;
