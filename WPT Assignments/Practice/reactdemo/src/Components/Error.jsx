import { useEffect, useState } from "react";
import Context from "./Context";

const Error = () => {
  let [count, setCount] = useState(10);

  function btnHandler() {
    count++;
    setCount(count);
  }

  return (
    <div style={{display:"flex"}}>
      <div>
        <h1>count:{count}</h1>
        <button onClick={btnHandler}> ADD </button>
        <br />
        <br />
      </div>
      <Context value={count} />
    </div>
  );
};

export default Error;
