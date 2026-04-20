
let data, songs, customers;
async function init(){
  
  let link = "https://opulent-memory-g479qpvjg4vrfwq59-8500.app.github.dev/"; 
	// link is from the port that is running the DB server
	let route = "customer";
	// the route link already has a / in front so we take it out of route
	info = await fetch(link+route);
  	data = await info.json();
	console.log(data);

	let output = document.getElementById(output);
	let bld = "";
  for(let x = 0; customers.length; x++){
		let customer = customers[x];
		bld += `<h3> Customer Id: ${customer.CustomerId} </h3>`;
		//case sensitive in java
		bld += `<div> Customer First Name: ${customer.FirstName} </div>`;
}
	output.innerHTML = bld;


 
}




