public class App {
    public static void main(String[] args) throws Exception {
        
        Animals animals = new Animals("Animal", 1, 1, 5, 5);

        Dog dog = new Dog("Terry", 8, 20, 2, 4, 1, 20, "Long Silky");
        dog.eat();
        dog.walk();
        dog.run();
    }
}
