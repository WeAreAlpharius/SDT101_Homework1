package Part2;

import static java.lang.Math.pow;

public class Part2 {

    public static double powerRec(double x, int n) {
       if (n <= 0) return 1;
       return x * powerRec(x , n-1);
    }

    static void main() {

        for (int i = 0, j = 15; i < 15 && j > 1; i++, j--) {

            if(pow(j, i) == powerRec(j, i)){
                IO.println("Test passed: " + i);
            }
            else {IO.println("Test not passed: " + i);}

        }
    }

}
