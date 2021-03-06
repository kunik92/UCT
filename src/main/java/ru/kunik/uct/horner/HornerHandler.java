package ru.kunik.uct.horner;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import ru.kunik.uct.MainHandler;

public class HornerHandler extends MainHandler {
    
    public static volatile List<Double> hornerMultipliers = new LinkedList<Double>();
    public static volatile List<Double> hornerAnswer = new ArrayList<Double>();
    
    public HornerHandler() {
        super("1.0.0", "Horner");
    }
    
    @Override
    public void initialize() {
        //Nothing to do here
    }
}
