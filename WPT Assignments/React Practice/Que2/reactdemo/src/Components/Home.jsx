import React from 'react';

const Home = (props) => {
  return (
    <div>
      <h1>Home Page</h1>
      <p>Welcome to the home Page</p>
      <h2>{props.st}</h2>
    </div>
  );
}

export default Home;
