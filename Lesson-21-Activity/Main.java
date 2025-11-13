class Main {

  public static void main(String[] args) {
    (new Main()).init();
  }
  
  void print(Object o){System.out.println(o);}
  void printt(Object o){System.out.print(o);}

  double allowance(){
    String days = "";
    double penny = 0.01;
    double amount = penny*2;
    while(!(amount==5)){
      days++;
    }
    return days;
  }

  void init(){
    
  }



  
  int randInt(int lower, int upper){
    int range = upper - lower;
    return (int)(Math.random()*range+lower);
  }

}