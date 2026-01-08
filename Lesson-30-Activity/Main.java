class Main {

  public static void main(String[] args) {
    (new Main()).init();
  }
  
  void print(Object o){System.out.println(o);}
  void printt(Object o){System.out.print(o);}

  void init(){
    Car car1 = new Car("Toyota", "Midnight Black Metallic", "Camry LE", 2022, 24500);
    car1.honk();
    Car car2 = new Car("Ford", "Race Red", "Mustang GT Premium", 2024, 45270);
    car2.honk();
  }


  

  
  int randInt(int lower, int upper){
    int range = upper - lower;
    return (int)(Math.random()*range+lower);
  }


}