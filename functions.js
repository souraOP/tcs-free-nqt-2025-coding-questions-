// const mysum1 = (x, y) => {
//     return x + y;
// };

// console.log(mysum1(3, 4));


// const myMult = (a, b) => {
//     return a * b;
// };

// const printHello = () => {
//     console.log("Heelo");
// };

// printHello();

// console.log("\n");

// function getVowel(str){
//     let countVowel = 0;
//     for(let char of str){
//         // console.log(char);
//         if(char === "a" || char === "e" || char === "i" || char === "o" || char === "u"){
//             countVowel++;
//         }
//     }
//     return countVowel;
// }

// console.log(getVowel("Sourasish"));

function abc(){
    console.log("Hello");
}


function myFunc(abc){
    return abc;
}

console.log(myFunc());

let arr = [1,2,3,4,5];

arr.forEach(function myVal(val){
    console.log(val);
});

let cities = ["pune", "mumbai", "kolkata"];
console.log("\n");
cities.forEach((val, idx, cities) => {
    console.log(val.toUpperCase(), idx, cities);
});

let calculateSquare = (num) => {
    console.log(num * num);  
};

arr.forEach(calculateSquare);

// Map method 