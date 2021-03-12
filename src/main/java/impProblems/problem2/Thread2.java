package impProblems.problem2;

public class Thread2 extends Thread {
    Display d;

    Thread2(Display d) {
        this.d = d;
    }

    @Override
    public void run() {
            d.getname("Thread 2");
    }
}
