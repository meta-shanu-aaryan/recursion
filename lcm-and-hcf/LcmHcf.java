class MathCalculation {
    public int calculateHcf(int a, int b) {
        if (b == 0) {
            return a;
        } else {
            return calculateHcf(b, a % b);
        }
    }

    public int calculateLcm(int a, int b) {

        int m = 0;
        m += b;

        if (m % b == 0 && m % a == 0) {
            return m;
        } else {
            return calculateLcm(a, b);
        }
    }
}

public class LcmHcf {
    public static void main(String[] args) {
        MathCalculation mc = new MathCalculation();

        System.out.println(mc.calculateHcf(25, 15));

        System.out.println(mc.calculateLcm(4, 3));
    }
}