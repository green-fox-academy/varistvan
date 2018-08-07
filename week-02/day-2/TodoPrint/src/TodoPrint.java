public class TodoPrint {

    public static void main(String... args){
        String todoText = " - Buy milk\n";
        System.out.println(addText(todoText));
    }

    public static String addText(String textToComplete) {
        String completedText = "My todo:\n" + textToComplete + " - Download games\n" + "\t - Diablo";
        return completedText;
    }

}
