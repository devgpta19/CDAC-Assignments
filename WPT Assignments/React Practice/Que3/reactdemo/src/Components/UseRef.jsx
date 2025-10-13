import { useRef, useState } from 'react';

const UseRef = () => {

    const initial = 10;

    const[state, setState] = useState(initial);
    const val = useRef(initial);


    function Increment(){
        val.current += 1
        setState(val.current);
    }
    function Decrement(){
        val.current -= 1
        setState(val.current);
    }
    function reset(){
        setState(initial);
    }


  return (
    <div>
      <h1>Count : {state}</h1>
      <button onClick={Increment}>Inc++</button>
      <button onClick={Decrement}>Dec--</button>
      <button onClick={reset}>Reset</button>
    </div>
  );
}

export default UseRef;
