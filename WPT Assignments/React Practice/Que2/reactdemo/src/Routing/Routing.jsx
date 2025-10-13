import React from 'react';
import { Routes, Route } from 'react-router-dom';
import Home from '../Components/Home';
import About from '../Components/About';
import Contact from '../Components/Contact';
import AxiosPage from '../Components/AxiosPage';
import Counter from '../Components/Counter';

function Routing(props){
    return (
        <div>
            <Routes>
                <Route path='/' element={<Home st={props.s}/>} />
                <Route path='/about' element={<About />} />
                <Route path='/contact' element={<Contact />} />
                <Route path='/axios_page' element={<AxiosPage />} />
                <Route path='/counter' element={<Counter />} />
            </Routes>
        </div>
    );
}

export default Routing;
