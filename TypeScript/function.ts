function add(x: number, y: number): number{
    return x+y;
}

let c = add(10, 35);
console.log("Result is "+c);

//functions with type inferrence
function add1(x,y){
    var v: number = 10
    return x+y;
}

let d: number = add1(1.2, 3.8);
console.log("Sum is "+d);