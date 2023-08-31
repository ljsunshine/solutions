package org.example.factories;


import org.example.CPUs.CPU;
import org.example.monitors.Monitor;

// AbstractFactory: Interface for creating CPUs and Monitors
public interface ComputerPartsFactory {
    CPU createCPU();
    Monitor createMonitor();
}
