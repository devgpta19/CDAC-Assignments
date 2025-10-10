import { BrowserRouter, Route, Routes } from 'react-router'
import Home from '../Comonents/Home'
import SignUp from '../Comonents/SignUp'
import ShowData from '../Comonents/ShowData'

const RoutersRouting = () => {
    return (
        <BrowserRouter>
            <Routes>
                <Route path="/" element={<Home />} /> | 
                <Route path="/signup" element={<SignUp />} /> | 
                <Route path="/showDets" element={<ShowData />} /> | 
            </Routes>
        </BrowserRouter>
    )
}

export default RoutersRouting