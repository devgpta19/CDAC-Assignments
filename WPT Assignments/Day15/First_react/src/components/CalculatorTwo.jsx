import { useEffect } from "react";
import "./style.css";

function Calculator() {
  useEffect(() => {
    document.querySelector("button").addEventListener("click", function () {
      var x = parseInt(document.querySelector(".inputNumber1").value);
      var y = parseInt(document.querySelector(".inputNumber2").value);
      var opra = document.querySelector(".inputNumber3").value;
      var OperationName = "";
      let sum;

      (function calc(x, y) {
        // console.log(x);
        // console.log(y);
        // console.log(x + y);

        switch (opra) {
          case "+":
            OperationName = "Addition";
            sum = x + y;
            break;
          case "-":
            OperationName = "Subtraction";
            sum = x - y;
            break;
          case "*":
            OperationName = "Multiplication";
            sum = x * y;
            break;
          case "/":
            OperationName = "Division";
            sum = x / y;
            break;

          default:
            document.querySelector(
              ".inner_container"
            ).innerHTML = `<h6>Error is : Wrong Operator Input</h6>`;
            break;
        }
        // console.log(x,opra,y,"=",sum);
        document.querySelector(".inner_container").innerHTML = `<h6>
                <span>${OperationName}</span> of ${x} and ${y} is = <span> ${sum} </span></h6>`;
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
        <label htmlFor="giveNumber">Enter Operation : </label>
        <input type="text" name="giveNumber" className="inputNumber3" /> <br />
        <button className="btn1">Go!</button>
        <div className="inner_container"></div>
      </div>
    </div>
  );
}

export default Calculator;
