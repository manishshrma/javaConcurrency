package impProblems.problem2;

import java.util.stream.IntStream;

public class Display {
    String name;

    public Display(String name) {
        this.name = name;
    }

    public void getname(String name)  {

        IntStream.range(0, 5).forEach(x -> System.out.println("thread Unsafe Zone,"+name));

        synchronized (this) {
            IntStream.range(0, 5).forEach((idx) -> {
                System.out.println(name);
            });
            this.name=name;
        }

        IntStream.range(0, 5).forEach(x -> System.out.println("thread Unsafe Zone,"+name));

    }
}
