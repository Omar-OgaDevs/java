/*
Start with a base class of a Vehicle, 
Then create a Car class that inherits from this base class.
Finally, create another class, a specific type of Car that
iherits from the Car class.
You should be able to hand steering, changin gears, and
moving (speed),
You will want to decide where to put the appropiate state
and behaviours (fields and methods).
As mentioned above, cahnging gears, increasing/decreasing
speed should be included.
For your specific type of vehicle you will want to add 
something specific for that type of car.
*/

public class App {
    public static void main(String[] args) throws Exception {
        
        SestoElemento sestoElemento = new SestoElemento(36);
        sestoElemento.steer(45);
        sestoElemento.accelerate(40);
        sestoElemento.accelerate(30);
        sestoElemento.accelerate(-62);
    }
}
