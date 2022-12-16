package Chapter_3;
public class Activity_3_2 {
    /* Now, Mr. Bob is back at work, and needs to spell things backwards (it's a long story). Write code to help Mr. Bob
     reverse the characters in a String, then return the reversed String. */
     public static void main(String[] args) {
        String input = "antidisestablishmentarianism";
        String output = "";

        //Write Code Here
        for (int i = input.length() - 1; i >= 0; i--){
            output += input.charAt(i);
        }

        System.out.println("The reversed string is " + output + ".");

     }
}
