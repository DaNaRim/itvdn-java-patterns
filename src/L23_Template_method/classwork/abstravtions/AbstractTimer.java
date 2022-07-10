package L23_Template_method.classwork.abstravtions;

public abstract class AbstractTimer {

    @SuppressWarnings("StatementWithEmptyBody")
    public void timeout(int delay) {
        long end = System.currentTimeMillis() + delay;
        while (System.currentTimeMillis() < end) {
        }
    }

    public abstract void startTimer(int delayTime);

    public abstract void inform();
}
