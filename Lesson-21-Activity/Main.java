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

  void addTwoNumbers(){
    int num1 = randInt(1,100);
    int num2 = randInt(1,100);
    int sum = num1 + num2;
    int score = 0;
    System.out.println(num1 + " + " + num2 + " = ?");
    int guess = Input.readInt();
    while(!(guess==sum)){
      score++;
      if(score == 1){
        System.out.println("Incorrect");
      }else{
        System.out.println("Correct!");
      }
    }
  }

  int GCF(int num1, int num2){
    int count = 0;  

  }

  void init(){
    allowance();
    addTwoNumbers();
  }



  
  int randInt(int lower, int upper){
    int range = upper - lower;
    return (int)(Math.random()*range+lower);
  }

}