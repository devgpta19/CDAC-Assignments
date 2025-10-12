import React from 'react';

const StudentDets = (props) => {
  return (
    <div>
      <h1>Name : {props.n}</h1>
      <h1>Email : {props.e}</h1>
      <h1>Password : {props.p}</h1>
    </div>
  );
}

export default StudentDets;
