package Activities.Chapter_3;

public class Activity_3_3 {
    /* Mr. Bob has forgotten his login password for his computer. In order to reset his password, 
    he must create a new one that meets specific requirements:
     * At least two capital letters
     * At least two punctuation marks (acceptable marks are ! . - and ,)
     * At least 10 characters
    Write a program that will use iteration to check if Bob's password meets these requirements
     */
    public static void main(String[] args) {
        String newPassword = "jalcks92-AZ";
        String punctuation = "!.-,";

        int punctuationCount = 0;
        int capitalCount = 0;

        boolean lengthCheck = false;
        boolean punctuationCheck = false;
        boolean capitalCheck = false;
        boolean isAcceptable = false;

        //Write code for lengthCheck boolean here:

        //Write loops to determine the number of punctuation marks in the password using the punctuation string provided
        //(Hint: You may have to nest the loops inside one another to check each string against the other)

        //Write code for punctuationCheck here, using the punctuationCount variable created earlier

        //Write code to count capital letters here, using "Character.isUpperCase() method"

        //Write code for capitalCheck here, using the capitalCount variable created earlier

        //Write code to check if all earlier checks are true, then return isAcceptable as a result

        System.out.println("Status of your password validity: " + isAcceptable);

        //Extension Activity: If you would like, you may modify the code to return WHY the password is invalid.
        //It requires some more work with conditionals, but the solution is not provided.
    }

}