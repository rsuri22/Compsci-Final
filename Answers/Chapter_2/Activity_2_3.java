package Answers.Chapter_2;
public class Activity_2_3 {
    /*Perform the activity in task 1_3, but use a for loop instead of a while loop to complete it. */
    /*Mr. Bob’s friend, Dr. Randy, has stolen multiple pens from him. Examine the code below to determine 
    how many times Dr. Randy executed the “stealPencil” method, without counting how many pencils he stole.
    Use your brain! */
    public static void main(String[] args) {
        for (int j = 88; j > 3; j -= 5){
            stealPencil();
        }
        System.out.println("How many pencils did Randy steal?");
        //Answer Here: 17 pencils were stolen by Randy
    }

    public static void stealPencil(){
        System.out.println("Randy stole a pencil!");
    }
   
    
}
