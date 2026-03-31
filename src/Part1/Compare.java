package Part1;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Compare {

    static int numElements = 100;
    static List<Integer> arrayList = new ArrayList<>();
    static List<Integer> linkedList = new LinkedList<>();
    static DecimalFormat formatter = new DecimalFormat("#,###");

    /* Attempt  | Add   | Get   | Remove    |
     * --------------------------------------
     * 1 Array  | 1181   | 192   | 598    |
     *   Linked | 1809   | 793   | 408    |
     * --------------------------------------
     * 2 Array  | 1016   | 278   | 485    |
     *   Linked | 1786   | 917   | 258    |
     * --------------------------------------
     * 3 Array  | 945    | 348   | 476    |
     *   Linked | 1591   | 894   | 273    |
     * --------------------------------------
     * 4 Array  | 1221   | 399    | 546    |
     *   Linked | 1983   | 1090   | 414    |
     * --------------------------------------
     * 5 Array  | 615    | 266    | 479    |
     *   Linked | 1345   | 1541   | 306    |
     * --------------------------------------
     */

    static void main() {
        AddFirst();
        GetIndex();
        RemoveFirst();
    }

    static void AddFirst(){

        long startTime = System.nanoTime();
        for (int i = 0; i < numElements; i++) {
            arrayList.addFirst(i * 10000);
        }
        long endTime = System.nanoTime();
        System.out.println("ArrayList insertion into beginning average time: " + formatter.format((endTime - startTime) / numElements) + " ns");

        startTime = System.nanoTime();
        for (int i = 0; i < numElements; i++) {
            linkedList.addFirst(i * 10000);
        }
        endTime = System.nanoTime();
        System.out.println("LinkedList insertion into beginning average time: " + formatter.format((endTime - startTime) / numElements) + " ns");

    }

    static void GetIndex(){

        long startTime = System.nanoTime();
        for (int i = 0; i < numElements; i++) {
            arrayList.get(i);
        }
        long endTime = System.nanoTime();
        System.out.println("ArrayList accessing average time: " + formatter.format((endTime - startTime) / numElements) + " ns");

        startTime = System.nanoTime();
        for (int i = 0; i < numElements; i++) {
            linkedList.get(i);
        }
        endTime = System.nanoTime();
        System.out.println("LinkedList accessing average time: " + formatter.format((endTime - startTime) / numElements) + " ns");

    }

    static void RemoveFirst(){

        long startTime = System.nanoTime();
        for (int i = 0; i < numElements; i++) {
            arrayList.removeFirst();
        }
        long endTime = System.nanoTime();
        System.out.println("ArrayList removing first element average time: " + formatter.format((endTime - startTime) / numElements) + " ns");

        startTime = System.nanoTime();
        for (int i = 0; i < numElements; i++) {
            linkedList.removeFirst();
        }
        endTime = System.nanoTime();
        System.out.println("LinkedList removing first element average time: " + formatter.format((endTime - startTime) / numElements) + " ns");

    }
}
