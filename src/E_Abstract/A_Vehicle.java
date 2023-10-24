package E_Abstract;

public abstract class A_Vehicle {
    void drive(){
        System.out.println("Drive");
    }
    abstract void stop();
}
class ChildAbstract extends A_Vehicle {
    void stop(){
        System.out.println("Stop Abstract");
    }
}
