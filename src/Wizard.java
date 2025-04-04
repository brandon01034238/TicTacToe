public class Wizard extends Player {

    public Wizard(String name, int gamesWon) {
        super(name);
        name = String.valueOf(Math.random() * (6-3 + 1)) + 3;
        System.out.println(name);
    }

}
