package Part2;

public class Test {
    static void main() {
        LinkedList<Integer> list = new LinkedList<>();
        list.add(6);
        list.add(0,4);
        try {
            list.add(4,4);
        } catch (Exception e) {
            System.out.println("Add Wrong index");
        }
        list.addFirst(9);
        System.out.println(list.get(2)); //6
        try {
            list.get(5);
        } catch (Exception e) {
            System.out.println("Get Wrong index");
        }
        System.out.println("\nAll list "+ list); //list: 9, 4, 6

        System.out.println(list.getSize());

        list.remove(Integer.valueOf(4));

        System.out.println("\nAll list "+ list); //list: 9, 6

        list.add(1,2);
        list.addFirst(2);
        list.add(2);
        System.out.println("\nAll list "+ list); //list: 2, 9, 2, 6, 2

        list.removeAll(2);
        System.out.println("\nAll list "+ list); //list: 9, 6

        list.remove(0);
        System.out.println("\nAll list "+ list); //list:  6

        try {
            list.remove(2);
        } catch (Exception e) {
            System.out.println("Remove Wrong index");
        }

        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);    //list : 6, 1, 2, 3, 4

        for (Integer e : list){
            System.out.println("Element: "+ e);
        }
    }
}
