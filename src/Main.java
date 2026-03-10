import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {

        ArrayList<AUKPerson> a = new ArrayList<>();
        a.add( new AUKFaculty("Faculty1"));
        a.add(0, new AUKFaculty("Faculty2"));

        a.add(1, new AUKStudent("Stud1", 89.6F, 4));
        a.add(0, new AUKStudent("Stud2", 95.2f, 5));


        a.add(2, new AUKStaff("Staff1", "TA", 38));
        a.add(1, new AUKStaff("Staff2", "IT", 93));

        for (AUKPerson i : a){
            System.out.println(i.toString());
        }

        System.out.println();

        Collections.sort(a);

        for (AUKPerson i : a){
            System.out.println(i.toString());
        }
    }
}
