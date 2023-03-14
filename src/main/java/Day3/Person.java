package Day3;

public class Person {
    private int id;
    private String name;
    private String render;
    public Person(){

    }
    public Person(int id, String name, String render) {
        this.id = id;
        this.name = name;
        this.render = render;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRender() {
        return render;
    }

    public void setRender(String render) {
        this.render = render;
    }

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", render='" + render + '\'' +
                '}';
    }
}
