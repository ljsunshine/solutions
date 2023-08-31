package org.example.CPUs;


// ConcreteProducts: CPU of Brand A
public class IntelCPU implements CPU {
    @Override
    public String getDetails() {
        return "CPU of Brand Intel";
    }
}

