package Behavioral.Command.com.example.document;

import java.util.ArrayList;
import java.util.List;


public class WordDocument {

    // Fields

    private List<String> words;

    private static WordDocument DOCUMENT_INSTANCE;


    // Constructors
    // -----------------------------------------

    private WordDocument() {
        this.words = new ArrayList<String>();
    }


    // Methods
    // -----------------------------------------

    public static WordDocument getInstance() {
        if (DOCUMENT_INSTANCE == null) {
            DOCUMENT_INSTANCE = new WordDocument();
        }

        return DOCUMENT_INSTANCE;
    }

    public void add(String word) {
        words.add(word);
    }

    public void display() {
        String result = String.join(" ", words);
        System.out.println(result);
    }


    // Getters
    // -----------------------------------------

    public List<String> getWords() {
        return words;
    }

}
