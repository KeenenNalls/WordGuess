package com.github.zipcodewilmington;

import org.junit.Assert;
import org.junit.Test;

public class HangmanTest {

    @Test // Add this annotation to indicate that this is a test method
    public void testHangmanGame_WinScenario() {
        String[] wordList = {"dog", "wale", "nipsey", "jordan", "phone", "son"};
        Hangman hangman = new Hangman(wordList);

        // Set a specific word for testing
        char[] solutionArray = "dog".toCharArray();
        hangman.setTestWord(solutionArray);

        // Test the Hangman game
        String userGuesses = "do"; // The correct guess for the word "dog"
        hangman.playGameWithTestInput(userGuesses);
        Assert.assertTrue(hangman.isGameWon());
    }

    @Test
    public void testHangmanGame_LoseScenario() {
        String[] wordList = {"dog", "wale", "nipsey", "jordan", "phone", "son"};
        Hangman hangman = new Hangman(wordList);

        // Set a specific word for testing
        char[] solutionArray = "dog".toCharArray();
        hangman.setTestWord(solutionArray);

        // Test the Hangman game
        String userGuesses = "xyz"; // Incorrect guesses, exceeds the number of allowed tries
        hangman.playGameWithTestInput(userGuesses);
        Assert.assertTrue(hangman.isGameLost());
    }
}



