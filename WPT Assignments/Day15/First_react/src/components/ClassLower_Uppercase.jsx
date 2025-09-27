import { Component } from "react";

export default class Lower_Upper extends Component {
  constructor() {
    super();
    this.a = ""; // Initialize with default value
    this.inputHandler = this.inputHandler.bind(this);
    this.myEventHandler = this.myEventHandler.bind(this);
  }

  doUpper() {
    let u = this.a.toUpperCase();
    console.log(u);
    document.querySelector(".inner_container").innerHTML = `<h6>
        <span>Upper Case</span> of ${this.a} is = <span> ${u} </span>
    </h6>`;
  }
  doLower() {
    let l = this.a.toLowerCase();
    console.log(l);
    document.querySelector(".inner_container").innerHTML = `<h6>
        <span>Lower Case</span> of ${this.a} is = <span> ${l} </span>
    </h6>`;
  }

  inputHandler(e) {
    console.log(e.target.value);
    this.a = e.target.value;
  }

  myEventHandler(event1) {
    console.log(event1.target.value);
    if (event1.target.value === "hello2") this.doUpper();
    // console.log(event1)
    if (event1.target.value === "hello") this.doLower();
  }

  render() {
    return (
      <>
        <div className="main">
          <h1>CaseChanger</h1>
          <div className="main_container">
            <label htmlFor="input">Enter a String</label>
            <input
              type="text"
              name="String"
              id="str1"
              onChange={this.inputHandler}
            /> <br /> <br />

            <button
              className="btn1"
              value={"hello2"}
              onClick={this.myEventHandler}
            >
              Upper
            </button>
            <button
              className="btn2"
              value={"hello"}
              onClick={this.myEventHandler}
            >
              Lower
            </button>
            <div className="inner_container"></div>
          </div>
        </div>
      </>
    );
  }
}
