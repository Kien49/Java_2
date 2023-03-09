package Day1b.B3;

public class Student implements IComparator<Student>{
    private int id;
    private String name;
    private double marks;

    public Student(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public Student(int id, String name, double marks) {
        this.id = id;
        this.name = name;
        this.marks = marks;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getMarks() {
        return marks;
    }

    public void setMarks(double marks) {
        this.marks = marks;
    }

    @Override
    public String toString() {
        return "Student[" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", marks=" + marks +
                ']';
    }

    @Override
    public int compare(Student o) {
        if(marks == o.marks){
            return 0;
        }
        else if(marks > o.marks){
            return  1;
        }
        return -1;
    }
}
