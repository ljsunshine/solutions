package org.example.CPUs;

// ConcreteProducts: CPU of Brand B
public class AMDCPU implements CPU {
    @Override
    public String getDetails() {
        return "CPU of Brand AMD";
    }
}