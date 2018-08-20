public class RedHeadDuck extends Duck {

    public RedHeadDuck() {

        quackBehaviour = new Squeak();
        flyBehaviour = new FlyWithWings();
    }

    public void display() {

        System.out.println("Hi my appearance is like a Redhead Duck.");

    }

}