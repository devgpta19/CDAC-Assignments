// use middleware app.use and check   
// set data in request object and  display that data in next method

let express = require('express');
let app = express();
let port = 8300;

// middleware 'use'
app.use((req, res, next) => {
    console.log("Time:", Date.now());
    console.log("Time: " + new Date().toLocaleString());

    next();
    // res.send("hiii");
})

app.get('/Next',(req,res)=>{
    res.send("Hello i am from Next")
})
app.listen(port);
console.log(`Server is running on port http://localhost:${port} `)
