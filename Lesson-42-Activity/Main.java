
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
    String sql ="Select studentID, grade, offclass From cr101 Where studentID = 'STUDENT999';";
    String sql1 ="UPDATE cr101 SET room = 122 Where studentID = 'STUDENT1001' and period = 3;";
    String sql2 = "DELETE FROM cr101 Where studentID = 'STUDENT1200' and course = 'ZQCTEDA'";
    String sql3 = "UPDATE cr101 SET room = 213 Where teacher1 = 'DOYLE' and period IN(4, 5);";
    String sql4 = "UPDATE cr101 SET teacher1 = 'ROFFLER' WHERE course = 'MQF44QGF' and section = 1;";
    String sql5 = "UPDATE cr101 SET grade = 11, offclass = '3C8' WHERE studentID = 'STUDENT999';";
    String sql6 = "INSERT INTO cr101(course, section, teacher1, period, room, studentID) VALUES ('MKUFTC6', 1, 'CASTRO R', 9, 322, 'STUDENT1231');";

		Database db = new Database("jdbc:sqlite:students.db" );

    queryResult = db.runSQL(sql6, "table-auto");
    print(queryResult); 
   
     
      }    
}