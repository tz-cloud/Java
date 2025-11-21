class Main {

  public static void main(String[] args) {
    (new Main()).init();
  }
  
  void print(Object o){System.out.println(o);}
  void printt(Object o){System.out.print(o);}

  double total(double[] prices){
    double sum = 0;
    for(int i = 0; i < prices.length; i++){
      sum += prices[i];
    }
    return sum*1.08525;
  }

  boolean isin(int[]array, int num){
    for(int i = 0; i < array.length; i++){
      if(array[i] == num){
        return true;
      }else{
        return false;
      }
    
  }

  void init(){
    double[] price = {2.50, 8.99, 3.99, 10.25};
    print(total(price)); //$27.92

    int[]test={1,2,3,4,5,6,7,8};
    print(isin(test, 1)); //true

  }

  int checkLotto(int[]picks, int[]drawn){
    int check = 0;
    for(int i = 0; i < picks.length; i++){
      if(isin(picks, drawn[i])){
        check++;
      }
    }
    return check;
  }

  // Use these functions below for the activity

  String convertToEmoji(String code){
    return String.valueOf(Character.toChars(
                               Integer.parseInt(code, 16)));
  }

  
  int randInt(int lower, int upper){
    int range = upper - lower;
    return (int)(Math.random()*range+lower);
  }

  boolean isPrime(int n){
    int divisor = 2;
    while(n%divisor !=0){
      divisor+=1;
    }
    if(divisor==n)
      return true;
    else
      return false;
  }
}