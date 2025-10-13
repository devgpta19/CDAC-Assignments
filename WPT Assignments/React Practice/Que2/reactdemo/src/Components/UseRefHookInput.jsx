import React, { useRef, useState } from 'react'

const UseRefHookInput = () => {
    let inputRef = useRef(null);
    const [val, setVal] = useState();
    const [val2, setVal2] = useState();
    let value2, value;
    function inputhandler(e){
        value2 = e.target.value;
    }
    function inputHandler(){
        value = inputRef.current.value;  
    }
    function handler(){
        setVal(value)
        setVal2(value2)
    }
  return (
    <div>
      <input type="text" onChange={inputhandler}/>
      <input type="text" onChange={inputHandler} ref={inputRef} />
      <h1>UseRef-val: {val}</h1>
      <h1>UseState-val: {val2}</h1>
      <button onClick={handler}>show</button>
    </div>
  )
}

export default UseRefHookInput
