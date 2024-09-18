package anudip;

public class Car {
    // Write a Java program to define a class Car with attributes like brand, model,
    // and price. Implement both default and parameterized constructors to initialize objects.
    private String brand;
    private int model;
    private Double price;

    public  Car(String b, int m, Double p){
       brand=b;
       model=m;
       price=p;
        System.out.println(brand + " "+model + " " + price );
    }
    public Car(){
        System.out.println("printing details of car ");
        System.out.println("Brand"+ " "+"model"+ " "+"price");
    }
    public static void main(String[] args) {
        Car dc=new Car();
        Car c=new Car("ford",123, 400000.0);


    }
}
