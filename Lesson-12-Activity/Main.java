class Main {

  public static void main(String[] args) {
    (new Main()).init();
  }

  String creditCardType(String num){
    if(num.substring(0,1).equals("4")){
      return "Visa";
    }else if(num.substring(0,2).equals("34")||num.substring(0,2).equals("37")){
      return "America Express";
    }else if(num.substring(0,2).equals("36")){
      return "Diner Club";
    }else if(num.substring(0,2).equals("51")||num.substring(0,2).equals("55")){
      return "Mastercard";
    }else if(num.substring(0,4).equals("6011")||num.substring(0,2).equals("65")){
      return "Discovery";
    }else{
      return "idk wot card u got";
    }
  }

  String pigLatin(String word){
    String first = word.substring(0,1);
    return word.substring(1) + first + "ay";
  }

  String nycLocate(String zip){
    String locate = zip.substring(0,3);
    if(locate.equals("100") || locate.equals("101") || locate.equals("102")){
      return "Manhattan";
    }else if(locate.equals("103")){
      return "Staten Island";
    }else if(locate.equals("104")){
      return "Bronx";
    }else if(locate.equals("112")){
      return "Brooklyn";
    }else if(locate.equals("113") || locate.equals("114") || locate.equals("111")){
      return "Queens";
    }else{
      return "idk where u live";
    }
  }

  void init(){
    //Problem 1
    System.out.println(creditCardType("4147201234567890"));
    //Visa
    System.out.println(creditCardType("378282246310005"));
    //America Express
    System.out.println(creditCardType("36520000023237"));
    //Diner Club
    System.out.println(creditCardType("5555555555554444"));
    //Mastercard
    System.out.println(creditCardType("6011555555555555"));
    //Discovery
  
    //Problem 2
    System.out.println(pigLatin("pig"));
    //ipgay
    System.out.println(pigLatin("happy"));
    //yhappay

    //Problem 3
    System.out.println(nycLocate("10003"));
    //Manhattan
    System.out.println(nycLocate("10367"));
    //Staten Island
    System.out.println(nycLocate("10402"));
    //Bronx
    System.out.println(nycLocate("11274"));
    //Brooklyn
    System.out.println(nycLocate("11361"));
    //Queens
    System.out.println(nycLocate("12345"));
    //idk where u live
  }

  
  
}