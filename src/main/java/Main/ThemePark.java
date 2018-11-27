package Main;

import Interfaces.IReviewed;

import java.util.ArrayList;

public class ThemePark {

    ArrayList<IReviewed> reviewedList;

    public ThemePark() {
        this.reviewedList = new ArrayList<>();
    }

    public ArrayList<IReviewed> getAllReviewed() {
        return this.reviewedList;
    }

    public void addReviewed(IReviewed newReviewed) {
        this.reviewedList.add(newReviewed);
    }

}
