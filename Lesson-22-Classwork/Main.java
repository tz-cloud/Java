class Main {
  public static void main(String[] args) {
    (new Main()).init();
  }
  void print(Object o){ System.out.println(o);}
  void printt(Object o){ System.out.print(o);}
  
  void init(){
   
    
  }

  double[] convert(double[] c){
    for(int i=0; i < c.length; i++){
      c[i] = celsiusToFarhenheit(c[i]);
    }
    return c;
  }

  double celsiusToFarhenheit(double c){
        return c*9.0/5.0+32;
  }
}