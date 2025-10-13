import React, { useCallback, useState } from 'react';

const Counter = () => {
    const [counter, setCounter] = useState(10);

    let incre = useCallback(() => {
        if (counter < 20)
            setCounter((prev) => prev + 1);
    }, [counter])
    let decre = useCallback(() => {
        if (counter > 0)
            setCounter((prev) => prev - 1);
    }, [counter])
    let reset = useCallback(() => {
        setCounter(10);
    }, [])


    return (
        <div>
            <h1>
                Counter-UseCallBack: {counter}
            </h1>

            <button onClick={incre}>Inc++</button>
            <button onClick={decre}>Dec--</button>
            <button onClick={reset}>Reset</button>
        </div>
    );
}

export default Counter;
