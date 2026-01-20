class Main {

  public static void main(String[] args) {
    (new Main()).init();
  }
  
  void print(Object o){System.out.println(o);}
  void printt(Object o){System.out.print(o);}

  void init(){
    CartItem cart1 = new CartItem("Bread", 5.99, 25, false);
    CartItem cart2 = new CartItem("Laptop", 650.00 , 11, true);
    CartItem cart3 = new CartItem("Jacket", 85.50, 30, true);
  
    print("Item: " + cart1.itemName + ". Price: $" + cart1.getItemPrice());
    print("Item: " + cart2.itemName + ". Price: $" + cart2.getItemPrice());
    print("Item: " + cart3.itemName + ". Price: $" + cart3.getItemPrice());

    double subtotal = cart1.getItemPrice() + cart2.getItemPrice() + cart3.getItemPrice();

    double plusTax = subtotal * 1.08675;

    print("Subtotal of all cartItems is $" + subtotal + ", and with tax, the total amount is $" + plusTax);


  }


  

  
  int randInt(int lower, int upper){
    int range = upper - lower;
    return (int)(Math.random()*range+lower);
  }


}