// using hbs module -  Display Dynamic HTML page 

// 	calc.hbs   -  accept 2 numbers and display output 

//   npm install hbs --- to get hbs module 



let express = require('express');
let bodyParser = require('body-parser');
const path = require('path');
let hbs = require('hbs');
let app = express();    
let port = 8080;
// let p = require('path')

app.set('view engine', 'hbs');
app.set('views', './views');
app.set('views', path.join(__dirname, 'views'));

app.get('/', (req,res)=>{
    res.send("Welcome")
})

app.use(bodyParser.urlencoded({ extended: false }));

app.get('/calculate', (req,res)=>{
    res.render('calc');
})

app.post('/calculate', (req,res)=>{
    
    let num1 = parseFloat(req.body.num1);
    let num2 = parseFloat(req.body.num2);
    let result = num1 + num2;
    res.render('calc',{result});

})

app.listen(port);
console.log(`Server is runnuing on port http://localhost:${port} `)

