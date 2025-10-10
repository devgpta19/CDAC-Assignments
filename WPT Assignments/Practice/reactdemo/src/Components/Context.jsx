// import React, { useContext } from 'react'

const Context = (props) => {
  // const count = useContext(UserContext);

  return (
    <div style={{backgroundColor:"red", padding:10}}>
      <h2>From Context FC</h2>
      <h1>{props.value}</h1>
    </div>
  );
};

export default Context;
