public class Student {
    private String name;
    private String classes;
    private int id;

    public Student(int id, String name, String classes) {
        this.name = name;
        this.classes = classes;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    void setName(String name) {
        this.name = name;
    }

    public String getClasses() {
        return classes;
    }

    public void setClasses(String classes) {
        this.classes = classes;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return  id +","+ name + "," +
                 classes + '\'';
    }
}

