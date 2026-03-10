public class AUKStaff extends AUKPerson {

    String occupation;
    int hours_of_work;

    public AUKStaff(String name, String occupation, int hours_of_work) {
        super(name);
        this.occupation = occupation;
        this.hours_of_work = hours_of_work;
    }

    public void work(int hWork) {
        this.hours_of_work += hWork;
    }

    public void changeOccupation(String newOccupation) {
        this.occupation = newOccupation;
    }
}
