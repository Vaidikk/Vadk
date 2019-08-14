enum Color {Red, Green, Blue}
let c: Color = Color.Green;
console.log(c);

//Enum with different starting index
enum Days {Mon = 2, Tue, Wed}
let d: Days = Days.Mon
console.log(d)

//To print the color name
let dayName: string = Days[2];
console.log(dayName)

for(let e in Days){
    console.log(Days[e]);
};