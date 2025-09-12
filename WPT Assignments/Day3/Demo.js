// Write a function getFactorialImpl ( choice="FORLOOP" ) ----it could be FORLOOP or RECUR
// 	Function Fact2(n1)
// 	Use recursion and print the factorial
// 	If the choice is FORLOOP return Fact1
// 	If the choice is RECUR then return Fact2
// 	Outside --- call let rv = getFactorialImpl("RECUR")
// 	rv(3)
// 	Rv = getFactorialImpl()
// 	rv(5)


// var x = 5;
// console.log("Your No. is :"+x);
// let m=1
// function Fact2(x) {
//     for(let i=1;i<=x;i++){

//         m=m*i;
//     }

//     console.log("Factorial of " +x+" is : "+m);
// }
// Fact2(x);


var x;
function Factorial(x) {
    if (x === 0) return 1;
    else {
       return x * Factorial(x - 1);
    }
}
console.log(Factorial(5));




