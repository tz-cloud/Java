class Main {
  public static void main(String[] args) {
    (new Main()).init();
  }
  void print(Object o){ System.out.println(o);}
  void printt(Object o){ System.out.print(o);}

  void init(){

   //PROBLEM 1
   System.out.println(addNums());

   //PROBLEM 2
   System.out.println(generatePin());
  }

  //PROBLEM 1
  int addNums(){
    int n1 = ((int)(Math.random()*60)-5);
    int n2 = ((int)(Math.random()*60)-5);
    int sum = n1 + n2;
    return sum;
  }

  //PROBLEM 2
  String generatePin(){
    int d1 = ((int)(Math.random()*5)+3);
    int d2 = ((int)(Math.random()*5)+3);
    int d3 = ((int)(Math.random()*5)+3);
    int d4 = ((int)(Math.random()*5)+3);
    return d1 + " " + d2 + " " + d3 + " " + d4;
  }
}

