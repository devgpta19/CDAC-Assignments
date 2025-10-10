import { Link } from "react-router-dom";

const Home = () => {
  return (
    <div>
      <h1>Welcome to Home Page</h1>
      <h3>You are now able to go to following pages.</h3>
      <nav>
        <Link to="/home">Home</Link> | <Link to="/about">About</Link> |{" "}
        <Link to="/user/login">Login</Link>
      </nav>
    </div>
  );
};

export default Home;
