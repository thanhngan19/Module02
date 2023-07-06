import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Student {
    private int id;
    private String name;
    private LocalDate birthDay;
    private String className;

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

    public LocalDate getBirthDay() {
        return birthDay;
    }

    public void setBirthDay(LocalDate birthDay) {
        this.birthDay = birthDay;
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    @Override
    public String toString() {
        DateTimeFormatter formatter1 = DateTimeFormatter.ofPattern("[dd/MM/yyyy]");
        return "Student{" +
                "id=" + id +
                ", name=" + name + '\'' +
                ", birthDay=" + formatter1.format(birthDay) +
                ", className=" + className + '\'' +
                '}';
    }

    public Student(int id, String name, LocalDate birthDay, String className) {
        this.id = id;
        this.name = name;
        this.birthDay = birthDay;
        this.className = className;
    }

    public Student() {
    }
}
