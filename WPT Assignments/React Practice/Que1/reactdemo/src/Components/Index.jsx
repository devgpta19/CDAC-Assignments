import axios from "axios";
import { useState } from "react";

const Index = () => {
  const [val, setVal] = useState([]);      // ✅ must be array for map
  const [loading, setLoading] = useState(false);
  const [error, setError] = useState("");

  // Fetch API on button click
  const fetchAPI = async () => {
    setLoading(true);    // show loading immediately
    setError("");        // clear previous error
    try {
      const res = await axios.get("https://jsonplaceholder.typicode.com/users");
      setVal(res.data);  // save fetched data
    } catch (err) {
      setError("Error: " + err.message);
    } finally {
      setLoading(false); // hide loading after fetch finishes
    }
  };

  return (
    <div style={{ textAlign: "center", marginTop: "50px" }}>
      <h2>👥 User List (Fetched with Axios)</h2>

      <button onClick={fetchAPI} style={{ padding: "10px 20px", marginBottom: "20px" }}>
        Fetch Users
      </button>

      {/* Show Loading when fetching */}
      {loading && <p>Loading...</p>}

      {/* Show error if it occurs */}
      {error && <p style={{ color: "red" }}>{error}</p>}

      {/* Render user list */}
      <ul style={{ listStyle: "none", padding: 0 }}>
        {val.map((user) => (
          <li key={user.id} style={{ margin: "5px 0" }}>
            <strong>{user.name}</strong> — {user.email}
          </li>
        ))}
      </ul>
    </div>
  );
};

export default Index;
