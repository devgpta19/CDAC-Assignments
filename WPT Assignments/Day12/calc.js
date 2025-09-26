function calculate(a,b){
return a+b;
}

function calculate1(a,b){
    return a-b;
}

function calculate2(a,b){
    return a*b;
}

function calculate3(a,b){
    return a/b;
}

 module.exports.add=calculate;
 module.exports.sub=calculate1;
 module.exports.mul=calculate2;
 module.exports.div=calculate3;