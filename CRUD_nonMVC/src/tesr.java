public class tesr extends Student {
    public tesr(int id, String name, String classes) {
        super(id, name, classes);
    }

    public static void main(String[] args) {
        Student student1 = new Student(1, "A","10C");
        student1.setClasses("10C4");
        System.out.println(student1);
    }
}
