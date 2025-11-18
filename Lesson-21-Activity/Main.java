class Main {

  public static void main(String[] args) {
    (new Main()).init();
  }
  
  void print(Object o){System.out.println(o);}
  void printt(Object o){System.out.print(o);}

  String allowance(){
    int days = 0;
    double amount = 0.01;
    while(amount<=5){
      amount *= 2;
      days++;
    }
    return "It would take " + days + " to surpass $5.";
  }

  void addTwoNumbers(){
    int num1 = randInt(1,100);
    int num2 = randInt(1,100);
    int sum = num1 + num2;
    System.out.println(num1 + " + " + num2 + " = ?");
    int guess = -1;
    while(!(guess==sum)){
      guess = Input.readInt();
      if(guess != sum){
        System.out.println("Incorrect");
      }else{
        System.out.println("Correct!");
      }
    }
  }

  int GCF(int num1, int num2){
    int count = 0;  
    int gcf = //couldnt find the formula
    while(num2 != 0){
      int c = num2;
      num2 = num1 % num2;
      num1 = c;
    }
    return gcf;
  }

  String menu(){

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