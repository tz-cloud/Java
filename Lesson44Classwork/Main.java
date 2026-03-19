import java.io.IOException;
//For compiling on the shell on repl: Same on mac
//javac -cp sqlite-jdbc-3.23.1.jar: Main.java

//Use for windows
//javac -cp sqlite-jdbc-3.23.1.jar; ServerExample.java
class Main {

 public static void main(String[] args)throws IOException{
    (new Main()).init();
  }

  void print(Object o){ System.out.println(o);}
  void printt(Object o){ System.out.print(o);}

  void init() {

    String result="";
    String sql = "SELECT albums.title FROM albums INNER JOIN artists ON albums.ArtistId = artists.ArtistId Limit 20;";
    String sql1 ="SELECT tracks.name FROM tracks INNER JOIN genres ON tracks.genreld = genres.genreld WHERE genres.genreld IN('Blues', 'Latin', 'Pop', 'Classical') Limit 20;";
    String sql2 = "SELECT tracks.name FROM tracks INNER JOIN playlist_track ON tracks.TrackId = playlist_track.TrackId INNER JOIN playlists ON playlist_track.PlaylistId = playlists.PlaylistId WHERE playlist.name = 'Grunge' Limit 20;";
     
		Database db = new Database("jdbc:sqlite:chinook.db" );	
    result = db.runSQL(sql, "table-auto");
    print(result); 

    

      
  }    
}