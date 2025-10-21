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
    if(offClass.substring(1).equals("B") || offClass.substring(0).equals("B")){
      return "Berrouet";
    }else if(offClass.substring(1).equals("C") || offClass.substring(0).equals("C")){
      return "Chu";
    }else if(offClass.substring(1).equals("D") || offClass.substring(0).equals("D")){
      return "Dinn";
    }else if(offClass.substring(1).equals("E") || offClass.substring(0).equals("E")){
      return "Eyzengart";
    }else if(offClass.substring(1).equals("F") || offClass.substring(0).equals("F")){
      return "Flores";
    }else if(offClass.substring(1).equals("G") || offClass.substring(0).equals("G")){
      return "Gibson";
    }else if(offClass.substring(1).equals("L") || offClass.substring(0).equals("L")){
      return "Shim Lee";
    }else if(offClass.substring(1).equals("M") || offClass.substring(0).equals("M")){
      return "Meltzer";
    }else if(offClass.substring(1).equals("P") || offClass.substring(0).equals("P")){
      return "Paccione";
    }else if(offClass.substring(1).equals("S") || offClass.substring(0).equals("S")){
      return "Fiore";
    }else if(offClass.substring(1).equals("T") || offClass.substring(0).equals("T")){
      return "Tsai";
    }else if(offClass.substring(1).equals("Z") || offClass.substring(0).equals("Z")){
      return "Zayes";
    }else{
      return "Error: No Counselor Found";
    }
  }

  String imageType(String file_name){
    int pos = file_name.lastIndexOf(".");
    String type = file_name.substring(pos);
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