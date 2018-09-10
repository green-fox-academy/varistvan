public class Main {
    public static void main(String[] args) {
        String text = "Budapest AndRassy AveNue sixtYsix A";
            text.chars()
                .mapToObj(c -> (char) c)
                .filter(Character::isUpperCase)
                .forEach(System.out::print);
    }
}
