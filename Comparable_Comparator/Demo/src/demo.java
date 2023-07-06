public class demo {
    public static void main(String[] args) {
       int a=1;
       int b=2;
       int c=3;
       int d=4;
       int e= ++a + a++ - ++b + b++;
        System.out.println(e);
        e *=2 + ++c;
        System.out.println(e);
        int f= e++ + d-- + ++d;
        System.out.println( f);

    }
}
