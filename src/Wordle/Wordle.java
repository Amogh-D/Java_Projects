package Wordle;

import java.util.Scanner;


public class Wordle {
    static final String wordleOTD = "ADIEU";
    static char[] alphabet = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z'};
    static char[] result = {'_','_','_','_','_'};

    public static void main(String[] args) {
        System.out.println("MOCK Wordle (inspired by Josh Wardle)");
        System.out.println("\nIn six trials, guess the WORDLE. Each guess must be a five-letter " +
                "\nword that is acceptable. To submit, use the enter key. \n" +
                "Upon completion of each guess, the output will inform \n" +
                "how close your guess was to the word.\n\n");

        int i = 0;
        do
        {
            char[] guess = stringToArray(input(i + 1));
            for(int j = 0; j < guess.length; j++)
            {
                boolean isWord = false;
                for(int k = 0; k < wordleOTD.length(); k++)
                {
                    if(guess[j] == wordleOTD.charAt(k) && k==j)
                    {
                        result[j] = guess[j];
                        isWord = true;
                    }
                    else if (guess[j] == wordleOTD.charAt(k))
                    {
                        result[j] = Character.toLowerCase(guess[j]);
                        for(int m = 0; m < alphabet.length; m++)
                        {
                            if (alphabet[m] == guess[j])
                            {
                                alphabet[m] = Character.toLowerCase(alphabet[m]);
                            }
                        }
                        isWord = true;
                    }
                }
                if (!isWord)
                {
                    for(int x = 0; x < alphabet.length; x++)
                    {
                        for(int y = 0; y < guess.length; y++)
                        {
                            if(guess[j] == alphabet[x])
                            {
                                alphabet[x] = '_';
                            }
                        }
                    }
                }
            }
            toString(result, alphabet);
            i++;
        }while (i < 6 && !remove(result, wordleOTD));

        if(i >= 6 && !remove(result, wordleOTD))
        {
            System.out.println("Nice try, you have ran out of attempts. The correct word was " + wordleOTD);
        }
        else if(i == 1)
        {
            System.out.println("Congratulations! You got it in 1 attempt.");
        }
        else
        {
            System.out.println("Congratulations! You got it in " + i + " attempts.");
        }

    }

    public static String input(int totalGuesses)
    {
        Scanner scanner = new Scanner(System.in);
        String guess = "";

        while (guess.length() < 5)
        {
            System.out.println("Enter a 5-letter guess (#" + totalGuesses + "):");
            guess = scanner.next();

        }
        return guess.toUpperCase().substring(0, 5);

    }


    public static void toString(char[] solution, char[] alphabet)
    {
        for(char character: solution)
        {
            System.out.print(character);
        }
        System.out.println();
        for(char letter: alphabet)
        {
            System.out.print(letter + " ");
        }
        System.out.println();
    }


    public static char[] stringToArray(String guessWord)
    {
        char[] array = new char[5];
        for (int i = 0; i < guessWord.length(); i++)
        {
            array[i] = guessWord.charAt(i);
        }
        return array;
    }


    public static boolean remove(char[] result, String wordle)
    {
        int correct = 0;
        for(int i = 0; i < 5; i++)
        {
            if(result[i] == wordle.charAt(i))
            {
                correct += 1;
            }
        }
        if (correct == 5)
        {
            return true;
        }
        else
        {
            return false;
        }

    }
}
