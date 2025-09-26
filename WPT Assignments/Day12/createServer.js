// 1) in http server pass data as query parameter 
//   and use that data to display on HTML Page 
//   fName=ABC&lName=XYZ
//     o/p Hello <fName>

const h = require('http');
const url = require('url');

const s = h.createServer(function(req,res){
    console.log(req.headers);
    console.log(req.url.query);
    let link = req.url;
    let data = url.parse(link,true).query;
    console.log(link);
    console.log(data);
    res.write("Hello from Server");
    res.end();

});  
s.listen(8080);