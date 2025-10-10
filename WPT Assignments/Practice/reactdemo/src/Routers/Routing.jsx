import { BrowserRouter, Routes, Route } from "react-router-dom";
import Home from "../Components/Home";
import AboutUs from "../Components/AboutUs";
import Login from "../Components/Login";
import HomePage from "../Components/HomePage";

function Routing() {
  return (
    <BrowserRouter>
      <Routes>
        <Route path="/" element={<Home />} />
        <Route path="/home" element={<HomePage />} />
        <Route path="/about" element={<AboutUs />} />
        <Route path="/user/login" element={<Login />} />
      </Routes>
    </BrowserRouter>
  );
}

export default Routing;
