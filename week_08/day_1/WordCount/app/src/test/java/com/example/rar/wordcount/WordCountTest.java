package com.example.rar.wordcount;

import org.junit.Before;
import org.junit.Test;

import static junit.framework.Assert.assertEquals;

/**
 * Created by RAR on 5/28/18.
 */

public class WordCountTest {

    WordCount wordCount;

    @Before
    public void before(){
        wordCount = new WordCount();
    }

    @Test
    public void canGetWordCount(){
        assertEquals("You typed 4 words", wordCount.splitWords("It is hot outside"));
    }

}
