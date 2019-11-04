import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class WordStore {

    ArrayList<String> allWords;

    WordStore(String wordFilePath){
        allWords = new ArrayList<>();

        try {
            Scanner s = new Scanner(new File(wordFilePath));
            while(s.hasNextLine()){
                allWords.add(s.nextLine());
            }
        } catch (FileNotFoundException e) {
            System.err.println("File not found: \"" + wordFilePath + "\"");
        }
    }

    public ArrayList<String> findContaining(String find){
        ArrayList<String> list = new ArrayList<>();

        for(String s : allWords){
            if(containedIn(find,s)){
                list.add(s);
            }
        }

        return list;
    }

    /**
     * Is String a contained in String b
     * @param a
     * @param b
     * @return
     */
    private boolean containedIn(String a, String b){
        if(a.length() > b.length())return false;
        int aInd = 0;
        int bInd = 0;

        while(bInd < b.length()){
            if(aInd >= a.length())return true;
            char bChar = b.charAt(bInd);
            char aChar = a.charAt(aInd);
            if(bChar == aChar){
                aInd++;
            }
            bInd++;
        }
        return false;
    }
}
