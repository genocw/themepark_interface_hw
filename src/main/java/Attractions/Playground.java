package Attractions;

import Interfaces.ISecurity;
import Main.Attraction;
import Main.Visitor;

public class Playground extends Attraction implements ISecurity {

    public Playground(String name) {
        super(name);
    }

    public boolean isAllowedTo(Visitor visitor) {
        if (visitor.getAge() <= 15) {
            return true;
        }
        return false;
    }

}
