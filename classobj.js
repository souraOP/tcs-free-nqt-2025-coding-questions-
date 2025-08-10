// // const employee = {
// //     calcTax() {
// //         console.log("tax rate is 10%");
// //     },
// // };

// // const soura = {
// //     salary: 50000,
// //     calcTax(){
// //         console.log("tax rate is 7%");
// //     },
// // };

// // const soura2 = {
// //     salary: 50000,
// // };

// // const soura3 = {
// //     salary: 50000,
// // };

// // const soura4 = {
// //     salary: 50000,
// // };

// // soura.__proto__ = employee;
// // soura2.__proto__ = employee;
// // soura3.__proto__ = employee;
// // soura4.__proto__ = employee;

// // class BMWCar{
    
// //     start(){
// //         console.log("start");
// //     }

// //     stop(){
// //         console.log("stop");
// //     }
// //     // setBrand(brand){
// //     //     this.brand = brand;
// //     // }

// //     //whenever create a class the constructor will be create
// //     constructor(brand, mileage){
// //         console.log("creating a new object");
// //         this.brand=brand;
// //         this.mileage = mileage;
// //     }
// // }

// // let m3Car = new BMWCar("Mustang");
// // console.log(m3Car);
// // console.log(m3Car.start());
// // // console.log(m3Car.m3Car);


// // class Parent {
// //     hello() {
// //         console.log("hello");
// //     }
// // }

// // class Child extends Parent {
    
// // }

// // let obj = new Child();
// // obj.hello();

// class Person{
//     constructor(name){
//         this.species= "This is a homo sapien species.\nbeware of strangers since stranger is danger.";
//         this.name = name;
//     }
//     eat(){
//         console.log("Eating");
//     }
//     sleep(){
//         console.log("Sleeping");
//     }
// }

// // class Engineer extends Person{
// //     work(){
// //         console.log("Solve problems");
// //     }
// // }

// class Doctor extends Person{
//     work() {
//         console.log("Treat Patients");
//     }
// }

// // let souraObj = new Engineer();
// // let doctorObj = new Doctor();
// // console.log(doctorObj);
// // doctorObj.sleep();

// // if child and parent have same method childs method will be use
// // Method Overriding

// // super keyword is used to call the constructor of its parent class
// // to access the parents properties and methods

// /*
//     super(args)
//     super.parentMethod(args)
// */

// class Engineer extends Person {
//     constructor(name){
//         // console.log("child constructor");
//         super(name); // to invoke the parent class constructor
//         // this.branch = branch;
//         // console.log("Exit child")

//         // this.name = name;
//     }
//     work(){
//         super.eat();
//         console.log("solve problems, build something");
//     }
// }

// let engObj = new Engineer("mechanical engg");
// console.log(engObj);
// engObj.work();

let nigger_data = "diddyparty423@oil";

class User{
    constructor(name, email){
        this.name = name;
        this.email = email;
    }

    viewData() {
        console.log("Data = ", nigger_data);
    }
}

class Admin extends User{
    constructor(name, email){
        super(name, email);
    }
    editData(){
        nigger_data = 'Chut marani magi';
    }
}

let student1 = new User("Sourasish", "soura@gmail.com");
let student2 = new User("Ankita", "ankita@gmail.com");
let admin1 = new Admin("Khanki", "magi@gmaol.com");
student1.viewData();
admin1.viewData();
admin1.editData();
console.log(admin1);
admin1.viewData();
console.log("a+b=", 10+23);
