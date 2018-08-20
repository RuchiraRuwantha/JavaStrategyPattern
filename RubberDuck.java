public class RubberDuck extends Duck {

    public RubberDuck() {

        flyBehaviour = new FlyNoWay();
        quackBehaviour = new MuteQuack();
    }

    public void display() {

        System.out.println("Hi my appearance is like a Rubber Duck");

    }
}