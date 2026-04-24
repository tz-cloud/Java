
let employees;
function init(){
  $.ajaxSetup({async: false});
  
  let link = "https://Lesson48ClassworkDBServer.ernestoporchett.repl.co";
  let route= "/employees"
  employees = $.getJSON(link+route).responseJSON;

  generateCards(employees);

  
}

function generateCards(employees){

  let output = document.getElementById("output");
  let build ="";

   
  for(let i=0; i<employees.length; i++){
    let employee = employees[i]
    build += `<div class="card" >`
    build += `<h3> Employee ID : ${employee.EmployeeId}</h3>`;
    build += `<div> First Name : ${employee.FirstName}</div>`;
    build += `<div> Last Name : ${employee.LastName}</div>`;
    build += `<p> City : ${employee.City}</p>`;
    build += `<hr>`;
    build += `</div>`;
  }

  output.innerHTML = build;

}

function filter(){
  let city = document.getElementById("city").value;

  let newEmployees = [];

  for(let x = 0; x <employees.length; x++){
    let employee = employees[x];
    if(employee.City == city){
      newEmployees.push(employee);
    }
  }
  console.log(`number found${newEmployees.length}`)
  generateCards(newEmployees);
}
