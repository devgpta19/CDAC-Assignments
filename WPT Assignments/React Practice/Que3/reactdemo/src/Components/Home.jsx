import React from 'react';
import { Link } from 'react-router-dom'
import Routing from '../Routing/Routing';
const Home = () => {
    return (
        <div>

            <Routing />
            <nav>
                <Link to='/'>Home</Link>
                <Link to='/demo'>Demo</Link>
                <Link to='/useref'>UseRef</Link>
            </nav>

        </div>
    );
}

export default Home;
