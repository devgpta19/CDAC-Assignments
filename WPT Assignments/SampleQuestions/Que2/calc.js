function show() {let a = document.querySelector("#num1").value;
let res;
for(let i=1;i<11;i++){
    res = a*i;
    document.querySelector("#result").innerHTML += `${a} * ${i} = ${res} <br/>`;
}}
