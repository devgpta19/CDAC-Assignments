const http = require("http");
const server = http.createServer((req,res) => {
    res.writeHead(200,{'Content-Type':'text/plain'})
    res.end("This is the response\n")
});
server.listen(8080);