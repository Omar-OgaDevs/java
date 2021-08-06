public class App {
    public static void main(String[] args) throws Exception {
        
        Dog dog = new Dog("Terry");
        dog.breathe();
        dog.eat();

        Parrot parrot = new Parrot("Blue");
        parrot.breathe();
        parrot.eat();
        parrot.fly();

        Penguin penguin = new Penguin("Emperor");
        penguin.fly();    
    }
}
