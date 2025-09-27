import { Component } from "react";
import { titleCase } from "title-case";
import "./style.css";

export default class Lower_Upper_Title extends Component {
  constructor() {
    super();
    this.a = ""; // Initialize with default value
    this.inputHandler = this.inputHandler.bind(this);
    this.myEventHandler = this.myEventHandler.bind(this);
  }
  //Uppercase Function
  doUpper() {
    let u = this.a.toUpperCase();
    console.log(u);
    document.querySelector(".inner_container").innerHTML = `<h6>
        <span>Upper Case</span> of ${this.a} is = <span> ${u} </span>
    </h6>`;
  }
  // Lowercase Function
  doLower() {
    let l = this.a.toLowerCase();
    console.log(l);
    document.querySelector(".inner_container").innerHTML = `<h6>
        <span>Lower Case</span> of ${this.a} is = <span> ${l} </span>
    </h6>`;
  }
// For TitleCase
  doTitle() {
    let t = titleCase(this.a.toLowerCase());
    console.log(t);
    document.querySelector(".inner_container").innerHTML = `<h6>
        <span>Title Case</span> of ${this.a} is = <span> ${t} </span>
    </h6>`;
  }

  inputHandler(e) {
    console.log(e.target.value);
    this.a = e.target.value;
  }

  myEventHandler(event1) {
    console.log(event1.target.value);
    if (event1.target.value === "upper") this.doUpper();
    if (event1.target.value === "lower") this.doLower();
    if (event1.target.value === "title") this.doTitle();
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
            />{" "}
            <br /> <br />
            <button
              type="radio"
              className="btn1"
              value={"upper"}
              onClick={this.myEventHandler}
            >
              Upper
            </button>
            <button
              type="radio"
              className="btn2"
              value={"lower"}
              onClick={this.myEventHandler}
            >
              Lower
            </button>
            <button
              type="radio"
              className="btn3"
              value={"title"}
              onClick={this.myEventHandler}
            >
              Title
            </button>
            <div className="inner_container"></div>
          </div>
        </div>
      </>
    );
  }
}
