// Fetch API -> interface for fetching (sending/receive) resources.

// It uses Request and Response objects.

// The fetch() method is used to fetch a resource (data).

// let promise = fetch(url, [options])

const cat_url = "https://cdn.animenewsnetwork.com/encyclopedia/api.xml?anime=4658";

// const getFacts = async () => {
//     console.log('getting data....');
//     let response = await fetch(cat_url);
//     console.log(response.status);
//     console.log(response);
//     let data = await response.json();
//     factPara.innerText = data[2].text;
// }
// getFacts();

// function getFactsPromiseChaining(){
//     fetch(cat_url).then((response) => {
//         return response.json();
//     }).then((data) => {
//         console.log(data);

//     });
// }

// MAXIMUM TIME FETCH API IS USED FOR GET REQUEST

// AJAX : Asynschoronous JS and XML

// AJAJ: Asynchronous JS and Json 

/*

1. Api requesst sent -> we get a response (json)

2. json response -> converted to JS object : for that we use the json() method

*/

 