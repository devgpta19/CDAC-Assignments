import { useState } from "react"
import { Link } from "react-router";

const SignUp = () => {
  let [fname, setFname] = useState('')
  let [email, setEmail] = useState('');
  let [pass, setPass] = useState('');

  let [dets, setData] = useState({});
  function clickHandler() {
    setData({
      Fname : fname,
      Email : email,
      Password : pass
    })
  }
  return (
    <>
      <div>
        <h1>SignUp Form</h1>
        Name : <input type="text" onChange={setFname((e)=>e.target.value)} />
        Email : <input type="email" onChange={setEmail((e)=>e.target.value)} />
        Password : <input type="password" onChange={setPass((e)=>e.target.value)} />
      </div>

      <button type="submit" onClick={clickHandler}>
        Submit
      </button>

      <Link to={"/showDets"}>Show Data</Link>

    </>
  )
}

export default SignUp
