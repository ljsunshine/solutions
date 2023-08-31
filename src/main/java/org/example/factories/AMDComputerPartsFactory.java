package org.example.factories;


import org.example.CPUs.AMDCPU;
import org.example.CPUs.CPU;
import org.example.monitors.AMDMonitor;
import org.example.monitors.Monitor;

// ConcreteFactory: Creates CPUs and Monitors of Brand AMD
public class AMDComputerPartsFactory implements ComputerPartsFactory {
    @Override
    public CPU createCPU() {
        return new AMDCPU();
    }

    @Override
    public Monitor createMonitor() {
        return new AMDMonitor();
    }
}