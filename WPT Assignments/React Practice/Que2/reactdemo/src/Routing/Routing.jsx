import React from 'react';
import { Routes, Route } from 'react-router-dom';
import Home from '../Components/Home';
import About from '../Components/About';
import Contact from '../Components/Contact';
import AxiosPage from '../Components/AxiosPage';
import Counter from '../Components/Counter';
import UseRefHookCounter from '../Components/UseRefHookCounter';
import UseRefHookInput from '../Components/UseRefHookInput';

function Routing(props){
    return (
        <div>
            <Routes>
                <Route path='/' element={<Home st={props.s}/>} />
                <Route path='/about' element={<About />} />
                <Route path='/contact' element={<Contact />} />
                <Route path='/axios_page' element={<AxiosPage />} />
                <Route path='/counter' element={<Counter />} />
                <Route path='/useref-counter' element={<UseRefHookCounter />} />
                <Route path='/useref' element={<UseRefHookInput />} />
            </Routes>
        </div>
    );
}

export default Routing;
