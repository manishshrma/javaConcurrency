package impProblems.problem2;
// Doubt
public class Demo {
    public static void main(String[] args) {

        Display d=new Display("AnyName");
        Thread1 t1=new Thread1(d);
        Thread2 t2=new Thread2(d);
        t1.start();
        t2.start();
    }
}
