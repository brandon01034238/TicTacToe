public class Troll extends  Player{

    public Troll(String message){
        super(message);
    }

    @Override
    public String getMessage(){
        return "Troll says: " + super.getMessage();
    }

}