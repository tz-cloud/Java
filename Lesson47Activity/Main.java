import com.sun.net.httpserver.HttpServer;
import java.io.IOException;
import java.net.InetSocketAddress;

//For compiling on the shell on repl: Same on mac
//javac -cp sqlite-jdbc-3.23.1.jar: Main.java
//java -cp sqlite-jdbc-3.23.1.jar: Main

//Use for windows
//javac -cp sqlite-jdbc-3.23.1.jar; Main.java
class Main {

 public static void main(String[] args)throws IOException{
    (new Main()).init();
  }


  void print(Object o){ System.out.println(o);}
  void printt(Object o){ System.out.print(o);}

  void init() throws IOException{
   

    // create a port - our Gateway
    int port = 8500;
      
    //create the HTTPserver object
    HttpServer server = HttpServer.create(new InetSocketAddress(port),0);

    // create the database object
    Database db = new Database("jdbc:sqlite:chinook.db");
    
    

   // Add your  code here
   server.createContext("/", new RouteHandler("You are connected, but route not given or incorrect") );

   String sql = "";
   sql  = " Select * from customer";
   server.createContext("/customers", new RouteHandler(db,sql) );

   sql  = " Select * from employees";
   server.createContext("/employees", new RouteHandler(db,sql) );

   sql = "Select";
   sql += "";
   sql += "Limit 10";
   server.createContext("/albumsinfo", new RouteHandler(db,sql) );

   String sql1 = " Select customers.FirstName, customers.LastName, tracks.name, invoices.invoiceDate from customers ";
   sql += "";
   server.createContext("/customersongs", new RouteHandler(db,sql1) );

    //Start the server
    server.start();

    System.out.println("Server is listening on port "+port);
       
      
    }    
}


