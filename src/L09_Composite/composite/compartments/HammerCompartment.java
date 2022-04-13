package L09_Composite.composite.compartments;

import L09_Composite.composite.abstraction.iToolCompartment;
import L09_Composite.composite.tools.Tools;

public class HammerCompartment implements iToolCompartment {

    Tools tool = Tools.HAMMER;

    @Override
    public void printToolCompartmentAssignment() {
        System.out.println("This compartment is for :" + tool);
    }
}
