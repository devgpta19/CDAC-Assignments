function fetchData(callback){
    console.log("Data is:", process.argv)
    let a = parseInt(process.argv[2], 10);

    for(let i=1; i<11; i++){
        console.log(i*a);
    }
}
fetchData();