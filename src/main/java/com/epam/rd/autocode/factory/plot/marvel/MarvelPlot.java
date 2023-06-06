package com.epam.rd.autocode.factory.plot.marvel;

import com.epam.rd.autocode.factory.plot.Plot;

public class MarvelPlot implements Plot {

    private final String heroes;
    private final String  epicCrisis;
    private final String  villain;

    public MarvelPlot(String heroes, String epicCrisis, String villain) {
        this.heroes = heroes;
        this.epicCrisis = epicCrisis;
        this.villain = villain;
    }

    @Override
    public String toString() {
        return epicCrisis + " threatens the world. But " + heroes + " on guard. So, no way that intrigues of "
        + villain + " overcome the willpower of inflexible heroes";
    }
}
