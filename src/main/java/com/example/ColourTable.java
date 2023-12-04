package com.example;

import java.util.ArrayList;

public class ColourTable {
    ArrayList colours;
    public ColourTable() {
        throw new IllegalArgumentException("Must specify size of Colour Table");
    }
    public ColourTable(int size) {
        if (size <= 1 || size >= 1025 || (size & (size - 1)) != 0) {
            throw new IllegalArgumentException("Palette size must be a power of two and between 2 and 1024.");
        }
        this.colours = new ArrayList<>(size);
    }

    public void add(int rgb) {
        colours.add(rgb);
    }
}
