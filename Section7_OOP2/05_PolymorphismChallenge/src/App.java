/*
Create a base class called car
It should have a few fields that would be appropiate for
a generic car class; engine, cylinders, wheels, etc.
Constructor should initialize cylinders (number of) and
name, and set wheels to 4 and engine to true.
Cylinders and names would be passed parameters.
Create appropiate getters
Create some methods like startEngine, accelerate and brake.
Show a message for each in the base class.
Create 3 sub classes for your favorite vehicles.
Override the appropiate methods to demonstrate polymorphism
in use.
Put all classes in one java file.
*/

//Base car class
class Car {
    private boolean engine;
    private int cylinders;
    private String name;
    private int wheels;
    //Constructor to initialize the cylinders and the name
    public Car(int cylinders, String name) {
        this.cylinders = cylinders;
        this.name = name;
        //set wheels and engine manually
        this.wheels = 4;
        this.engine = true;
    }
    //Create getters and setters for cylinders and name
    public int getCylinders() {
        return cylinders;
    }
    public void setCylinders(int cylinders) {
        this.cylinders = cylinders;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    
    //StartEngine method
    public String startEngine(){
        return "Car -> startEngine()";
    }
    //Accelerate method
    public String accelerate(){
        return "Car -> accelerate()";
    }
    //Brake method
    public String brake(){
        return "Car -> brake()";
    }
}
//Subclass Lamborghini
class Lamborghini extends Car {
    //Constructor
    public Lamborghini(int cylinders, String name) {
        super(cylinders, name);
    }
    //Override startEngine, accelerate and brake.
    @Override
    public String accelerate() {        
        return "Lamborghini -> accelerateOver()";
    }

    @Override
    public String brake() {        
        return "Lamborghini -> brakeOver()";
    }

    @Override
    public String startEngine() {        
        return "Lamborghini -> startEngineOver()";
    }    

}
//Subclass Chevrolet
class Chevrolet extends Car{

    public Chevrolet(int cylinders, String name) {
        super(cylinders, name);
    }
    //Override startEngine, accelerate and brake.
    @Override
    public String accelerate() {
        //Another way to retrieve the class name        
        return getClass().getSimpleName() + " -> accelerateOver()";
    }

    @Override
    public String brake() {        
        return getClass().getSimpleName() + " -> brakeOver()";
    }

    @Override
    public String startEngine() {        
        return getClass().getSimpleName() + " -> startEngineOver()";
    }    
}
//Subclass Lincoln
class Lincoln extends Car{

    public Lincoln(int cylinders, String name) {
        super(cylinders, name);        
    }
    //Override startEngine, accelerate and brake.
    @Override
    public String accelerate() {        
        return "Lincoln -> accelerateOver()";
    }

    @Override
    public String brake() {        
        return "Lincoln -> brakeOver()";
    }

    @Override
    public String startEngine() {        
        return "Lincoln -> startEngineOver()";
    }
}

//Main class
public class App {
    public static void main(String[] args) throws Exception {

        //test 
        Car car = new Car(8,"Base car");
        //Wrapped the actual method call inside systemoutprintln
        System.out.println(car.startEngine());
        System.out.println(car.accelerate());
        System.out.println(car.brake());

        Lamborghini lamborghini = new Lamborghini(10, "Sesto Elemento");
        System.out.println(lamborghini.startEngine());
        System.out.println(lamborghini.accelerate());
        System.out.println(lamborghini.brake());

        Chevrolet chevrolet = new Chevrolet(12, "Suburban");
        System.out.println(chevrolet.startEngine());
        System.out.println(chevrolet.accelerate());
        System.out.println(chevrolet.brake());

        Lincoln lincoln = new Lincoln(8, "MKZ");
        System.out.println(lincoln.startEngine());
        System.out.println(lincoln.accelerate());
        System.out.println(lincoln.brake());
    }
}
