var numArr = [10, 20, 30, 40, 50];
console.log(numArr.length);
//Simple for loop
for (var i = 0; i < numArr.length; i++) {
    console.log(numArr[i]);
}
console.log("--------------For Each Loop-------------------");
//For each loop
numArr.forEach(function (ele) {
    console.log(ele);
});
console.log("----------------For In Loop-----------------");
//for....in loop
for (var i in numArr) {
    console.log(numArr[i]);
}
;
console.log("----------------For Of Loop-----------------");
//for....of loop
for (var _i = 0, numArr_1 = numArr; _i < numArr_1.length; _i++) {
    var e = numArr_1[_i];
    console.log(e);
}
;
