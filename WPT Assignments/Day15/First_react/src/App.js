import './App.css';
import Calculator from './components/Calculator';
import Factorial from './components/Factorial';
import CalculatorTwo from './components/CalculatorTwo.jsx';
import ClassLower_Uppercase from './components/ClassLower_Uppercase.jsx'

function App() {
  return (
    <div className="App">
      <header className="App-header">
        {/* <Factorial/>
        <Calculator/>
        <CalculatorTwo/> */}
        <ClassLower_Uppercase/>
      </header>
    </div>
  );
}

export default App;
