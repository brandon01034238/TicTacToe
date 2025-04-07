public class Wizard extends  Player{

        public Wizard(String message){
            super(message);
        }

        @Override
        public String getMessage(){
            return "Wizard says: " + super.getMessage();
        }
}