import java.io.*;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.ArrayList;

public class StudentReadFile {
    static ArrayList<Student> Student = new ArrayList<>();
    private static final String path= "E:\\New Volume\\codegym\\Module02\\ReadWriteEmployee\\src\\Student.csv";
    public static ArrayList<Student> ReadFile(){
        File file = new File(path);
        BufferedReader bufferedReader;
        try {
            bufferedReader = new BufferedReader(new FileReader(file));
            String line;
            while((line=bufferedReader.readLine())!=null){
                if (!line.isEmpty()){
                    String [] strings = line.split(",");
                    Student student= new Student();
                    student.setId(Integer.parseInt(strings[0]));
                    student.setName(strings[1]);
                    DateTimeFormatter formatter1 = DateTimeFormatter.ofPattern("[dd/MM/yyyy][d/M/yyyy]");
                    LocalDate localDate = LocalDate.parse(strings[2],formatter1);
//                    System.out.println(localDate);
//                    LocalDate newDate = LocalDate.parse(formatter1.format(localDate));
//                    System.out.println(formatter1.format(localDate));
                    student.setBirthDay(localDate);
                    student.setClassName(strings[3]);
                    Student.add(student);
                }
            }
            bufferedReader.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch(DateTimeParseException e){
            System.out.println("k parse dc ngày");
        }
        return Student;
    }

}
