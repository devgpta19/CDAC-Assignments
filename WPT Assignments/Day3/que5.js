// 5) write a function that multiplies two numbers and returns the value
// multiplies all elements of array

let arr = [20,30,56,44,21];
let m=1;
function Fact2(){
    arr.forEach((e)=>{
        m=m*e;
    })
}
Fact2();
console.log("Multiplay of all elements in  an array"+m);