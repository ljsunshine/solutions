package org.example;

import org.example.CPUs.CPU;
import org.example.factories.AMDComputerPartsFactory;
import org.example.factories.ComputerPartsFactory;
import org.example.factories.IntelComputerPartsFactory;
import org.example.monitors.Monitor;

public class Main {
    public static void main(String[] args) {
        // Create a computer factory of Brand Intel
        ComputerPartsFactory intelFactory = new IntelComputerPartsFactory();
        CPU intelCPU = intelFactory.createCPU();
        Monitor intelMonitor = intelFactory.createMonitor();
        System.out.println("Intel: " + intelCPU.getDetails() + ", " + intelMonitor.getDetails());

        // Create a computer factory of Brand AMD
        ComputerPartsFactory amdFactory = new AMDComputerPartsFactory();
        CPU amdCPU = amdFactory.createCPU();
        Monitor amdMonitor = amdFactory.createMonitor();
        System.out.println("AMD: " + amdCPU.getDetails() + ", " + amdMonitor.getDetails());
    }
}
