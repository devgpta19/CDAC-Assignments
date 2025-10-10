import { Link } from "react-router-dom";

const Home = () => {
  return (
    <div>
      <h1>Welcome to Home Page</h1>
      <h3>You are now able to go to following pages.</h3>
      <nav>
        <Link to={"/"}> Home </Link> | 
        <Link to={"/signup"}> SignUp </Link> | 
        <Link to={"/showDets"}> Show Data </Link>  
      </nav>
    </div>
  );
};

export default Home;