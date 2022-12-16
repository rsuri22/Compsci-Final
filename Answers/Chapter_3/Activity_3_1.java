package Answers.Chapter_3;

public class Activity_3_1 {
    /*Mr. Bob has discovered that using these loops, he can use the substring methods to search through the characters of 
    a String. Write code (A LOOP) that allows Mr. Bob to determine how many spaces an inputted string contains. */
    public static void main(String[] args) {
        String input = "I like to eat chicken nuggets eheheh";
        int count = 0;
        //Write Code Here:
        for (int i = 0; i < input.length(); i++) {
            if (input.substring(i, i + 1).equals(" ")){
                count++;
            }
        }
        System.out.println("The string contains " + count + " spaces");
    }
}