public class Student implements Comparable<Student>{
    private String firstName;
    private String lastName;
    private int mark;

    public Student(String firstName, String lastName, int mark){
        this.firstName = firstName;
        this.lastName = lastName;
        this.mark = mark;
    }

    @Override
    public int compareTo(Student o) {
        if (Integer.valueOf(mark).compareTo(Integer.valueOf(o.getMark()))<0)
            return -1;
        if (Integer.valueOf(mark).compareTo(Integer.valueOf(o.getMark()))==0)
            return 0;
        return 1;
    }

    @Override
    public String toString() {
        return "Student Details: " + firstName + " " + lastName + " " + mark;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getMark() {
        return mark;
    }

    public void setMark(int mark) {
        this.mark = mark;
    }
}
