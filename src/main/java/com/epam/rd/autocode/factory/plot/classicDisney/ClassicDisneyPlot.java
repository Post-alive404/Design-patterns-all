package com.epam.rd.autocode.factory.plot.classicDisney;

import com.epam.rd.autocode.factory.plot.Plot;

public class ClassicDisneyPlot implements Plot {
    private final String hero;
    private final String beloved;
    private final String villain;

    public ClassicDisneyPlot(String hero, String beloved, String villain) {
        this.hero = hero;
        this.beloved = beloved;
        this.villain = villain;
    }

    @Override
    public String toString() {
        return hero + " is great. " + hero + " and " + beloved + " love each other. " +
                villain + " interferes with their happiness but loses in the end.";
    }
}
