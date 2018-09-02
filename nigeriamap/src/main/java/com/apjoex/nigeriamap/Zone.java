package com.apjoex.nigeriamap;

import java.util.ArrayList;

public class Zone {

    public ArrayList<State> states;
    public String name;
    private NigeriaMap map;

    public Zone(ArrayList<State> states, String name, NigeriaMap nigeriaMap) {
        this.states = states;
        this.name = name;
        this.map = nigeriaMap;
    }

    public void setBackgroundColor(int color) {
        map.goGreyScale();
        for (State s : states) {
            s.pathModel.setFillColor(color);
        }
        map.updateLegend();
    }
}
