class Main {

  public static void main(String[] args) {
    (new Main()).init();
  }

  boolean collegeCredit(String course_code){
    if(course_code.substring(5).equals("M") || (course_code.substring(5).equals("E"))){
      return true;
    }else{
      return false;
    }
  }

  String getCounselor(String offClass){
    String first = offClass.substring(0); 
    String mid = offClass.substring(1);
    if(first.equals("B") || mid.equals("B")){
      return "Berrouet";
    }else if(first.equals("C") || mid.equals("C")){
      return "Chu";
    }else if(first.equals("D") || mid.equals("D")){
      return "Dinn";
    }else if(first.equals("E") || mid.equals("E")){
      return "Eyzengart";
    }else if(first.equals("F") || mid.equals("F")){
      return "Flores";
    }else if(first.equals("G") || mid.equals("G")){
      return "Gibson";
    }else if(first.equals("L") || mid.equals("L")){
      return "Shim Lee";
    }else if(first.equals("M") || mid.equals("M")){
      return "Meltzer";
    }else if(first.equals("P") || mid.equals("P")){
      return "Paccione";
    }else if(first.equals("S") || mid.equals("S")){
      return "Fiore";
    }else if(first.equals("T") || mid.equals("T")){
      return "Tsai";
    }else if(first.equals("Z") || mid.equals("Z")){
      return "Zayes";
    }else{
      return "Error: No Counselor Found";
    }
  }

  String imageType(String file_name){
    int pos = file_name.lastIndexOf(".");
    String type = file_name.substring(pos+1);
    if(type.equalsIgnoreCase("jpeg")||type.equalsIgnoreCase("jpg")){
      return "Joint Photographic Experts Group";
    }else if(type.equalsIgnoreCase("png")){
      return "Portable Network Graphics";
    }else if(type.equalsIgnoreCase("gif")){
      return "Graphics Interchange Format";
    }else if(type.equalsIgnoreCase("pdf")){
      return "Portalble Document Format";
    }else{
      return "Error : Not Found";
    }
  }

  void init(){
  //Problem 1 Testing
   System.out.println(collegeCredit("ABCDEF"));
   //false
   System.out.println(collegeCredit("ABCDEE"));
   //true
   System.out.println(collegeCredit("ABCDEM"));
   //true

  //Problem 2 Testing
  System.out.println(getCounselor("2D2"));
  //Dinn
  System.out.println(getCounselor("C22"));
  //Chu
  System.out.println(getCounselor("3T3"));
  //Tsai
  System.out.println(getCounselor("33M"));
  //Error: No Counselor Found
  System.out.println(getCounselor("1V1"));
  //Error: No Counselor Found

  //Problem 3 Testing
  System.out.println(imageType("https://images2.boardingschoolreview.com/photo/593/IMG-Academy-6r5kz9j4u144kso44sw8800k0-1122.jpg"));
  //Joint Photographic Experts Group
  System.out.println(imageType("https://images.rawpixel.com/image_png_800/czNmcy1wcml2YXRlL3Jhd3BpeGVsX2ltYWdlcy93ZWJzaXRlX2NvbnRlbnQvam9iNjgwLTE2Ni1wLWwxZGJ1cTN2LnBuZw.png"));
  //Portable Network Graphics
  }

 
}