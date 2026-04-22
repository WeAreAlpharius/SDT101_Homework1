package Part1;

public class Part1 {

    public static int sum1toNLoop(int n) { // You may assume n ≥ 1
        int sum = 0;
        for (int i = 1; i <= n; ++i) {
            sum += i;
        }
        return sum;
    }

    public static int sum1toNRec(int n){
        if(n <= 0) return 0;
        return n + sum1toNRec(n - 1);
    }

    static void main() {

        for (int i = 0; i < 15; i++) {

            if(sum1toNLoop(i) == sum1toNRec(i)){
                IO.println("Test passed: " + i);
            }
            else {IO.println("Test not passed: " + i);}

        }
    }

}
