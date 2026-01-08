class Car{
    //class variables
    String brand;
    String color;
    String model;
    int year;
    double value;

    //class constructor
    Car(String brand, String color, String model, int year, double value){
        this.brand = brand;
        this.color = color;
        this.model = model;
        this.year = year;
        this.value = value;
    }

    //class function
    void honk(){
        System.out.println("The brand of this car is " + brand + ", the model is " + model + " and the value is $" + value);
    }


}