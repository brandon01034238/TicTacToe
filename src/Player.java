import java.util.*;

public class Player {
    private String[] name;

    public Player (String[] name){
        this.name = new String[]{"Merlin", "Sauron", "Circe", "Hydra", "Basilisk", "Xenomorph"};
        this.name = name;
    }

    private String[] getZombieName(){
        return new String[]{name[((int) (Math.random() * 2))]};
    }

    private String[] getWizardName(){
        return new String[]{name[((int)(Math.random() * (6 - 3 + 1)) + 3)]};
    }


}
