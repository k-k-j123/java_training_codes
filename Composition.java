/*
    Contianment (Composition) in java. 
    In java programming language, containment (also called composistion) is an 
    OOP concept where one class contians an object of another class as an member.

    It represents a "has -a " relationship unlike inheritance which represent an "is - a " relationship.

    key points
    1) Has-A relationship - A class HAS another class object.
    2) Code reusability - instead of inheriting you can reuse functionality by including
                          objects of other class
    3) Flexibility - Easier to change relatioships compared to inheritance.
*/
class Engine {
    void Start() {
        System.out.println("Starting the engine ........");
    }
}

class Car {
    Engine eng;

    public Car() {
        eng = new Engine();
    }

    void drive() {
        eng.Start();
        System.out.println("Car is driving...........");
    }

}

public class Composition {
    public static void main(String[] args) {
        Car c = new Car();
        c.drive();
    }
}
