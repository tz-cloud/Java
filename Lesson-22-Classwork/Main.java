class Main {
  public static void main(String[] args) {
    (new Main()).init();
  }
  void print(Object o){ System.out.println(o);}
  void printt(Object o){ System.out.print(o);}
  
  void init(){
    String[] friends = {"Ashley","Emma","Kim","Brian","Leon"};
    double[] c = {0, 12, 30};
    System.out.println(convert(c));
  }

  double[] convert(double[] c){
    double[] f = new double[c.length];
    for(int i=0; i < c.length; i++){
      f[i] = celsiusToFarhenheit(c[i]);
    }
    return f;
  }

  double celsiusToFarhenheit(double c){
        return c*9.0/5.0+32;
  }
}