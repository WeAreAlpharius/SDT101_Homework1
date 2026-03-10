public abstract class AUKPerson implements Comparable<AUKPerson>{

    static long id_num = 0;

    String name;
    long id;

    public AUKPerson(String name) {
        id_num++;

        this.name = name;
        id = id_num;
    }

    public void changeId(long id){
        this.id = id;
    }

    @Override
    public int compareTo(AUKPerson o) {
        return Long.compare(id, o.id);
    }

    @Override
    public String toString() {
        return "Person: " + name + ", id: " + id;
    }
}
