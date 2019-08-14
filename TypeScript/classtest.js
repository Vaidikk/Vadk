var Student = /** @class */ (function () {
    function Student(rollNo, name) {
        this.rollNo = rollNo;
        this.name = name;
    }
    Student.prototype.display = function () {
        console.log(this.rollNo + " " + this.name);
    };
    return Student;
}());
var ob = new Student(12, "Danny");
ob.display();
