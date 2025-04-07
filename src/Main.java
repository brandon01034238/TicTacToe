public class Main{
    public static void main(String[] args) {
        System.out.println("This game is tictactoe, Player 1 will be playing as Wizards and Player 2 will be playing as Trolls " + "\n" + "The goal of the game is to get 3 characters in a row horizontally, vertically, or diagonally " + "\n" + "You can not place your character on top of any other character, you can only place it on an open spot, and choose from rows/grids 0-2" + "\n");
        Wizard wizard = new Wizard("As the Wizard, you get to go first, this is helpful because you get to direct the entire course of the game by placing your wizard first");
        System.out.println(wizard.getMessage());
        Troll troll = new Troll("As the Troll, you get to go second, this is helpful because you get to play off of your opponent and strategically place your troll");
        System.out.println(troll.getMessage());
        Player[] players = new Player[2];
        players[0] = wizard;
        players[1] = troll;
        Grid grid = new Grid();
        System.out.println("Wizard, your name is: " + grid.getWizardName());
        System.out.println("Troll, your name is: " + grid.getTrollName());
        grid.start();
    }
}

