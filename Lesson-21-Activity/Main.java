class Main {

  public static void main(String[] args) {
    (new Main()).init();
  }
  
  void print(Object o){System.out.println(o);}
  void printt(Object o){System.out.print(o);}

  String allowance(){
    int days = 0;
    double penny = 0.01;
    double amount = penny*2;
    while(!(amount==5)){
      days++;
    }
    return "It would take " + days + " to reach $5.";
  }

  int addTwoNumbers(){
    int num1 = randInt(1,100);
    int num2 = randInt(1,100);
    int equ = num1 + num2;
    System.out.println(equ + "=?");
    int guess = Input.readInt();
    while()



  }

  void init(){
    allowance();
  }



  
  int randInt(int lower, int upper){
    int range = upper - lower;
    return (int)(Math.random()*range+lower);
  }

}