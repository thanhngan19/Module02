package ex2_StopWatch;
//long startTime = System.currentTimeMillis();
//
//        for(int i = 0; i < 1000000000; i++) {i++;}
//
//        long endTime = System.currentTimeMillis();
//
//        System.out.println(" Thời gian chạy: " + (endTime - startTime));

public class StopWatch {
 private long  startTime;
 private long endTime;
 public void setStartTime(){
     this.startTime= startTime;
 }
    public void setEndTime(){
        this.endTime= endTime;
    }
    public long getStartTime(){
        return startTime;
    }
    public long getEndTime(){
        return endTime;
    }
    public long startTime(){
        long startTime = System.currentTimeMillis();
        return startTime;
    }
    public long endTime(){
        long endTime = System.currentTimeMillis();
        return endTime;
    }
    public StopWatch(){
     this.endTime = endTime;
     this.startTime=startTime;
    }
    public void  getElapsedTime(long endTime, long startTime){
        System.out.println(" Thời gian chạy: " + (endTime - startTime));
    }

    public static void main(String[] args) {
      int arr[] = { 6, 7, 0, 2, 8, 1, 3, 9, 4, 5 };
      StopWatch st1 = new StopWatch();
      long a = st1.startTime();
        int indexMin, i, j;

        // lap qua ta ca cac so
        for (i = 0; i < arr.length - 1; i++) {
            // thiet lap phan tu hien tai la min
            indexMin = i;

            // kiem tra phan tu hien tai co phai la nho nhat khong
            for (j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[indexMin]) {
                    indexMin = j;
                }
            }

            if (indexMin != i) {
//                System.out.println(" ==> Trao doi phan tu: [" + arr[i]
//                        + ", " + arr[indexMin] + "]");
                // Trao doi cac so
                int temp = arr[indexMin];
                arr[indexMin] = arr[i];
                arr[i] = temp;
            }

//            System.out.println("Vong lap thu " + (i + 1));
        }
         long b = st1.endTime();
        st1.getElapsedTime(b,a);
    }
}
