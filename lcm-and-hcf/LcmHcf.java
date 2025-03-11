class MathCalculation {
    public int calculateHcf(int a, int b) {
        if (b == 0) {
            return a;
        } else {
            return calculateHcf(b, a % b);
        }
    }
}

public class LcmHcf {
    public static void main(String[] args) {
        MathCalculation mc = new MathCalculation();

        System.out.println(mc.calculateHcf(25, 15));
    }
}