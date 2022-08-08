package school.mjc.stage0.loops.task3;

public class DigitsSum {
    public void printDigitsSum(int t){
        String numStr = String.valueOf(Math.abs(t));
        int result = 0;
        for(int i = 0; i < numStr.length(); i++) {
            result += Integer.parseInt(String.valueOf(numStr.charAt(i)));
        }
        System.out.println(result);
    }
}
