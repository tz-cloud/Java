let data,customers;
async function init(){
  
  let link = "https://opulent-memory-g479qpvjg4vrfwq59-8500.app.github.dev";

  let route= "/songs"
  let info = await fetch(link+route);
  songs = await info.json();

  generateCards(songs);

  
}
function generateCards(songs){
	let output = document.getElementById("output");
	let bld = "";

	for(let i = 0; i < songs.length; i++){
		let song = songs[i];
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

function filter(){
  let name = document.getElementById("name").value;

  let newSong = [];

  for(let x = 0; x <songs.length; x++){
    let song = songs[x];
    if(song.Name == name){
      newSong.push(song);
    }
  }
  console.log(`number found${newSong.length}`)
  generateCards(newSong);

}