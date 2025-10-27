class Main {

  public static void main(String[] args) {
    (new Main()).init();
  }
  
  void print(Object o){ System.out.println(o);}
  void printt(Object o){ System.out.print(o);}

  String spaces(int N){
    String result = "";
    for(int x=0; x<=N; x++){
      result += " ";
    } 
    return result;
  }

  void init(){
    System.out.println(spaces(3)+"DONE");
    System.out.println(spaces(5)+"DONE");
    
    
  }


  
}