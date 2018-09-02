package com.apjoex.nigeriamap;

import com.sdsmdg.harjot.vectormaster.VectorMasterDrawable;

import java.util.ArrayList;

public class States {

    public static State ABIA;
    public static State ADAMAWA;
    public static State AKWA_IBOM;
    public static State ANAMBRA;
    public static State BAUCHI;
    public static State BAYELSA;
    public static  State BENUE;
    public static  State BORNO;
    public static  State CROSS_RIVER;
    public static  State DELTA;
    public static  State EBONYI;
    public static  State ENUGU;
    public static  State EDO;
    public static  State EKITI;
    public static  State GOMBE;
    public static  State IMO;
    public static  State JIGAWA;
    public static  State KADUNA;
    public static  State KANO;
    public static  State KATSINA;
    public static  State KEBBI;
    public static  State KOGI;
    public static  State KWARA;
    public static  State LAGOS;
    public static  State NASSARAWA;
    public static  State NIGER;
    public static  State OGUN;
    public static  State ONDO;
    public static  State OYO;
    public static  State OSUN;
    public static  State PLATEAU;
    public static  State RIVERS;
    public static  State SOKOTO;
    public static  State TARABA;
    public static  State YOBE;
    public static  State ZAMFARA;
    public static  State FCT;

    private ArrayList<State> allStates = new ArrayList<>();

