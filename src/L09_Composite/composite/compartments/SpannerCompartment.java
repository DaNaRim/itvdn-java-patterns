package L09_Composite.composite.compartments;

import L09_Composite.composite.abstraction.iToolCompartment;
import L09_Composite.composite.tools.Tools;

public class SpannerCompartment implements iToolCompartment {

    private final Tools tool = Tools.SPANNER;

    @Override
    public void printToolCompartmentAssignment() {
        System.out.println("This compartment is for :" + tool);
    }
}
