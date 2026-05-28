let employees, info;

async function init(){
  let link = "https://ubiquitous-guacamole-wvrrvgg65qpf9j59-8500.app.github.dev"; //replace with your Dev URL
  let route= "/employees";

  info = await fetch(link+route);
  employees = await info.json();

  generateCards(employees);
}

function generateCards(employees){
  // Display info as a Modal
  let mainpanel = document.getElementById("centerpanel");
  mainpanel.innerHTML = ""; //clear out the container

  // initialize strings for modal text and HTML content
  let text ="";
  let content ="";
   
  for(let i=0; i<employees.length; i++){
    let employee = employees[i]
    // create HTML for Modal text
    text  = `<div class="card" >`
    text += `<h3> Employee ID : ${employee.EmployeeId}</h3>`;
    text += `<div> First Name : ${employee.FirstName}</div>`;
    text += `<div> Last Name : ${employee.LastName}</div>`;
    text += `<hr>`;
    text += `</div>`;
    // create HTML for Modal content
    content  = `<div class="card" >`
    content += `<p> City : ${employee.City}</p>`;
    content += `<img src="cities/${employee.City}.PNG">`;
    content += `<hr>`;
    content += `</div>`;
     // create Modal object while passing text & content
    let modal = new Modal(text,content);
    modal.render("centerpanel"); // render Modal in container
  }  
}

function filter(){
  let city = document.getElementById("city").value;
  console.log(city);

  let newEmployees = []; //create a list to add employees to
  
  for(let i=0; i<employees.length;i++){
    let employee = employees[i] //get each employee
    
    if( employee.City == city ) {
          //add to the list
          newEmployees.push(employee);
    }
  }
  
  console.log(`number found ${newEmployees.length}`)
  generateCards(newEmployees);  
}