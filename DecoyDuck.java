public class DecoyDuck extends Duck {

    public DecoyDuck() {

        flyBehaviour = new FlyNoWay();
        quackBehaviour = new MuteQuack();
    }

    public void display() {

        System.out.println("Hi my appearance is like a Decoy Duck");

    }
}