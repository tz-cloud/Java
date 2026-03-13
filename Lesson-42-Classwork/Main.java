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
     

      String queryResult="";
      String sql = "";

      sql = "INSERT INTO cr101(course, section, period, teacher1, room) VALUES ('MCLUB1', 3, 1, 'WHOKNOWS', 'ROOFTOP';) WHERE STUDENTID = 'STUDENT2';";
		  Database   db =  new  Database("jdbc:sqlite:students.db");	


      
  }    
}