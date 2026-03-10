import java.util.ArrayList;

public class AUKFaculty extends AUKPerson {

    ArrayList<String> courses = new ArrayList<>();

    public AUKFaculty(String name) {
        super(name);
    }

    public void addCourse(String course){
        courses.add(course);
    }

    public void removeCourse(String course){
        courses.remove(course);
    }
}
