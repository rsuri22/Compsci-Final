package Chapter_3;

import java.util.ArrayList;
import java.util.Arrays;

public class Activity_3_3{
    /*Mr. Bob needs to tell his coworkers a joke about his boss, but his boss can't know. Translate the joke to pig-latin
    using a loop so that he can tell them in code. */

    static String vowels = "aeiouAEIOU";

    public static void main(String[] args){ 
        //The joke you need to convert is here:
        String joke = "Our boss is so dumb that he tried to throw rocks at the ground and missed";
        //Output String to store result
        String output = "";
        //Splits the long string into a list of words by spaces
        String[] words = joke.split(" ");
        //Creates a list of strings that the converted strings will be stored in
        ArrayList<String> pigLatin = new ArrayList<>();
        //Enhanced iteration - each words is temporarily stored in the String s, so you can use that data
        for (String s : words) {
            //Store your converted word in this item, which will be added to the list
            String convertedString = "";
            //Condition 1: First letter is a consonant and second letter is a vowel
            //Write conditional statement here using "isVowel" method
            if (!isVowel(s.charAt(0)) && isVowel(s.charAt(1))){
                //Result:Put the first letter at the end and add an "ay"
                //Write code to produce result here (Hint: use iteration to copy string over to a new string that is changed to be correct)
                for (int i = 1; i < s.length(); i++){
                    convertedString += s.charAt(i);
                }
                convertedString += s.charAt(0) + "ay"; 
            }

            //Condition 2: First and second letters are consonants
            //Write conditional statement here using "isVowel" method
            else if (!isVowel(s.charAt(0)) && !isVowel(s.charAt(1))){
                //Result: Add the first two letters and "ay" to the end of the word
                //Write code to produce result here (Hint: use iteration to copy string over to a new string that is changed to be correct)
                for (int i = 2; i < s.length(); i++){
                    convertedString += s.charAt(i);
                }
                convertedString += s.substring(0, 1) + s.substring(1, 2) + "ay";              
            }
            //Condition 3: First letter is a vowel
            //Write conditional statement here using "isVowel" method
            else if (isVowel(s.charAt(0))){
                //Result: Add "way" to the end of the string
                //Write code to produce result here (Hint: you do not need to use iteration this time, simply append the change to the end of the string)
                convertedString += s + "way";                
            }

            //Adds the converted string to the list created earlier
            pigLatin.add(convertedString);
        }
        //Converts the ArrayList back into a string for output
        for (String s : pigLatin) {
            output += s + " ";
        }
        //Prints out output String
        System.out.println(output + ".");
    }
    

    public static boolean isVowel(char letter) {
        boolean vowel = false;
        //Write code here to check if a given character is a vowel (Hint: Iterate through the list of vowels provided above, and compare it to the input character)
        for (int i = 0; i < vowels.length(); i++) {
            if (vowels.charAt(i) == letter){
                vowel = true;
            }
        }
        return vowel;
    }
}
