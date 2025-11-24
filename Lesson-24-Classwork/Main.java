class Main {
  public static void main(String[] args) {
    (new Main()).init();
  }
  void print(Object o){ System.out.println(o);}
  void printt(Object o){ System.out.print(o);}

  String toUpper(String msg){
    String bld = "";
    for(int i = 0; i < msg.length(); i++){
      char ch = msg.charAt(i); //to convert String into character
      int ascii = ch-32;
      bld += (char)ascii;
    }
    return bld;
  }

  String genPswd(){
    String pswd = "";
    for(int i = 0; i < 7; i++){
      int ascii = randInt(1, 127);
      char ch = (char)ascii;
      pswd += ch;
    }
    return pswd;
  }

  void init(){
    print(toUpper("hello world"));
    //HELLO WORLD
    print(genPswd());
    //random password
  }



   
  int randInt(int lower, int upper){
    int range = upper - lower;
    return (int)(Math.random()*range+lower);
  }

 
}