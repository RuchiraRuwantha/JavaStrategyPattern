class DuckSimulator {

    public static void main(String[] args) {

        Duck[] duck = new Duck[4];
        duck[0] = new MullardDuck();
        duck[1] = new RedHeadDuck();
        duck[2] = new RubberDuck();
        duck[3] = new DecoyDuck();

        run(duck);
    }

    public static void run(Duck duck[]) {

        for (Duck ducks : duck) {
            ducks.swim();
            ducks.display();
            ducks.performQuack();
            ducks.performFly();

        }
    }
}