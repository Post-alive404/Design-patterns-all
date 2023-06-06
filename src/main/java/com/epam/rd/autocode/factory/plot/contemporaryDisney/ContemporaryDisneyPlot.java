package com.epam.rd.autocode.factory.plot.contemporaryDisney;

import com.epam.rd.autocode.factory.plot.Plot;

public class ContemporaryDisneyPlot implements Plot {

    private final String hero;
    private final String epicCrisis;
    private final String funnyFriend;
    public ContemporaryDisneyPlot(String hero, String epicCrisis, String funnyFriend) {
        this.hero = hero;
        this.epicCrisis = epicCrisis;
        this.funnyFriend = funnyFriend;
    }

    @Override
    public String toString() {
        return hero + " feels a bit awkward and uncomfortable. But personal issues fades, when a big trouble comes - "
                + epicCrisis + ". " + hero + " stands up against it, but with no success at first.But putting self together and help of friends, including spectacular funny "
                + funnyFriend + " restore the spirit and " + hero + " overcomes the crisis and gains gratitude and respect";
    }
}
