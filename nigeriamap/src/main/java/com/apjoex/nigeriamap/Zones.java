package com.apjoex.nigeriamap;

import java.util.ArrayList;

public class Zones {

    public static Zone NORTH_CENTRAL;
    public static Zone NORTH_EAST;
    public static Zone NORTH_WEST;
    public static Zone SOUTH_EAST;
    public static Zone SOUTH_WEST;
    public static Zone SOUTH_SOUTH;


    public Zones(ArrayList<State> allStates, NigeriaMap nigeriaMap) {
        //Get states in North Central
        ArrayList<State> north_central_states = new ArrayList<>();
        for (State s: allStates) {
            if (s.zoneType == ZoneTypes.NORTH_CENTRAL){
                north_central_states.add(s);
            }
        }
        NORTH_CENTRAL = new Zone(north_central_states, "NORTH CENTRAL", nigeriaMap);

        //Get states in North East
        ArrayList<State> north_east_states = new ArrayList<>();
        for (State s: allStates) {
            if (s.zoneType == ZoneTypes.NORTH_EAST){
                north_east_states.add(s);
            }
        }
        NORTH_EAST = new Zone(north_east_states, "NORTH EAST", nigeriaMap);

        //Get states in North west
        ArrayList<State> north_west_states = new ArrayList<>();
        for (State s: allStates) {
            if (s.zoneType == ZoneTypes.NORTH_WEST){
                north_west_states.add(s);
            }
        }
        NORTH_WEST = new Zone(north_west_states, "NORTH WEST", nigeriaMap);

        //Get states in South east
        ArrayList<State> south_east_states = new ArrayList<>();
        for (State s: allStates) {
            if (s.zoneType == ZoneTypes.SOUTH_EAST){
                south_east_states.add(s);
            }
        }
        SOUTH_EAST = new Zone(south_east_states, "SOUTH EAST", nigeriaMap);

        //Get states in South West
        ArrayList<State> south_west_states = new ArrayList<>();
        for (State s: allStates) {
            if (s.zoneType == ZoneTypes.SOUTH_WEST){
                south_west_states.add(s);
            }
        }
        SOUTH_WEST = new Zone(south_west_states, "SOUTH WEST", nigeriaMap);

        //Get states in South south
        ArrayList<State> south_south_states = new ArrayList<>();
        for (State s: allStates) {
            if (s.zoneType == ZoneTypes.SOUTH_SOUTH){
                south_south_states.add(s);
            }
        }
        SOUTH_SOUTH = new Zone(south_south_states, "SOUTH SOUTH", nigeriaMap);

    }

    public ArrayList<Zone> getAllZones() {
        ArrayList<Zone> allZones = new ArrayList<>();
        allZones.add(NORTH_CENTRAL);
        allZones.add(NORTH_EAST);
        allZones.add(NORTH_WEST);
        allZones.add(SOUTH_EAST);
        allZones.add(SOUTH_WEST);
        allZones.add(SOUTH_SOUTH);
        return allZones;
    }
}
