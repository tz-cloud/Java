class Main {

  public static void main(String[] args) {
    (new Main()).init();
  }
  
  void print(Object o){System.out.println(o);}
  void printt(Object o){System.out.print(o);}

  //PROBLEM 1
  String rollDice(){
    String roll = "";
    int d1 = (int)(Math.random()*(6)+1);
    int d2 = (int)(Math.random()*(6)+1);
    roll += d1 + " " + d2;
    return roll;
  }

  //PROBLEM 2
  String lotto(){
    String lot = "";
    for(int x = 0; x < 5; x++){
      int num = (int)(Math.random()*(48)+1);
      lot += num + " ";
    }
    return lot;
  }

  //PROBLEM 4
  String additionTutor(){
    String equation = " ";
    int num1 = (int)(Math.random()*(100)+1);
    int num2 = (int)(Math.random()*(100)+1);
    equation = num1 + " " + "+" + " " + num2;
    System.out.println(equation);
    System.out.println("What is the sum?");
    int user = Input.readInt();
    int ans = num1 + num2;
    if(user == ans){
      return "Correct!";
    }else{
      return "Incorrect";
    }
  }

  void init(){
    System.out.println(rollDice());
    System.out.println(lotto());
    System.out.println(additionTutor());

    
  }




}