import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        String wordToFind = "test";
        if(args.length > 0){
            wordToFind = args[0];
        }

        System.out.println("Loading Dictionary...");
        String DICTIONARY_PATH = "data/words.txt";
        WordStore store = new WordStore(DICTIONARY_PATH);
        System.out.println("...complete");

        System.out.println("Searching dictionary for words containing \"" + wordToFind + "\"");
        ArrayList<String> output = store.findContaining(wordToFind);

        System.out.println("Found " + output.size() + " words:");
        for(String s : output){
            System.out.println(s);
        }
    }


}
