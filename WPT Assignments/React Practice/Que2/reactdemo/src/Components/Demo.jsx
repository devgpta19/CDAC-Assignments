import React, { useState } from 'react';
import Routing from '../Routing/Routing';
import { BrowserRouter, Link } from 'react-router';

const Demo = () => {

    const [state, setState] = useState('');
    const [inputVal, setInputVal] = useState('');

    function inputHandler(e){
        setInputVal(e.target.value);
    }

    function buttonHandler(){
        setState(inputVal);
    }

    return (
        <div>
            Enter Input : <input type="text" onChange={inputHandler} />
            <button onClick={buttonHandler} >submit</button>

            <BrowserRouter>
                <h1>Hello I'm Home</h1>
                <Routing s={state} />
                <Link to='/'> Home </Link> |
                <Link to='/about'> About </Link> |
                <Link to='/contact'> Contact </Link> |
                <Link to='/axios_page'> Axios </Link> |
                <Link to='/counter'> Counter </Link> |
            </BrowserRouter>
        </div>
    );
}

export default Demo;
