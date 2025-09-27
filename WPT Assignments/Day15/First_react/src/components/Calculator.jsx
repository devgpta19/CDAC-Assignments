import { useEffect } from "react";
import "./style.css";

function Calculator() {
  useEffect(() => {
    document.querySelector("button").addEventListener("click", function () {
      var x = parseInt(document.querySelector(".inputNumber1").value);
      var y = parseInt(document.querySelector(".inputNumber2").value);

      (function calc(x, y) {
        console.log(x);
        console.log(y);
        console.log(x + y);
        function add(x, y) {
          return x + y;
        }
        function subs(x, y) {
          return x - y;
        }
        function multi(x, y) {
          return x * y;
        }
        function divide(x, y) {
          return x / y;
        }

        document.querySelector(".inner_container").innerHTML = `<h6>
                <span>Addition</span> of ${x} and ${y} is = <span> ${x + y} </span>
              </h6>
              <h6>
                <span>Substraction</span> of ${x} and ${y} is = <span> ${subs(x, y)} </span>
              </h6>
              <h6>
                <span>Multiplication</span> of ${x} and ${y} is = <span> ${multi(x, y)} </span>
              </h6>
              <h6>
                <span>Division</span> of ${x} and ${y} is = <span> ${divide(x, y)} </span>
              </h6>`;
      })(x, y);
      // document.querySelector(".inner_container").appendChild(".ccp");
    });
  }, []);
  return (
    <div className="main">
      <h1>Calculator</h1>
      <div className="main_container">
        <label htmlFor="giveNumber">Enter First Number : </label>
        <input type="text" name="giveNumber" className="inputNumber1" /> <br />
        <label htmlFor="giveNumber">Enter Second Number : </label>
        <input type="text" name="giveNumber" className="inputNumber2" /> <br />
        <button className="btn1">Go!</button>
        <div className="inner_container"></div>
      </div>
    </div>
  );
}

export default Calculator;
