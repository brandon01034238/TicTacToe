public class Player {
    private int gamesWon;
    private String name;

    public Player(String name, int gamesWon){
        this.gamesWon = gamesWon;
        this.name = name;
    }

    private String getName(){
        return name;
    }

    private int getGamesWon(){
        return gamesWon;
    }


}
