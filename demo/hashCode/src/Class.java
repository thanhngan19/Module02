import java.util.Objects;

public class Class implements Comparable<Class> {
    int id;
    String name;

    public Class(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public Class() {
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

    @Override
    public boolean equals(Object o) {
        Class other = (Class) o;
        if (o == null || !(o instanceof Class)) {
            return false;
        }
        if (this.id == other.id|| this.name==other.name) {
            return true;
        }
        return false;
    }

    @Override
    public int hashCode() {
        return 12;
    }

    @Override
    public String toString() {
        return "Class{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }

    @Override
    public int compareTo(Class o) {
        if(o.getId()== this.getId()){
           return (this.getId()- o.getId());
        }else{
            return -1;
        }
}}
