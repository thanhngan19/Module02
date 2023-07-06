import java.util.Objects;

public class house {
    int id;
    String name;



    public house(int id, String name) {
        this.id = id;
        this.name = name;
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
    public String toString() {
        return "house{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }



    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        house house = (house) o;
        return id == house.id && Objects.equals(name, house.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name);
    }
}
