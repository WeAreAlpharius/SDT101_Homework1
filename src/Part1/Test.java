package Part1;

import java.util.Arrays;

public class Test {

    static void main() {
        Integer[] a = {5, 2, 7, 0, 3, 9};
        Merge.sort(a);

        IO.println(Arrays.toString(a));
    }
}
