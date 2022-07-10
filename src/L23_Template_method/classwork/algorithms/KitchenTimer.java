package L23_Template_method.classwork.algorithms;

import L23_Template_method.classwork.abstravtions.AbstractTimer;

public class KitchenTimer extends AbstractTimer {

    @Override
    public void startTimer(int delayTime) {
        for (int t = delayTime; t >= 0; t--) {
            if (t == 0) {
                System.out.print("\b");
                this.inform();
                break;
            }
            if (t > 4) {
                System.out.print("*");
            } else if (t == 4) {
                System.out.println("*");
            } else {
                System.out.print("\b");
                System.out.print(t);
            }
            timeout(1000);
        }
    }

    @Override
    public void inform() {
        System.out.println("Alarm!!!");
        timeout(500);
        System.out.println("Alarm!!!");
        timeout(500);
        System.out.println("Alarm!!!");
    }

}
