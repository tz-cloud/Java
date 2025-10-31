class Main {
  public static void main(String[] args) {
    (new Main()).init();
  }
  void print(Object o){ System.out.println(o);}
  void printt(Object o){ System.out.print(o);}

  void init(){


    
  }

  //will use reverse for problem 3
  String reverse(String s){
    String bld="";
    for(int x=s.length()-1; x>=0; x--) //going backwards
      bld+=s.substring(x,x+1);

    return bld;
  }

  //PROBLEM 1
  String swapLetter(String s, char swap, char replace){
    String bld="";
    for(int x = 0; x < s.length(); x++){
      if(s.substring(x, x+1).equals("swap")){
        
      }
    }
    return bld;
  }

  //PROBLEM 2
  String encryption2(String s){
    String bld="";
    return bld;
  }

  //PROBLEM 3
  String encryption3(String s){
    String bld="";
    return bld;
  }

}