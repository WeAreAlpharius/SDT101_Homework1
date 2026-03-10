public class AUKStudent extends AUKPerson{

    float avg_score;
    int amount_of_courses;

    public AUKStudent(String name, float avg_score, int amount_of_courses) {
        super(name);
        this.avg_score = avg_score;
        this.amount_of_courses = amount_of_courses;
    }

    public void updateScore(float avg_score) {
        this.avg_score = avg_score;
    }

    public void addCourse(){
        amount_of_courses++;
    }
}
