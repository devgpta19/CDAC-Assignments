// 2) Understand the Node JS Architecture and understand 
// event loop execution by adding timer and promise concept 

// use below code 

// setImmediate(function A() {
// 	console.log("1st immediate");
// });



// process.nextTick(function C() {
// 	console.log("1st process");
// });



// // First event queue ends here
// console.log("program started");
// function A() {
//     console.log("Hi i am A()")
// }
// function C() {
//     console.log("Hi i am C()")
// }

// let p = new Promise((res, rej) => {
//     res();
//     rej();
// })

setImmediate(function A() {
    console.log("1st immediate");
});
process.nextTick(function C() {
    console.log("1st process");
})
console.log("Program Started");
// p.then(

// )

