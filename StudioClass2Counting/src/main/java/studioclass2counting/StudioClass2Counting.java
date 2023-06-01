package studioclass2counting;
import java.util.HashMap;
import java.util.Scanner;
import java.util.Map;

public class StudioClass2Counting {
    public static void main(String[] args) {

        String quote = "If the product of two terms is zero then common sense says at least one of the two terms has to be zero to start with. So if you move all the terms over to one side, you can put the quadratics into a form that can be factored allowing that side of the equation to equal zero. Once you’ve done that, it’s pretty straightforward from there.";
        Scanner input = new Scanner(System.in);
        System.out.println("Hello world!");
        char[] charactersInString = quote.toCharArray();

        HashMap<Character, Integer> letterCounts =new HashMap<>();

        for (char letter : charactersInString) {
//        System.out.println("Hello world!");
            //if letter is not alphabetic don't count
            if(!Character.isAlphabetic(letter)){
                continue;
            }
            //if letter does not yest exist in letterCounts
            if (!letterCounts.containsKey(letter)){
                //if letter  exist in initizialize letter and count to 1
                letterCounts.put(letter,1);


        } else{
                letterCounts.put(letter, letterCounts.get(letter)+1);
            }
        }
        //loop over letterCounts and print out each key and value.
        for (Map.Entry<Character,Integer>letterEntry:letterCounts.entrySet()){
            System.out.println(letterEntry.getKey());
        }

    }
    }