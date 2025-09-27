import { useEffect, useState } from "react";

function MyComponent({ color }) {
  const [currentcolor, setCurrentColor] = useState("red");

  useEffect(() => {
    setCurrentColor(color);
  }, [color]);

  useEffect(() => {
    console.log("Component did Mount");
  }, []);

  return (
    <div className="main">
      <h1>Predefined Render Method</h1>
      <div className="main_container">
        <h2>Color is {currentcolor}</h2>
      </div>
      <div className="inner_container"></div>
    </div>
  );
}
export default MyComponent;
