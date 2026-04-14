package Part2;

public class Test {
    static void main() {

        Stack<Integer> s = new Stack<>();

        s.push(5);
        s.push(10);
        System.out.println(s); // 5 10
        System.out.println(s.peek()); //10
        int a =  s.pop();
        System.out.println(a + "; " + s); //10; 5
        System.out.println(s.size()); //1
        s.pop();
        System.out.println(s.size()); //0
        System.out.println(s.isEmpty()); //true

    }
}
