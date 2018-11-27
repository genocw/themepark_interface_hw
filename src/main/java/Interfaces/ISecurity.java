package Interfaces;

import Main.Visitor;

public interface ISecurity {

    public boolean isAllowedTo(Visitor visitor);

}
