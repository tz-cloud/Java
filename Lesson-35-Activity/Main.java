class Main {
  public static void main(String[] args)throws Exception {
    (new Main()).init();
  }
  void print(Object o){ System.out.println(o);}
  void printt(Object o){ System.out.print(o);}

  void init()throws Exception{

    CreateList list=new CreateList("CR101.csv");
    Student[] students = list.getStudentArray();

    // add your code below here

    //CHALLENGE 1
    int pass = 0;
    int fail = 0;
    for(int x = 0; x < students.length; x++){
      Student student = students[x];
      if(student.gpa >= 65){
        pass++;
      }else{
        fail++;
      }
    }
    print(pass + " students are passing and " + fail + " students are failing.");
    
    //CHALLENGE 2
    print((fail/students.length)*100 + "% students are failing.");

    //CHALENGE 3
    int fail1 = 0;
    for(int x = 0; x < students.length; x++){
      Student student = students[x];
      if(student.findTeacher("Castro R") && student.gpa < 65){
        fail1++;
      }
    }
    print(fail1 + " students who have Mr. Castro are failing.");

    //CHALLENGE 4
    int fail2 = 0;
    for(int x = 0; x < students.length; x++){
      Student student = students[x];
      if(student.findCourseStartingWith("UL") == false && student.gpa < 65){
        fail2++;
      }
    }
    print(fail2 + " students who are not taking music course are failing.");

    //CHALLENGE 5
    for(int x = 0; x < students.length; x++){
      Student student = students[x];
      if(student.findCourseStartingWith("UL") && student.gpa < 65){
        print(student.id);
      }
    }
    
    //CHALLENGE 6
    int fresh = 0;
    int soph = 0;
    for(int x = 0; x < students.length; x++){
      Student student = students[x];
      if(student.gradeLevel == 9 && student.gpa > 90){
        fresh++;
      }else if(student.gradeLevel == 10 && student.gpa > 90){
        soph++;
      }
    }
    print(fresh + " freshmen and " + soph + " sophmores have a gpa over 90.");

    //CHALLENGE 7

    int count = 0;
    for(int x = 0; x < students.length; x++){
      Student student = students[x];
      if(student.findTeacher("Banu") && student.findTeacher("Porchetta")){
        count++;
      }
    }
    print(count + " students have both Banu and Porchetta.");

    //CHALLENGE 8
    int f = 0;
    int s = 0;
    int j = 0;
    int z = 0;
    for(int x = 0; x < students.length; x++){
      Student student = students[x];
      if(student.gradeLevel == 9){
        f++;
      }else if(student.gradeLevel == 10){
        s++;
      }else if(student.gradeLevel == 11){
        j++;
      }else if(student.gradeLevel == 12){
        z++;
      }
    }
    print(f + " freshmen, " + s + " sophmores, " + j + " juniors, and "+ z + " seniors are at Bayside High School.");

    //CHALENGE 9
    for(int x = 0; x < students.length; x++){
      Student student = students[x];
      if(student.findTeacher("Porchetta")){
        print(student.gradeLevel);
      }
    }
    
  }







  
  int randInt(int lower, int upper){
    int range = upper - lower;
    return (int)(Math.random()*range+lower);
  }

}