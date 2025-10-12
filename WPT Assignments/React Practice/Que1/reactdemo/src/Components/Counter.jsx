import React, { useEffect, useState } from 'react';

const Counter = () => {

    let initial = 10;

    const [count, setCount] = useState(initial);
    const [bool, setBool] = useState('');

    function Inc() {
        setCount((count) => count + 1)
    }

    function Dec() {
        setCount((count) => count - 1)
    }

    function reset() {
        setCount(initial);
    }

    useEffect(() => {
        document.title = `Count: ${count}`;
    }, [count]);

    useEffect(()=>{
        if(count%2==0)
            setBool("Even");
        else
            setBool("Odd")
    },[count])

    return (
        <div>
            <h1>Counter : {count}</h1>
            <button onClick={Inc} >Increase</button>
            <button onClick={Dec} >Decrease</button>
            <button onClick={reset}>Reset</button>

            <h3>{count} is {bool}</h3>
        </div>
    );
}

export default Counter;
