let data,customers;
async function init(){
  
  let link = "https://opulent-memory-g479qpvjg4vrfwq59-8500.app.github.dev";

  let route= "/customers"
  let info = await fetch(link+route);
  customers = await info.json();

  generateCards(customers);

  
}
function generateCards(customers){

  let output = document.getElementById("output");
  let build ="";

   
  for(let i=0; i<customers.length; i++){
    let customer = customers[i];
    build += `<div class="card" >`
    build += `<h3> Customer ID : ${customer.CustomerId}</h3>`;
    build += `<div> First Name : ${customer.FirstName}</div>`;
    build += `<div> Last Name : ${customer.LastName}</div>`;
    build += `<div> Country : ${customer.Country}</div>`;
    build += `<p> Email : ${customer.Email}</p>`;
    build += `<img src='countries/${customer.Country}.PNG'>`;
    build += `<hr>`;
    build += `</div>`;
  }

  output.innerHTML = build;

}

function filter(){
  let country = document.getElementById("country").value;

  let newCustomers = [];

  for(let x = 0; x <customers.length; x++){
    let customer = customers[x];
    if(customer.Country == country){
      newCustomers.push(customer);
    }
  }
  console.log(`number found${newCustomers.length}`)
  generateCards(newCustomers);

}