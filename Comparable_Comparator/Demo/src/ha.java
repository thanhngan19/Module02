public class ha extends sta {
 public int add(int m){
     return super.add(2)+m;
 }

    public static void main(String[] args) {
        ha he = new ha();
        System.out.println(he.add(1));
    }
}
