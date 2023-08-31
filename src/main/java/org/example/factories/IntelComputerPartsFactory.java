package org.example.factories;


import org.example.CPUs.CPU;
import org.example.CPUs.IntelCPU;
import org.example.monitors.IntelMonitor;
import org.example.monitors.Monitor;

// ConcreteFactory: Creates CPUs and Monitors of Brand Intel
public class IntelComputerPartsFactory implements ComputerPartsFactory {
    @Override
    public CPU createCPU() {
        return new IntelCPU();
    }

    @Override
    public Monitor createMonitor() {
        return new IntelMonitor();
    }
}