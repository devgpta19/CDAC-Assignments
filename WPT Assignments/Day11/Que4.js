// 4) Write a Node program that prints all the numbers between 1 and 100, each on a separate line.
// A few caveats:
// o if the number is divisible by 3, print "foo"
// o if the number is divisible by 5, print "bar"
// o if the number is divisible by both 3 and 5, print "foobar"

function Display() {
    for (let i = 1; i < 100; i++) {

        if (i%3==0) {
            if(i%5==0){
                console.log(i+": foobar")
            }
            else{
            console.log(i+": foo");
            }
            // break;
        }
        else if (i%5==0) {
            console.log(i+": bar");
            // break;
        }
        else {
            console.log(i+": Invalid Number");
        }
    }
}

console.log(Display());