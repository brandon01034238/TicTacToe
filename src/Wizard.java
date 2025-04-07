public class Wizard extends  Player{

        public Wizard(String message){
            super(message);
        }

        @Override
        public String getMessage(){
            return "Player 1, you are the Wizard. " + super.getMessage();
        }
}