class Main {

  public static void main(String[] args) {
    (new Main()).init();
  }

  String getUsername(String email){
    int pos = email.indexOf("@");
    return email.substring(0,pos);
  }

  String splitReverse(String word){
    int mid = word.length()/2;
    int pos = word.indexOf(" ");
    return word.substring(0, pos) + word.substring(pos+1);
  }

  String createUsername(String first, String last, String osis){
    return first.substring(0,1)+last+osis.substring(osis.length()-4);
  }

  void init(){
    System.out.println(getUsername("georgea@gmail.com"));
    
    System.out.println(splitReverse("Pizza Monday"));
    System.out.println(splitReverse("watermelon"));

    System.out.println(createUsername("Harry","Lim","123456789"));
    System.out.println(createUsername("Jane","Huang","102030405"));

    
  }

  
  
}