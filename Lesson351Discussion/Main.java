class Main {
  public static void main(String[] args)throws Exception {
    (new Main()).init();
  }
  void print(Object o){ System.out.println(o);}
  void printt(Object o){ System.out.print(o);}

  void init()throws Exception{

    CreateList list=new CreateList("CR101.csv");
    Student[] students = list.getStudentArray();
    
    //PRINT ALL STUDENTS
    print(students.length);

    //CALCULATE AVG GPA OF A WHOLE SET OF STUDENTS
    double sum = 0;
    for(int x = 0; x < students.length; x++){
      Student student = students[x];
      sum += student.gpa;
    }
    print("School avg gpa is: " + sum/students.length);
    
    // NUMBER OF STUDENTS MR CASTRO R HAS
    int count = 0;
    for(int x = 0; x < students.length; x++){
      Student student = students[x];
      if(student.findTeacher("CASTRO R") == true){
        count++;
      }
    }
    print(count + "students have Mr. Castro R");

  // NUMBER OF STUDENTS TAKING COURSE SHF21U2C 
  int count1 = 0;
  for(int x = 0; x < students.length; x++){
      Student student = students[x];
      if(student.findCourse("SHF21U2C") == true){
        count1++;
      }
      print(count1 + "students have course SHF21U2C");
    }

  // All STUDENT ID'S TAKING COURSE STARTING WITH MK WITH MR PORCHETTA 
  for(int x = 0; x < students.length; x++){
    Student student = students[x];
    if(student.findCourseStartingWith("MK") && student.findTeacher("PORCHETTA")){
      print student.id;
    }
  }




  
  int randInt(int lower, int upper){
    int range = upper - lower;
    return (int)(Math.random()*range+lower);
  }

}