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

   String sql = " Select * from Customer";
   server.createContext("/customers", new RouteHandler(db,sql) );

   String sql1  = " Select * from employees";
   server.createContext("/employees", new RouteHandler(db,sql1) );

   String sql2 = "Select * From tracks, * From artists";
   sql2 += "Inner Join albums On artists.artistsId = albums.artistsId";
   sql2 += "Inner Join tracks On albums.albumId = tracks.albumId";
   sql2 += "Limit 10";
   server.createContext("/albumsinfo", new RouteHandler(db,sql2) );

   String sql3 = "Select customers.FirstName, customers.LastName, tracks.name, invoices.invoiceDate from customers ";
   sql3 += "Inner Join invoices On customers.customerId = invoices.customerId";
   sql3 += "Inner Join invoice_items On invoices.invoiceId = invoice_items.invoiceId";
   sql3 += "Inner Join tracks On invoice_items.trackId = tracks.trackId";
   sql3 += "Limit 10";
   server.createContext("/customersongs", new RouteHandler(db,sql3) );

    //Start the server
    server.start();

    System.out.println("Server is listening on port "+port);
       
      
    }    
}


