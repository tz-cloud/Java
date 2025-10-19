class Main {

  public static void main(String[] args) {
    (new Main()).init();
  }

  boolean collegeCredit(String course_code){
    if(course_code.substring(7) == "E" || course_code.substring(7) == "M"){
      return true;
    }else{
      return false;
    }
  }

  void init(){
   System.out.println(collegeCredit("ABCDEF"));
   System.out.println(collegeCredit("ABCDEE"));
   System.out.println(collegeCredit("ABCDEM"));

    
  }

 
}