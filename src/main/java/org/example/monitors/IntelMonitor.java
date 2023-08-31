package org.example.monitors;


// ConcreteProducts: Monitor of Brand A
public class IntelMonitor implements Monitor {
    @Override
    public String getDetails() {
        return "Monitor of Brand Intel";
    }
}