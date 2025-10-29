class Main {
  public static void main(String[] args) {
    (new Main()).init();
  }
  void print(Object o){ System.out.println(o);}
  void printt(Object o){ System.out.print(o);}

  double approxPI(int N){
    double approx = 0;
    for(int x=1;x<=N;x+=2){
      double term = 1 / (2 * x + 1); 
      if (x % 2 == 0){
        approx += term;  //add
      }else{
        approx -= term;  //subtract
      }
      }
      return 4*approx;
    }

  void init(){
    print(approxPI(5));

  }

  
  
  
}