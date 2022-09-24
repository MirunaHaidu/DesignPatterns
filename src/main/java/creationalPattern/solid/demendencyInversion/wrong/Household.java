package creationalPattern.solid.demendencyInversion.wrong;

import java.util.List;

public class Household {
    private List<Cat> cats;

    public List<Cat> getCats() {
        return cats;
    }

    public void setCats(List<Cat> cats) {
        this.cats = cats;
    }
}
