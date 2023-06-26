import java.util.TreeMap;

public class Aphabet {
    public static void main(String[] args) {

        TreeMap<String, Integer> map = new TreeMap<>();
        String str = "conmeo";

        System.out.println("độ dài chuỗi là : " + str.length());
        int value = 1;
        int value2 = 1;
        for (int i = 0; i < str.length(); i++) {
            if (map.containsKey(str.substring(i, i + 1).toUpperCase())) {
                value++;
                map.put(str.substring(i, i + 1).toUpperCase(), value);
            } else {
                map.put(str.substring(i, i + 1).toUpperCase(), value);
            }
        }
        System.out.println(map);
    }
}
