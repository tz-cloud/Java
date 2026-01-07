class Main {
  public static void main(String[] args) {
    (new Main()).init();
  }
  void print(Object o){ System.out.println(o);}
  void printt(Object o){ System.out.print(o);}

  void init(){
    Dog dog1 = new Dog("Poodle", 4, "Toto");
    dog1.bark();
    Dog dog2 = new Dog("Pug", 5, "Snoopy");
    dog2.bark();
    Dog dog3 = new Dog("Chihuahua", 6, "Poophy");
    dog3.bark();
  }

  int randInt(int lower, int upper){
    int range = upper - lower;
    return (int)(Math.random()*range+lower);
  }

}