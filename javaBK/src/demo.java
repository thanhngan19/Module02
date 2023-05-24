
    interface Printable{
        void print();
    }
    interface Showable{
        void print();
    }

    class demo implements Printable,Showable{
        public void print() {
            System.out.println("Hello");
        }

        public static void main(String args[]) {
            demo obj = new demo();
            obj.print();
        }
    }

