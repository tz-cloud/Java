class Main {
  public static void main(String[] args) {
    (new Main()).init();
  }
  void print(Object o){ System.out.println(o);}
  void printt(Object o){ System.out.print(o);}

  void init(){
    Animal a1 = new Animal("fox", 10, 14);
    print(a1.isHealthy());
    Animal a2 = new Animal("bear", 90, 120);
    print(a2.isHealthy());
    
    
  }

  int randInt(int lower, int upper){
    int range = upper - lower;
    return (int)(Math.random()*range+lower);
  }

}