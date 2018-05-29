package com.example.rar.wordcount;



/**
 * Created by RAR on 5/28/18.
 */

public class WordCount {

     public WordCount(){

     }

    public String splitWords(String words) {
        String[] wordAmount = words.split("\\s+");
        return "You typed " + wordAmount.length + " words";
    }
}
