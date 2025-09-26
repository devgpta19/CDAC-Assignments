// 1)  accept 2 numbers from user 
//   and perform multiplication 

//   using promise concept perform multiplication if both number 
//   are positive else reject the promise

function multiplication(a, b) {
    if (a % 2 == 0 && b % 2 == 0) {
        console.log("HEHE")
        let p = new Promise((res, rej) => {
            let c = a * b;
            res();
            rej();
            console.log("Multiplication: "+c)
        }
    )
    p.then(
        function(value){
            console.log("Code is working")
        },
        function(error){
            console.log(error);
        }

    )
}
else{
    if (a % 2 != 0)
        console.log(a+" is not even")
    else
        console.log(b+" is not even")
}
}
multiplication(parseInt(process.argv[2]), parseInt(process.argv[3]));

