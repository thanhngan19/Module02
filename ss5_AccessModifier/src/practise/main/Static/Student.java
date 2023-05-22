package practise.main.Static;

public class Student {
    private int id; // biến toàn cục, biến đối tượng sử dụng chugn trong cả class
    private String name;
    static int count=1; // biến static
    private double score;
    public int getId() {//pt trả về giá trị ì đuọc khỏi tạo
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        if ( score < 0 || score > 10) {
            System.out.println("Điểm không hợp lệ");
            // exception
        } else {
            this.score = score;
        }
    }

//    static { // Khối static
//        count =1;
//    }


    public Student(int id, String name) {//constructor
        this.id = id;
        this.name = name;
        int x = 2; // biến cục bộ
    }

    public void test() {

        int a = 2; // biến cục bộ mất khi hàm mất
    }
}
