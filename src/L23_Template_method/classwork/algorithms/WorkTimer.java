package L23_Template_method.classwork.algorithms;

import L23_Template_method.classwork.abstravtions.AbstractTimer;

public class WorkTimer extends AbstractTimer {

    @Override
    public void startTimer(int workTime) {
        for (int t = 0; t <= workTime; t++) {
            if (t == workTime) {
                this.inform();
                break;
            }
            if (t == workTime - 1) {
                String message = "1 hour remains! Finish your job and get ready to go home!";
                System.out.print(message);
                timeout(4000);
                for (int j = message.length(); j > 0; j--) {
                    System.out.print("\b");
                }
                continue;
            }
            if (t < workTime - 2) {
                System.out.print("*");
            } else {
                System.out.println("*");
            }
            timeout(1000);
        }
    }

    @Override
    public void inform() {
        System.out.println("Time to go home!!!");
    }
}
