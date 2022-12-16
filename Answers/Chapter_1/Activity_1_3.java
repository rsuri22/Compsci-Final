package Answers.Chapter_1;

public class Activity_1_3 {
    /*Mr. Bob’s friend, Dr. Randy, has stolen multiple pens from him. Examine the code below to determine 
    how many times Dr. Randy executed the “stealPencil” method, without counting how many pencils he stole.
    Use your brain! */
    public static void main(String[] args) {
        int j = 143;
        while (j > 3) {
            stealPencil();
            j -= 2;
        }
        System.out.println("How many pencils did Randy steal?");
        //Answer Here: 70 pencils were stolen by Randy
    }

    public static void stealPencil(){
        System.out.println("Randy stole a pencil!");
    }
}
