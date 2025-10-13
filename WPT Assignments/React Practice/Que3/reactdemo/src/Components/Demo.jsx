import React, { useEffect, useState } from 'react';
import axios from 'axios'
const Demo = () => {

    const [state, setState] = useState([]);
    const [loading, setLoading] = useState(true);

    useEffect(() => {
        async function fetchAPI() {

            try {
                const res = await axios.get("https://jsonplaceholder.typicode.com/users")
                setLoading(false);
                setState(res.data);
            } catch (err) {
                setLoading(false);
                setState("Error : " + err.message);
            }

        }

        fetchAPI();
    }, [])

    if (loading) return <h1>Loading...</h1>

    return (
        <div>
            <h1>Using Axios</h1>
            {
                state.map((d) => {
                    return (
                        <>
                            <h2>Name : {d.name}</h2>
                            <h3>ID : {d.id}</h3>
                            <br />
                        </>
                    )
                })
            }
        </div>
    );
}

export default Demo;
