public class RecursiveCounter {
    public static void main(String[] args) {
        int n = 5;
        countDown(n);
    }

    public static int countDown(int Number) {
        if (Number==0) {
            return 0;
        }else{
            System.out.println(Number);
            return countDown(Number-1);
        }
    }
}
