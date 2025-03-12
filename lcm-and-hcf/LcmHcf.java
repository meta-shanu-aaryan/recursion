import java.util.InputMismatchException;
import java.util.Scanner;

class MathCalculation {

    /**
     * Calculates the Highest Common Factor of two numbers
     * 
     * @param a The first positive number
     * @param b Second Positive number
     * @return HCF of both
     */
    public int calculateHcf(int a, int b) {
        try {
            if (a <= 0) {
                throw new AssertionError("Argument can't be negative");
            }

            if (b == 0) {
                return a;
            } else {
                return calculateHcf(b, a % b);
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return -1;
        }
    }

    /**
     * Calculates LCM of two positive numbers
     * 
     * @param a The first positive number
     * @param b Second Positive number
     * @param m Additional argument to be set as 0 to call recursive function
     * @return LCM of both positive numbers
     */
    public int calculateLcm(int a, int b, int m) {
        try {
            if (a <= 0 || b <= 0 || m != 0) {
                throw new AssertionError("Argument can't be negative ");
            }
            if (a > b) {
                m += b;

            } else {
                m += a;
            }

            if (m % b == 0 && m % a == 0) {
                return m;
            } else {
                return calculateLcm(a, b, m);
            }

        } catch (Exception e) {
            System.out.println(e.getMessage());
            return -1;
        }
    }
}

public class LcmHcf {
    public static void main(String[] args) {
        MathCalculation mc = new MathCalculation();
        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Enter the 1st positive Integer ");
            int a = sc.nextInt();
            System.out.print("Enter the 1st positive Integer ");
            int b = sc.nextInt();

            System.out.println("LCM of " + a + " and " + b + " is " + mc.calculateLcm(a, b, 0));
            System.out.println("HCF of " + a + " and " + b + " is " + mc.calculateHcf(a, b));
        } catch (InputMismatchException e) {
            System.out.println("Enter Integer value only");
        } finally {
            sc.close();
        }
    }
}