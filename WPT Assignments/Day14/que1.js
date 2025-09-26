// 1) add post , delete  and     put     functionality in yesterday Rest API
//        add    remove        replace  

const userData = require('./MOCK_DATA.json');
const express = require('express');
const f = require('fs');
const { json } = require('stream/consumers');
const app = express();
const port = 3400;


app.get('/users/', (req, res) => {
    res.json(userData);
})

app.use(express.urlencoded({ extended: false }))

app.put('/users/replace/by_id/:id', (req,res)=>{
    const id = Number(req.params.id);
    const userIndex = userData.findIndex(user => user.id === id)
    const data = req.body;

    userData[userIndex] = {id:userIndex+1, ...data}
    console.log("Replace is Done")
    res.json(userData);

})

app.post('/users/addUser/', (req, res) => {
    const data = req.body;
    // console.log('data' + data.email);
    userData.push(
        {id:userData.length + 1, ...data} 
    )
    f.writeFile('./MOCK_DATA.json',
        JSON.stringify(userData), (err) => {
            console.error("The Error is :::: " + err);
        })
    console.log("Data Added")
    res.json(userData);
})


app.delete('/users/delete/:id', (req, res) => {
    const id = Number(req.params.id);
    console.log(id);
    const userIndex = userData.findIndex(user => user.id === id)
    if (userIndex === -1)
        return res.status(404).send('Data not found');

    const deletedItem = userData.splice(id, 1);
    res.json(deletedItem);
})

app.listen(port);
console.log(`Server Running at : http://localhost:${port}`)