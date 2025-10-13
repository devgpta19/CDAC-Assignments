import React, { useEffect, useState } from 'react';
import axios from 'axios'
function AxiosPage() {

    const [val, setVal] = useState([]);      // ✅ must be array for map
    const [loading, setLoading] = useState(false);
    const [error, setError] = useState("");


    useEffect(() => {
        setLoading(true);
        setError("");
        async function fetchAPI() {
            try {
                const res = await axios.get('https://jsonplaceholder.typicode.com/users')
                setLoading(false);
                setVal(res.data);
            } catch (err) {
                setError("Error : " + err.message);
            }
        }

        fetchAPI();
    }, [])

    if (loading) return <h2>Loading...</h2>
    if (error) return <h2>Error...</h2>

    return (
        <div>
            <h1>Welcome to Axios Page</h1>
            {val.map((value, index) => {
                return (
                    <h4>{index+1} {value.name}</h4>
                )
            })}
        </div>
    );
}

export default AxiosPage;
