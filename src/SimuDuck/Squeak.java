package SimuDuck;

public class Squeak implements QuackBehavior{
    @Override
    public void quack() {
        System.out.println("I'm squeaking!");
    }
}
