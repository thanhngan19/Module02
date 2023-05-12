package ss2_array_loop.exercise;
import java.util.Arrays;
public class ArrayStudy {
    public static void main(String[] args) {
        int [] arr2={1,2,3 };
        System.out.println(Arrays.toString(arr2));
        int [][] arr3 ={{10,20},{30},{40,50}};
        for (int i=0; i< arr3.length;i++){
            for (int j=0; j<arr3[i].length;j++){
                System.out.println(arr3[i][j]+"\t");
            }
            System.out.println();
        }

    }
}