    public States(VectorMasterDrawable vectorMasterDrawable, NigeriaMap nigeriaMap) {

        ABIA = new State(vectorMasterDrawable.getPathModelByName("abia"), "ABIA", ZoneTypes.SOUTH_EAST, nigeriaMap);
        ADAMAWA = new State(vectorMasterDrawable.getPathModelByName("adamawa"), "ADAMAWA", ZoneTypes.NORTH_EAST, nigeriaMap);
        AKWA_IBOM = new State(vectorMasterDrawable.getPathModelByName("akwa_ibom"), "AKWA IBOM", ZoneTypes.SOUTH_SOUTH, nigeriaMap);
        ANAMBRA = new State(vectorMasterDrawable.getPathModelByName("anambra"), "ANAMBRA", ZoneTypes.SOUTH_EAST, nigeriaMap);
        BAUCHI = new State(vectorMasterDrawable.getPathModelByName("bauchi"), "BAUCHI", ZoneTypes.NORTH_EAST, nigeriaMap);
        BAYELSA = new State(vectorMasterDrawable.getPathModelByName("bayelsa"), "BAYELSA", ZoneTypes.SOUTH_SOUTH, nigeriaMap);
        BENUE = new State(vectorMasterDrawable.getPathModelByName("benue"),"BENUE", ZoneTypes.NORTH_CENTRAL, nigeriaMap);
        BORNO = new State(vectorMasterDrawable.getPathModelByName("borno"), "BORNO", ZoneTypes.NORTH_EAST, nigeriaMap);
        CROSS_RIVER = new State(vectorMasterDrawable.getPathModelByName("cross_river"), "CROSS RIVER", ZoneTypes.SOUTH_SOUTH, nigeriaMap);
        DELTA = new State(vectorMasterDrawable.getPathModelByName("delta"),"DELTA", ZoneTypes.SOUTH_SOUTH, nigeriaMap);
        EBONYI = new State(vectorMasterDrawable.getPathModelByName("ebonyi"),"EBONYI", ZoneTypes.SOUTH_EAST, nigeriaMap);
        ENUGU = new State(vectorMasterDrawable.getPathModelByName("enugu"),"ENUGU", ZoneTypes.SOUTH_EAST, nigeriaMap);
        EDO = new State(vectorMasterDrawable.getPathModelByName("edo"),"EDO", ZoneTypes.SOUTH_SOUTH, nigeriaMap);
        EKITI = new State(vectorMasterDrawable.getPathModelByName("ekiti"),"EKITI", ZoneTypes.SOUTH_WEST, nigeriaMap);
        GOMBE = new State(vectorMasterDrawable.getPathModelByName("gombe"),"GOMBE", ZoneTypes.NORTH_EAST, nigeriaMap);
        IMO = new State(vectorMasterDrawable.getPathModelByName("imo"),"IMO", ZoneTypes.SOUTH_EAST, nigeriaMap);
        JIGAWA = new State(vectorMasterDrawable.getPathModelByName("jigawa"),"JIGAWA", ZoneTypes.NORTH_WEST, nigeriaMap);
        KADUNA = new State(vectorMasterDrawable.getPathModelByName("kaduna"),"KADUNA", ZoneTypes.NORTH_WEST, nigeriaMap);
        KANO = new State(vectorMasterDrawable.getPathModelByName("kano"),"KANO", ZoneTypes.NORTH_WEST, nigeriaMap);
        KATSINA = new State(vectorMasterDrawable.getPathModelByName("katsina"),"KATSINA", ZoneTypes.NORTH_WEST, nigeriaMap);
        KEBBI = new State(vectorMasterDrawable.getPathModelByName("kebbi"),"KEBBI", ZoneTypes.NORTH_WEST, nigeriaMap);
        KOGI = new State(vectorMasterDrawable.getPathModelByName("kogi"),"KOGI", ZoneTypes.NORTH_CENTRAL, nigeriaMap);
        KWARA = new State(vectorMasterDrawable.getPathModelByName("kwara"),"KWARA", ZoneTypes.NORTH_CENTRAL, nigeriaMap);
        LAGOS = new State(vectorMasterDrawable.getPathModelByName("lagos"),"LAGOS", ZoneTypes.SOUTH_WEST, nigeriaMap);
        NASSARAWA = new State(vectorMasterDrawable.getPathModelByName("nassarawa"),"NASSARAWA", ZoneTypes.NORTH_CENTRAL, nigeriaMap);
        NIGER =new State( vectorMasterDrawable.getPathModelByName("niger"),"NIGER", ZoneTypes.NORTH_CENTRAL, nigeriaMap);
        OGUN = new State(vectorMasterDrawable.getPathModelByName("ogun"),"OGUN", ZoneTypes.SOUTH_WEST, nigeriaMap);
        ONDO = new State(vectorMasterDrawable.getPathModelByName("ondo"),"ONDO", ZoneTypes.SOUTH_WEST, nigeriaMap);
        OYO = new State(vectorMasterDrawable.getPathModelByName("oyo"),"OYO", ZoneTypes.SOUTH_WEST, nigeriaMap);
        OSUN = new State(vectorMasterDrawable.getPathModelByName("osun"),"OSUN", ZoneTypes.SOUTH_WEST, nigeriaMap);
        PLATEAU = new State(vectorMasterDrawable.getPathModelByName("plateau"),"PLATEAU", ZoneTypes.NORTH_CENTRAL, nigeriaMap);
        RIVERS = new State(vectorMasterDrawable.getPathModelByName("rivers"),"RIVERS", ZoneTypes.SOUTH_SOUTH, nigeriaMap);
        SOKOTO = new State(vectorMasterDrawable.getPathModelByName("sokoto"),"SOKOTO", ZoneTypes.NORTH_WEST, nigeriaMap);
        TARABA = new State(vectorMasterDrawable.getPathModelByName("taraba"), "TARABA", ZoneTypes.NORTH_EAST, nigeriaMap);
        YOBE = new State(vectorMasterDrawable.getPathModelByName("yobe"), "YOBE", ZoneTypes.NORTH_EAST, nigeriaMap);
        ZAMFARA = new State(vectorMasterDrawable.getPathModelByName("zamfara"), "ZAMFARA", ZoneTypes.NORTH_WEST, nigeriaMap);
        FCT = new State(vectorMasterDrawable.getPathModelByName("fct"), "FCT", ZoneTypes.NORTH_CENTRAL, nigeriaMap);

        allStates.add(ABIA);
        allStates.add(ADAMAWA);
        allStates.add(AKWA_IBOM);
        allStates.add(ANAMBRA);
        allStates.add(BAUCHI);
        allStates.add(BAYELSA);
        allStates.add(BENUE);
        allStates.add(BORNO);
        allStates.add(CROSS_RIVER);
        allStates.add(DELTA);
        allStates.add(EBONYI);
        allStates.add(ENUGU);
        allStates.add(EDO);
        allStates.add(EKITI);
        allStates.add(GOMBE);
        allStates.add(IMO);
        allStates.add(JIGAWA);
        allStates.add(KADUNA);
        allStates.add(KANO);
        allStates.add(KATSINA);
        allStates.add(KEBBI);
        allStates.add(KOGI);
        allStates.add(KWARA);
        allStates.add(LAGOS);
        allStates.add(NASSARAWA);
        allStates.add(NIGER);
        allStates.add(OGUN);
        allStates.add(ONDO);
        allStates.add(OYO);
        allStates.add(OSUN);
        allStates.add(PLATEAU);
        allStates.add(RIVERS);
        allStates.add(SOKOTO);
        allStates.add(TARABA);
        allStates.add(YOBE);
        allStates.add(ZAMFARA);
        allStates.add(FCT);
    }

    public ArrayList<State> getAllStates() {
        return allStates;
    }

}
