public class AppendAFunc {
    public static void main(String[] args) {
        String typo = "Chinchill";
        System.out.println(appendAFunc(typo));
    }
    public static String appendAFunc(String wordWithMistake) {
        return wordWithMistake + "a";
    }
}
