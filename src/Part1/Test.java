package Part1;

public class Test {
    static void main() {
        Person o1 = new Person(1920);
        Person o2 = new Person(1954);

        IO.println(o1.compareTo(o2));
        IO.println(o2.compareTo(o1));
        IO.println(o1.compareTo(o1));
    }
}
