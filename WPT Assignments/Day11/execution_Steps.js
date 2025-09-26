console.log("hello");
setTimeout(()=> console.log("Timeout"));
console.log("Next");
new Promise ((resolved)=>{ console.log("Promise resolved")})