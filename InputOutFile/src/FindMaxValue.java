import java.util.List;

public class FindMaxValue {
    public static int FindMax(List<Integer> numbers){
        int max = numbers.get(0);
        for(int i=0; i<numbers.size(); i++){
            if(numbers.get(i)>max){
                max=numbers.get(i);
            }
        }
        return max;
    }

    public static void main(String[] args) {
        ReadAndWirteFile file = new ReadAndWirteFile();
        List<Integer> numbers = file.readFile("Numbers.txt");
        int maxValue = FindMax(numbers);
        file.writeFile("Results.txt",maxValue);

    }
}
