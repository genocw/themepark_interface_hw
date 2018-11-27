package Main;

import Interfaces.IReviewed;

public abstract class Attraction implements IReviewed {

    private String name;
    private int rating;

    public Attraction(String name) {
        this.name = name;
        this.rating = 10;
    }

    public String getName() {
        return name;
    }

    public int getRating() {
        return this.rating;
    }

}
