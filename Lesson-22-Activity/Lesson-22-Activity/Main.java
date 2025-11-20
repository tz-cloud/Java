class Main {
  public static void main(String[] args) {
    (new Main()).init();
  }
  void print(Object o){ System.out.println(o);}
  void printt(Object o){ System.out.print(o);}

  void init(){

    //Using this array to test your sumArray and avgArray function
    int nums[] = {10,15,22,54,32,34,65,87,45,100,23,99,95,87,56,83};
    print(sumArray(nums));
    print(avgArray(nums));
    
    // Use these two arrays to test your quizGrader function
    char[] studentAns = {'A','A','B','C','D','C'};
    char[] ansKey = {'A','B','B','C','D','C'};
    print(quizGrader(studentAns, ansKey));

  }

  //Problem 1:
  // Write a function called sumArray that accepts an array of integers and
  // returns the sum of all the values in the array.
  int sumArray(int[] num){
    int sum = 0;
    for(int i = 0; i < num.length; i++){
      sum =+ num[i];
    }
    return sum;
  }

  //Problem 2
  // Write a function called avgArray that accepts an array of integers and
  // returns the average of the values in the array

  double avgArray(int[]num){
    int sum = 0;
    for(int i = 0; i < num.length; i++){
      sum += num[i];
    }
    double avg = sum/num.length;
    return avg;
    }
  

  //Problem 3
  // Write a function called quizGrader that accepts two arrays of characters.  One array 
  // represents the students answers and the other array represents the answer key.
  //
  // Return the quiz grade by counting the number of correct answers divided by
  // the number of questions.

  String quizGrader(char[]student, char[]ans){
    int correct = 0;
    for(int i = 0; i < ans.length; i++){
      if(student[i] == ans[i]){
        correct ++;
      }
    }
    double grade = (correct/ans.length)*100.0;
    return "Quiz grade is " + grade;

  }

  
  int randInt(int lower, int upper){
    int range = upper - lower;
    return (int)(Math.random()*range+lower);
  }

}