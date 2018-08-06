public class PrintParams {
    public static void main(String[] args) {
        String myTexts[] = {"first", "second", "third", "fourth", "fifth", "sixth"};
        printParams(myTexts);
    }
    public static void printParams(String... args) {
        for (String arg : args) {
            System.out.println(arg);
        }
    }
}
