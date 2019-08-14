let numArr: number[]= [10,20,30,40,50];

console.log(numArr.length);

//Simple for loop
for(let i=0; i<numArr.length; i++){
    console.log(numArr[i])
}
console.log("--------------For Each Loop-------------------")
//For each loop
numArr.forEach(ele=>{
    console.log(ele);
});

console.log("----------------For In Loop-----------------")
//for....in loop
for(let i in numArr){
    console.log(numArr[i]);
};

console.log("----------------For Of Loop-----------------")
//for....of loop
for(let e of numArr){
    console.log(e);
};