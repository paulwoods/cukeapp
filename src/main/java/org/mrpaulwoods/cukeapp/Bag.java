package org.mrpaulwoods.cukeapp;

import java.util.ArrayList;
import java.util.List;

public class Bag {

    private List<String> things = new ArrayList<>();

    public boolean isEmpty() {
        return things.isEmpty();
    }

    public List<String> getThings() {
        return things;
    }

    public void add(String thing) {
        things.add(thing);
    }

    public void removeEverything() {
        things.clear();
    }

}
