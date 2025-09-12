// 6) Write a function to divide two numbers and assign function to a variable


let x = (a,b)=>{
    return a/b;
}
console.log(x(2,10));





// 7) To Find max number from array write code in 3 ways as shown in lecture 

let arr = [34,20,10,33,67,90,120,80,1,6];
for(let i=0;i<arr.length;i++)
{
    let a=arr.sort((a,b)=>a-b);
}
console.log(arr[arr.length-1])