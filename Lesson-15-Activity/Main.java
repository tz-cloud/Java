class Main {

  public static void main(String[] args) {
    (new Main()).init();
  }
  
  //Function for print()
  void print(Object o){ System.out.println(o);}
  void printt(Object o){ System.out.print(o);}

  //Problem 1
  String spaces(int N){
    String result = "";
    for(int x=0; x<=N; x++){
      result += " ";
    } 
    return result+"DONE";
  }

  //Problem 2
  double harmonic(int N){
    double sum = 0;
    for(int x=0; x<=N; x++){
      sum += 1/N;
    }
    return sum;
  }

  //Problem 3
  double sine(int N, int deg){
    double sum = 0;
    for(int x=0; x<=N; x+=2){
      sum += deg - (Math.pow(deg,2*x+1)/(2*x+1));
    }
    return sum;
  }

  //Problem 4
  int fib(int N){
    int a = 0;
    int b = 1;
    for (int x = 0; x < N; x++) {  
      int next = a + b;  // calculate next number
      a = b;             // move forward in the sequence
      b = next;

    }
    return a;
  }

  //Problem 5
    String nRow(int N, int size) {
    String row = "";
    for (int x = 1; x <= size; x++) {
      row += (N * x) + " ";
    }
      return row;
  }

  String mTable(int size){
    String table="";
    for (int x = 1; x <= size; x++) {
      table += nRow(x, size) + " ";
    }
      return table; 
  }


  void init(){
    System.out.println(spaces(3));
    System.out.println(spaces(5));

    System.out.println(harmonic(1));
    System.out.println(harmonic(2));
    
    System.out.println(sine(3, 28));

    System.out.println(fib(6));
    
    System.out.println(mTable(12));
  }


  
}