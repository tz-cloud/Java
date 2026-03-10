
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
    String sql ="Select * From cr101 Where teacher1 = 'BANU';";
    String sql1 ="Select * From cr101 Where teacher1 = 'PORCHETTA' And Period = '10';";
    String sql2 ="Select studentId From cr101;";
    String sql3 ="Select studentId,course, period From cr101 Where room In('322', '105', '106', '323') And Grade = '11';";
    String sql4 ="Select * From cr101 Where course LIKE 'M%' And course LIKE '%X';";

    Database db =  new  Database("jdbc:sqlite:students.db");	

    queryResult = db.runSQL(sql, "table-auto");
    queryResult = db.runSQL(sql1, "table-auto");
    queryResult = db.runSQL(sql2, "table-auto");
    //there are 34,731 students
    queryResult = db.runSQL(sql3, "table-auto");
    queryResult = db.runSQL(sql4, "table-auto");
    
    print(queryResult); 

    


    
     
  }    
}