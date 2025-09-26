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

app.delete('/users/delete/:id', (req, res) => {
    const id = Number(req.params.id);  // 15
    // console.log(id);
    const userIndex = users.findIndex(user => user.id === id)
    if (userIndex === -1)
        return res.status(404).send('Data not found');

    const deletedItem = users.splice(userIndex, 1);
    res.json(deletedItem);
})

app.listen(port)


console.log(`Server Running at : http://localhost:${port}`)


