// 2) Write a Program to use Different Array Library Functions using switch case




let arr = [34, 20, 10, 33, 67, 90, 120, 80, 1, 6];
switch (30) {
    case 1: {
        let lst = arr.pop();
        console.log("✅After Removing the last element : " + arr);
        break;
    }

    case 2: {
        let fst = arr.shift();
        console.log("✅After Removing the First element: " + arr);
        break;
    }

    case 3: {
        arr.splice(1, 5);
        console.log("✅After Removing 5 elements starting from index 1: " + arr);
        break;

    }

    default: {
        console.log("😚 Sorry Out of cases 😅");
        break;
    }
}