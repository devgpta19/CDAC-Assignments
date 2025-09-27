import { useEffect } from "react";
import "./style.css";

function Factorial() {
  useEffect(() => {
    document.querySelector("button").addEventListener("click", function () {
      var x = document.querySelector(".inputNumber1").value;
      function calc(x) {
        if (x === 0 || x === 1) return 1;
        return x * calc(x - 1);
      }
      var a = calc(Number(x));
      document.querySelector(
        ".inner_container"
      ).innerHTML = `<h5> Factorial of ${x} is <span> ${a} </span> </h5>`;
    });
  },[]);
  return (
    <div className="main">
        <h1>Factorial Of the Number</h1>
      <div className="main_container">
        <label htmlFor="giveNumber">Enter a Number : </label>
        <input type="text" name="giveNumber" className="inputNumber1" /> <br />
        <button className="btn1">Go!</button>
        <div className="inner_container"></div>
      </div>
    </div>
  );
}

export default Factorial;
