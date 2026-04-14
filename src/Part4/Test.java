package Part4;


public class Test {

    static void main() {
        Queue<Integer> q = new Queue<>();

        q.enqueue(5);
        q.enqueue(10);
        System.out.println(q); // 5 10
        int a = q.dequeue();
        System.out.println(a + "; " + q); //5; 10

        System.out.println(q.isEmpty()); //false
        System.out.println(q.size()); // 1
        System.out.println(q.peek()); // 10
    }
}
