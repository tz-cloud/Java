
let employees;
async function init(){
  
  let link = "https://raw.githubusercontent.com/PorchettaEP/JSONFILES/refs/heads/main";
  let route= "/employees"

  let info = await fetch(link+route);
  employees = await info.json();

  generateCards(employees);
}

function generateCards(){
  window.onload = function (){  

  let back="";
  let front="";
  
  for(let i=0; i<employees.length; i++){
    let employee = employees[i];

    front = `<h2>${employee.EmployeeId}</h2>`;
    front+= `<h2>${employee.FirstName}</h2>`;
    front+= `<h2>${employee.LastName}</h2>`;
    front+= `<p>${employee.Email}</p>`;

    back = `${employee.City}`
    back+= `<img src='cities${employee.City}.PNG'>`;
    back+= `<hr>`;

    card = new FlipCard(front,back);
    card.render("mainpanel");
      }

    }
  }

function filter(){
  let city = document.getElementById("city").value;
  console.log(city);

  let newEmployees = []; //create a list of songs searched for
  
  for(let i=0; i<employees.length;i++){
    let employee = employees[i] //get each sog
    //make sure the list is no
    if( employee.City == city ) {
          //add to the new list
          newEmployees.push(employee);
       }
  }
  console.log(`number found ${newEmployees.length}`)
  generateCards(newEmployees);
  
}
