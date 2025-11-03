class Main {
  public static void main(String[] args) {
    (new Main()).init();
  }
  void print(Object o){ System.out.println(o);}
  void printt(Object o){ System.out.print(o);}

  void init(){

   //PROBLEM 1
   System.out.println(addNums());
  }

  //PROBLEM 1
  int addNums(){
    int n1 = ((int)(Math.random()*55)-5);
    int n2 = ((int)(Math.random()*55)-5);
    int sum = n1 + n2;
    return sum;
  }
}