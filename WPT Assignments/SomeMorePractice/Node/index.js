// BASIC NODE SERVER

let http = require('http');
let url = require('url');
let path = require('path');
let fs = require('fs');
let port = 3330;

let app = http.createServer((req,res)=>{
    res.statusCode = 200;
    res.setHeader('Content-Type', 'text/html');
    res.end(
        '<h1>Server is on...</h1>'
    )
    try{
        if(req.url == '/'){
            res.end("<h1>Welcome to Home Page</h1>");
        } else if(req.url == '/about'){
            res.end("<h1>Welcome to About Page</h1>");
        }
    } catch(error) {
        console.error(`Error is ::: ${e}`)
    }
})
app.listen(port, ()=>console.log(`Server is running on http://localhost:${port}`));