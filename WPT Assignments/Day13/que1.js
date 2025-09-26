// const user = require('./c:\Users\IET\Downloads\MOCK_DATA.json')


//Import JSON file
const users = require('./MOCK_DATA.json')

// Import Express from NodeModules
const exp = require('express')

const app = exp()

//Port No.
const port = 3000;

app.get('/', (req,res)=>{
    res.send("<h1>Hello from Expess</h1>")
})

app.get('/users/', (req, res) => {
    res.json(users)
})

// Get the ID from user in url
app.get('/users/ID/:id', (req, res) => {
    let id = Number(req.params.id);
    const user = users.find(user => user.id === id)
    res.json(user)
})

// Get the Name from user in url
app.get('/users/name/:first_name', (req, res) => {
    let name = req.params.first_name;
    const user_name = users.find( user => user.first_name.toLowerCase() === name)
    res.json(user_name)
})

app.post('/users/add', (req, res) => {
    const newUser = req.body
    users.push(newUser)
    res.status(201).json({
        message: "User added successfully",
        user: newUser
    })
})
    

app.listen(port)


console.log(`Server Running at : http://localhost:${port}`)


