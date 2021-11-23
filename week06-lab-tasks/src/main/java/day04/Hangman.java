package day04;

import java.util.Scanner;

public class Hangman {

    public static void main(String[] args) {
        new Hangman().run();

    }

    private void run() {
        Scanner sc = new Scanner(System.in);

        String wordToFind = "almafa";
        String wordFound = "_".repeat(wordToFind.length());

        int chances = 8;

        do {
            System.out.println("Itt tartasz: " + wordFound);
            System.out.println("Ennyi tipped van még: " + chances);
            System.out.println("Mi a következő tipped?");

            String guess = sc.nextLine();
            if (wordToFind.contains(guess)) {
                wordFound = updateWordFound(wordToFind,wordFound,guess);
            } else{
                chances--;
            }

        } while (chances>0 && !wordFound.equals(wordToFind));

        if (wordFound.equals(wordToFind)){

            System.out.println("Ügyes");
        } else {
            System.out.println("Vesztettél");
        }
    }

    private String updateWordFound(String wordToFind, String status, String guess) {
        char[] chars = status.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            if (wordToFind.charAt(i) == guess.charAt(0)) {
                chars[i] = guess.charAt(0);
            }
        }
        return new String(chars);
    }

}