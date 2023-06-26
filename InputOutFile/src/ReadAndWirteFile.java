import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ReadAndWirteFile {
    public List<Integer> readFile(String path){
        List<Integer> numbers = new ArrayList<>();
        try {
            File file = new File(path);

            if (!file.exists()) {
                throw new FileNotFoundException();
            }

            BufferedReader br = new BufferedReader(new FileReader(file));
            String line = "";
            while ((line = br.readLine()) != null) {
                numbers.add(Integer.parseInt(line));
            }
            br.close();
        } catch (Exception e) {
            System.err.println("Fie không tồn tại or nội dung có lỗi!");
        }
        return numbers;
    }
    public void writeFile(String path,int max){
        try{
            FileWriter writer = new FileWriter(path, true);
            BufferedWriter bufferedWriter = new BufferedWriter(writer);
            bufferedWriter.write("Giá trị lớn nhất : "+ max);
            bufferedWriter.close();
        }catch(IOException e){
            e.printStackTrace();
        }
    }
}
