package school.mjc.stage0.loops.task3;

public class FibonacciSeries {
    public void printFibonacci(int lastFibonacci) {
        int a = 1;
        int b = 1;
        if(lastFibonacci > 0) {
            System.out.println(0);
        }
        if(lastFibonacci > 1) {
            System.out.println(1);
        }
        if(lastFibonacci > 2) {
            System.out.println(1);
        }
        for (int i = 3; i < lastFibonacci; i++) {
            int c = a + b;
            a = b;
            b = c;
            System.out.println(b);
        }
    }
}
