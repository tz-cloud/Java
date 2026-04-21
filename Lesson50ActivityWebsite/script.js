let songs;
async function init(){
  
  let link = "https://opulent-memory-g479qpvjg4vrfwq59-8500.app.github.dev"; 
  // link is from the port that is running the DB server
  let route = "/songs";
  // the route link already has a / in front so we take it out of route
	info = await fetch(link+route);
  	songs = await info.json();

	generateCards(songs);
}

function generateCards(songs){
	let output = document.getElementById("output");
	let bld = "";

	for(let x = 0; x < songs.length; x++){
		let song = songs[x];
		bld += `<div class="card" >`;
    	bld += `<h2> Song Name </h2>`;
    	bld += `<p> ${song.Name}</p>`;
    	bld += `<div> Album </div>`;
    	bld += `<p> ${song.Title} </p>`;
    	bld += `<div> Composer </div>`;
    	bld += `<p> ${song.Composer}</p>`;
    	bld += `<hr>`;
    	bld += `</div>`;
	}
	output.innerHTML = bld;
}





