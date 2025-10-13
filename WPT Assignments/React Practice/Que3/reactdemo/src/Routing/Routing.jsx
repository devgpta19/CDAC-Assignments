import { Routes, Route } from 'react-router-dom'
import Home from '../Components/Home';
import Demo from '../Components/Demo';
import UseRef from '../Components/UseRef';
const Routing = () => {
    return (
        <Routes>
            <Route path='/' element={<Home />} />
            <Route path='/demo' element={<Demo />} />
            <Route path='/useref' element={<UseRef />} />
        </Routes>
    );
}

export default Routing;
