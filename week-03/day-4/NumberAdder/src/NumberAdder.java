public class NumberAdder {
    public static void main(String[] args) {
        int n = 7;
        int sum = 0;
        System.out.println(countAdder(n));
    }

    public static int countAdder(int Number) {
        int sum = Number;
        if (Number==1) {
            return 1;
        }else{
            return sum+=countAdder(Number-1);
        }
    }
}