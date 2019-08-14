var Color;
(function (Color) {
    Color[Color["Red"] = 0] = "Red";
    Color[Color["Green"] = 1] = "Green";
    Color[Color["Blue"] = 2] = "Blue";
})(Color || (Color = {}));
var c = Color.Green;
console.log(c);
//Enum with different starting index
var Days;
(function (Days) {
    Days[Days["Mon"] = 2] = "Mon";
    Days[Days["Tue"] = 3] = "Tue";
    Days[Days["Wed"] = 4] = "Wed";
})(Days || (Days = {}));
var d = Days.Mon;
console.log(d);
//To print the color name
var dayName = Days[2];
console.log(dayName);
for (var e in Days) {
    console.log(Days[e]);
}
;
