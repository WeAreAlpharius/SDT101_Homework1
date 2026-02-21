package Part2;

public class Driver {

    public static void main(String[] args) {
        C c = new C();
        C c1 = new C(15, 20, "label");
        System.out.println(c.getX());
        System.out.println(c.getY());

        System.out.println(c1.getX());
        System.out.println(c1.getY());

        c.setX(5);
        c.setY(10);

        System.out.println(c.getX());
        System.out.println(c.getY());
    }
}
