package Part1;

public class Person implements Comparable<Person>{
    private final int BirthYear;

    public Person(int birthYear){
        BirthYear = birthYear;
    }

    @Override
    public int compareTo(Person o) {
        return Integer.compare(BirthYear,o.BirthYear);
    }
}
