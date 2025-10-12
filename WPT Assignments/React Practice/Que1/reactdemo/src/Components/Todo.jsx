import React, { useState } from 'react';

const Todo = () => {

    const [todo, setTodo] = useState([]);
    const [data, setData] = useState('');

    function inputHandler(e) {
        setData(e.target.value);
    }

    function submitHandler() {
        if (data.trim() !== "") {
            setTodo([...todo, data]);
            setData("");
        }
    }

    function completed(itemToRemove) {
        const newTodo = [...todo]; 

        const indexToRemove = newTodo.findIndex(item => item === itemToRemove);
        
        if (indexToRemove !== -1) {
            newTodo.splice(indexToRemove, 1);
            setTodo( );
        }
    }

    return (
        <div>
            <h1>Todo List</h1>
            <input type="text" value={data} onChange={inputHandler} />
            <button type='submit' onClick={submitHandler}>Submit</button>
            {todo.map((item, key) => (
                <div key={key} style={{ display: "flex", gap: "8px", alignItems: "center" }}>
                    <h5>{key + 1}. {item}</h5>
                    <button onClick={() => completed(item)}>Completed</button>
                </div>
            ))}
        </div>
    );
}

export default Todo;