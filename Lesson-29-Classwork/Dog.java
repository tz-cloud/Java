class Dog{

    //Class variables
    String breed;
    int age;
    String name;

    //Class Constructor
    Dog(String breed, int age, String name){
        this.breed = breed;
        this.age   = age;
        this.name  = name;
    }
    //Class functions
    void speak(){
        System.out.println("Bark!");
    }
}