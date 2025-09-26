let express = require('express');
let app = express();
let port = 8080;
let p = require('path')

app.get('/', (req,res)=>{
    res.send("Welcome")
})

app.get('/aboutus', (req,res)=>{
    const t = p.join(__dirname, "./views/aboutus.html")
    console.log(t);
    res.sendFile(t);
})

app.listen(port);
console.log(`Server is runnuing on port http://localhost:${port} `)