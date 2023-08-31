package org.example.monitors;


// ConcreteProducts: Monitor of Brand B
public class AMDMonitor implements Monitor {
    @Override
    public String getDetails() {
        return "Monitor of Brand AMD";
    }
}