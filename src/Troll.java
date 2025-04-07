public class Troll extends  Player{

    public Troll(String message){
        super(message);
    }

    @Override
    public String getMessage(){
        return "Player 2, you are the troll. " + super.getMessage();
    }

}