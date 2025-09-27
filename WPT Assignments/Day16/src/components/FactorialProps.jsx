import { useState } from "react";
import "./style.css";

function Factorial() {
  const [x, setX] = useState(5);
  const [a, setA] = useState(null);

  function calcFact(n) {
    if (n === 0 || n === 1) return 1;
    return n * calcFact(n - 1);
  }

  const handleClick = () => {
    const num = parseInt(x);
    if (!isNaN(num)) {
      const result = calcFact(num);
      setA(result);
    } else {
      setA("Invalid input");
    }
  };

  return (
    <div className="main">
      <h1>Factorial Of the Number</h1>
      <div className="main_container">
        <label htmlFor="giveNumber">Enter a Number : </label>
        <input
          type="text"
          name="giveNumber"
          className="inputNumber1"
          onChange={(e) => setX(e.target.value)}
        />
        <br />
        <button className="btn1" onClick={handleClick}>Go!</button>
        <div className="inner_container">
          {a !== null && (
            <h5>
              Factorial of {x} is <span>{a}</span>
            </h5>
          )}
        </div>
      </div>
    </div>
  );
}

export default Factorial;
