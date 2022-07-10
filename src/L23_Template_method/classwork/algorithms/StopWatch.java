package L23_Template_method.classwork.algorithms;

import L23_Template_method.classwork.abstravtions.AbstractTimer;

public class StopWatch extends AbstractTimer  {


    @Override
    public void startTimer(int delayTime) {
        for (int t = delayTime; t > 0; t--) {
            System.out.print(t);
            timeout(1000);
            System.out.print("\b");
        }
        inform();
    }

    @Override
    public void inform() {
        System.out.println("Finish");
    }
}
