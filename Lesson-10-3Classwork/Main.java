class Main {
  public static void main(String[] args) {
    (new Main()).init();
  }

  void init(){
    System.out.println(groupSavings(1));
    System.out.println(groupSavings(9));
    System.out.println(groupSavings(17));
    
    System.out.println(groceryDiscount(100, 3));
    System.out.println(groceryDiscount(200, 5));
    System.out.println(groceryDiscount(100, 1));
  }

    /*
      Problem 1:      
      Write a function groupSavings that takes number of tickets wanting 
      to purchase. Return the total cost by apply the following discount:
      1 to 8 tickets  : each ticket cost $11,
      9 to 16 tickets : each ticket cost $10.50
      over 16 tickts  : each ticket cost $8.50
    */
   double groupSavings(int tickets){
     if(tickets >= 1 && tickets <= 8){
      double total = tickets * 11;
      return total;
     }else if(tickets >= 9 && tickets <= 16){
      double total = tickets * 10.5;
      return total;
     }else{
      double total = tickets * 8.5;
      return total;
     }
   }
  
  /*
      Write a function groceryDiscount that takes the total amount spent at 
      a grocery store and the number of cans of beans purchased.
      Depending on the total amount and number of can of
      beans purchase, you get a savings on their total bill.
      Return the savings amount:
        Spent $100 to $200 and purchase at least 3 cans of 
        beans: $10 savings
        Spent over $200 and purchase more than 4 cans 
        of beans: $25 savings
        Otherwise: $0 savings.
    */
   double groceryDiscount(double total, int cans){
    if((100 <= total && total <= 200) && cans == 3){
      double amount = (total + cans) - 10;
      return amount;
    }else if(total > 200 && cans > 4){
      double amount = (total + cans) - 25;
      return amount;
    }else{
      double amount = (total + cans);
      return amount;
    }
   }


}