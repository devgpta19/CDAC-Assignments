import { useState } from "react";
import Graduate from "./Graduate.jsx";
import PostGraduate from "./PostGraduate.jsx";
import UnderGraduate from "./UnderGraduate.jsx";

function StudentForm() {
  const [selectOption, setSelectOption] = useState("");

  function optionHandler(e) {
     if (selectOption === "G") return <Graduate />;
    if (selectOption === "PG") return <PostGraduate />;
    if (selectOption === "UG") return <UnderGraduate />;
    return null;
  }

  function AddtoSelectOptions(e) {
    setSelectOption(e.target.value);
  }

  return (
    <>
      <div className="main">
        <div className="main_container">
          <div className="inner_container">
            <form action="./submitPage">
              <label htmlFor="fname"> Enter Your Full name</label>
              <input type="text" name="fname" id="name" />
              <br />
              <label htmlFor="email"> Enter Your E-mail</label>
              <input type="email" name="email" id="email" />
              <br />
              <label htmlFor="dropdown"> Enter Your Full name</label>
              <div>
                <select
                  name=""
                  value={selectOption}
                  onChange={(e) => {setSelectOption(e.target.value)}}
                  id="selectField"
                >
                  <option value="">--SELECT--</option>
                  <option value="G" className="option1">
                    Graduate
                  </option>
                  <option
                    value="PG"
                    className="option2"
                    onClick={AddtoSelectOptions}
                  >
                    Post Graduate
                  </option>
                  <option value="UG" className="option3">
                    Under Graduate
                  </option>
                </select>
              </div>
              <br />
            </form>
            <div id="render" >{optionHandler()}</div>
          </div>
        </div>
      </div>
    </>
  );
}

export default StudentForm;
