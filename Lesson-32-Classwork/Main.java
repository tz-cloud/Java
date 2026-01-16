class Main {
  public static void main(String[] args) {
    (new Main()).init();
  }
  void print(Object o){ System.out.println(o);}
  void printt(Object o){ System.out.print(o);}

  void init(){

    double[] g1 = {60,70,90};
    double[] g2 = {65,75,60};

    String[]  courses1  = {"EEFG7QH","FSFC3","HQFC3TH","HUF43X"};
    String[]  courses2  = {"MRF43","PGF43Q3C","SCF43QG","HUF43X"};

    
    //Create a new student objects 
    Student s1 = new Student("Tom", 12, 3.4, g1, courses1);
    Student s2 = new Student("Jerry", 11, 3.9, g2, courses2);

    s1.calculateAvg();
    s1.checkCourse("HUF43X");
    s2.calculateAvg();
    s2.checkCourse("EEFG7QH");


  }


  
  int randInt(int lower, int upper){
    int range = upper - lower;
    return (int)(Math.random()*range+lower);
  }

}