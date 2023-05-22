package practise;

public class Student {
    int id;
    static String name;
    double score;

    public Student() {

    }

    public Student(String name, double score) {
        this.name = name;
        this.score = score;
    }

    public Student(int id, String name, double score) {
        this.id = id;
        this.name = name;
        this.score = score;
    }


     void run() {
        System.out.println(name + "có thể chạy");
    }

    String display() {
        return String.format("%s - %s - %s",id, name, score);//this id vì định danh duy nhất
    }


}
