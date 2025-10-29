class Main {
  public static void main(String[] args) {
    (new Main()).init();
  }
  void print(Object o){ System.out.println(o);}
  void printt(Object o){ System.out.print(o);}

  double approxPI(int N){
    double approx = 0;
    for(int x=1;x<=N;x+=2){
      approx += 4*(1-1/N+2);
    }
    return approx;
  }

  void init(){
    print(approxPI(5));

  }

  
  
  
}