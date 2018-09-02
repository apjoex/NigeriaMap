package com.apjoex.nigeriamap;

import android.graphics.RectF;

import com.sdsmdg.harjot.vectormaster.models.PathModel;

public class State {

    protected PathModel pathModel;
    protected String name;
    protected ZoneTypes zoneType;
    private NigeriaMap map;

    State(PathModel pathModel, String name, ZoneTypes zoneType, NigeriaMap nigeriaMap) {
        this.pathModel = pathModel;
        this.name = name;
        this.zoneType = zoneType;
        this.map = nigeriaMap;
        RectF bounds = new RectF();
        pathModel.getPath().computeBounds(bounds, true);
    }

    public void setBackgroundColor(int color) {
        pathModel.setFillColor(color);
        map.updateLegend();
    }
}

enum ZoneTypes {
    NORTH_CENTRAL,
    NORTH_EAST,
    NORTH_WEST,
    SOUTH_EAST,
    SOUTH_WEST,
    SOUTH_SOUTH
}