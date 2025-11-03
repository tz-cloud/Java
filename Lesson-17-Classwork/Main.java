

class Main {
  public static void main(String[] args) {
    (new Main()).init();
  }
  void print(Object o){ System.out.println(o);}
  void printt(Object o){ System.out.print(o);}

  void init(){
    System.out.println(swapLetter("bubblegum", "u", "i"));
    //return bibblegim
    System.out.println();
    System.out.println(encryption3("abcdef"));
    //return afbecd


    
  }

  //PROBLEM 1
  String swapLetter(String text, String swap, String replace){
    String bld = "";
        for (int x = 0; x < text.length(); x++){
            String currentChar = text.substring(x, x + 1);
            if(currentChar.equals(swap)){
                bld += replace;
            }else{
                bld += currentChar;
            }
        }
        return bld;
  }

  //PROBLEM 2
  String encryption2(String text){
    String bld= "";
    int mid = text.length()/2;
    String first = text.substring(0, mid);
    String second = text.substring(mid);
    for(int x=0; x < text.length(); x++){
      //idk man
    }
    return bld;
  }

  //PROBLEM 3
  String encryption3(String text){
    String bld = "";
    for(int x = 0; x < text.length(); x++){
      int last = text.length()-x;
      bld += text.substring(x,last);
    }
    return bld;
  }
}