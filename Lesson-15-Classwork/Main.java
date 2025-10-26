class Main {
  public static void main(String[] args) {
    (new Main()).init();
  }
  void print(Object o){ System.out.println(o);}
  void printt(Object o){ System.out.print(o);}

  double approxPI(int N){
    for(int x=N;x<=N;x++){
      double approx = N*(1-1/3+1/5-1/7+1/9);
    }
    return approx;
  }

  void init(){
    print(approxPI(5));

  }

  
  
  
}