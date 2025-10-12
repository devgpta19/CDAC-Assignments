import React, { useState } from 'react';
import StudentDets from './StudentDets';

const StudentForm = () => {

    const [fname, setFname] = useState('');
    const [email, setEmail] = useState('');
    const [pass, setPass] = useState('');

    let fn, em, pa;
    function fnameTarget(e) {
        fn = e.target.value
    }
    function emailTarget(e) {
        em = e.target.value
    }
    function passTarget(e) {
        pa = e.target.value
    }

    function submitHandler(e) {
        e.preventDefault();
        setFname(fn);
        setEmail(em);
        setPass(pa);
    }

    
    return (
        <div>
            <input type="text" onChange={fnameTarget} id='name' />
            <input type="text" onChange={emailTarget} id='email' />
            <input type="text" onChange={passTarget} id='password' />
            <button type='submit' id='submitBtn' onClick={submitHandler}>Submit</button>
            <div style={{ border: "5px solid black", height: "250px", width: "600px" }}>
                <StudentDets n={fname} e={email} p={pass} />
            </div>
        </div>

    );
}

export default StudentForm;
