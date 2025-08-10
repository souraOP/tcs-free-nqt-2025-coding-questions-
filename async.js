// function nigger(){
//     console.log("hello");
// }

// setTimeout(nigger, 2000);

// console.log("one");
// console.log("two");

// setTimeout(() => {
//     console.log("Nigger");
// }, 2000); // Async coding

// console.log("three");
// console.log("four");


// function sum(a, b){
//     console.log(a + b);
// }

// function calculator(a, b, sumCallBack){
//     sumCallBack(a, b);
// }

// calculator(1, 2, sum);

// calculator(1,2, (x, y) => {
//     console.log(x + y);
// });


// let age = 19;
// if(age >= 18){
//     if(age >= 60){
//         console.log("senior");
//     } else {
//         console.log("middle");
//     }
// } else{
//     console.log("child");
// }


// for(let i = 0; i < 5; i++){
//     let str1 = "";
//     for(let j=0; j < 5; j++){
//         str1 += j;
//     }
//     // if(i != 4){
//     //     console.log("\n");
//     // }
// }


// function getData(dataId, getNextData){
//     setTimeout(() => {
//         console.log("data", dataId);
//         if(getNextData){
//             getNextData();
//         }
//     }, 2000);
// }


// // callback hell 
// console.log("Getting data 1");
// getData(1, () =>{
//     console.log("Getting data 2");
//     getData(2, () => {
//         console.log("Getting data 3");
//         getData(3, () => {
//             console.log("Getting data 4");
//             getData(4);
//         });
//     });
// });


// let promise = new Promise((resolve, reject) => {
//     console.log("Im a promise nigga");
//     resolve("success");
// });

// console.log(promise);
// console.log(typeof promise);

// function getData(dataId, getNextData){
//     return new Promise((resolve, reject) => {
//         setTimeout(() => {
//             console.log("data", dataId);
//             resolve("success");
//             if(getNextData) {
//                 getNextData();
//             }
//         }, 2000);
//     });
// }

// let result = getData(344);

// const getPromise = () => {
//     return new Promise((resolve, reject) => {
//         console.log("I am a promise");
//         // resolve("success nigga");
//         reject("FUCK !");
//     });
// };

// let promise = getPromise();
// // fulfillinf the promise, if resolved
// promise.then((res) => {
//     console.log("Promise fulfilled", res);
// });

// promise.catch((err) => {
//     console.log("Promise not fulfilled", err);
// });

// function asyncFunc1() {
//     return new Promise((resolve, reject) => {
//         setTimeout(() => {
//             console.log("Data 1"); //3
//             resolve("Data 1 resolved!"); //4
//         }, 2000);
//     });
// }

// function asyncFunc2() {
//     return new Promise((resolve, reject) => {
//         setTimeout(() => {
//             console.log("Data 2"); //3
//             resolve("Data 2 resolved!"); //4
//         }, 5000);
//     });
// }

// console.log("Fetching data 1"); //1
// let p1 = asyncFunc1(); // 2
// p1.then((res) => {
//     console.log(res); //5
// })

// console.log("Fetching data 2"); //1
// let p2 = asyncFunc2(); // 2
// p1.then((res2) => {
//     console.log(res2); //5
// })



// PROMISE CHAINING
// console.log("Fetching data 1"); //1
// let p1 = asyncFunc1(); // 2
// p1.then((res) => {
//     console.log(res); //5
//     console.log("Fetching data 2");
//     let p2 = asyncFunc2();
//     p2.then((res) => {
//         console.log(res);
//     });
// });

// BETTER WAY TO WRITE PROMISE CHAINING

// console.log("Fetching data 1"); //1
// asyncFunc1().then((res) => {
//     console.log(res); //5
//     console.log("Fetching data 2");
//     asyncFunc2().then((res) => {
//         console.log(res);
//     });
// });


function getData(dataId){
    return new Promise((resolve, reject) => {
        setTimeout(() => {
            try{
                console.log("Data: ", dataId);
                resolve("les fxking go");
            } catch {
                reject("Rejected");
            }
        }, 5000);
    });
}

// getData(1).then((res) => {
//     return getData(2);
// }).then((res) => {
//     console.log(res);
// });


// ASYNC AND AWAIT
async function hello1(){
    console.log("hello");
}

function api(){
    return new Promise((resolve, reject) => {
        setTimeout(() => {
            console.log("weather data");
            resolve(200);
        }, 2000);
    });
}

async function getWeatherData() {
    await api();
    await api();
}

// async function getAllData(){
//     console.log("getting data1...");
//     await getAllData(1);
//     console.log("getting data2...");
//     await getAllData()
// }

(async function (){
    console.log("getting data1....");
    await getData(1);
    console.log("getting data2...");
    await getData(2);
    console.log("getting data3...");
    await getData(3);
})();

getWeatherData();