import java.util.ArrayList;

public class Main {
    private static String DIRCIONARY_PATH = "data/words.txt";

    private static WordStore store;

    public static void main(String[] args) {
        String wordToFind = "Test";

        System.out.println("Loading Dictionary...");
        store = new WordStore(DIRCIONARY_PATH);
        System.out.println("...complete");

        System.out.println("Searching dictionary for words containing \"" + wordToFind + "\"");
        ArrayList<String> output = store.findContaining(wordToFind);

        System.out.println("Found " + output.size() + " words:");
        for(String s : output){
            System.out.println(s);
        }
    }


}
