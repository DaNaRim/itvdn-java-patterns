package L09_Composite.composite;

import L09_Composite.composite.abstraction.iToolCompartment;

import java.util.ArrayList;
import java.util.List;

public class ToolBox implements iToolCompartment {

    private List<iToolCompartment> toolCompartments;

    public ToolBox() {
        this.toolCompartments = new ArrayList<>();
    }

    @Override
    public void printToolCompartmentAssignment() {
        System.out.println("This compartment accommodates and puts in right order smaller tool's compartments");
    }

    public void printEachInnerToolCompartmentAssignment() {
        if (toolCompartments.isEmpty()) {
            System.out.println("The box does not contain any compartments");
        } else {
            toolCompartments.forEach(iToolCompartment::printToolCompartmentAssignment);
        }
    }

    public void addCompartment(iToolCompartment compartment) {
        toolCompartments.add(compartment);
    }

    public void removeCompartment(iToolCompartment compartment) {
        toolCompartments.remove(compartment);
    }

    public iToolCompartment getToolCompartment(int toolBoxNumber) {
        return toolCompartments.get(toolBoxNumber);
    }
}
