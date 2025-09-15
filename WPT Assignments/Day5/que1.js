// 1) declare function calculate(...a) 
// 	and display addition of data 
// 	display only odd numbers from given data 

//   call calculate function with multiple parameters
// use Math.max() method to display maximum number
let add=0;
function calculate(...a){
    for(let i=0; i<a.length;i++)
    {
        add=add+a[i];
    }
    console.log("Addition of element is:"+add);

    for(let j=0; j<a.length; j++){
        if(a[j]%2===0){
            console.log("Even numbers are: "+a[j]);
        }
        else{
            console.log("Odd numbers are: "+a[j]);
        }
    }
    console.log("Max number is:"+Math.max(...a));
}

calculate(2,4,6,8,1);