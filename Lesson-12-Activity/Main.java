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

  void init(){
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

  }

  
  
}