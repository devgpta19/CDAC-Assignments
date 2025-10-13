import React, { useRef, useState } from 'react'

const UseRefHookCounter = () => {

    const initial = 10;
    const[state, setState] = useState();

    const count = useRef(initial);
    function increment() {
        if (count.current < 20)
            count.current = count.current + 1;
        setState(count.current);
    }
    
    function decrement() {
        if (count.current > 0)
            count.current = count.current - 1;
        setState(count.current);
    }
    
    function reset() {
        count.current = initial;
        setState(count.current);
    }

    return (
        <div>

            <h1>Counter Using useRef Hook : {state}</h1>

            <button onClick={increment}>Inc++</button>
            <button onClick={decrement}>Dec++</button>
            <button onClick={reset}>Reset</button>
        </div>
    )
}




export default UseRefHookCounter
