class Student{
    rollNo: number;
    name: string;
    constructor(rollNo:number, name:string){
        this.rollNo=rollNo;
        this.name=name;
    }

    display():void{
        console.log(this.rollNo + " " + this.name)
    }
}

let ob: Student = new Student(12, "Danny");
ob.display();