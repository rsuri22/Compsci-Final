package Chapter_1;

public class Activity_1_4 {
    /*Mr. Bob is going to return home for the day, but realizes that he has only 1 gallon of gasoline left in his tank. 
    Thankfully, he manages to stop at a gas station 10 miles from home and fill it to full. However, needs to know 
    how many more times he can go home and get back to work before he runs out of gas again, assuming he can 
    drive 30 miles off a gallon of gasoline, lives 12 miles away from work, and his car tank can hold 10 gallons 
    of gasoline. (Use a while loop to return how many times he can go back and forth, even if it may not be the fastest
    way.) */
    public static void main(String[] args) {
        int count = 0;
        int gallons = 10;
        int mpg = 30;
        int distance = 12;
        int initialDistance = 10;
        //Write Code Here
        int amountLeft = gallons * mpg - initialDistance;

        while (amountLeft > 0){
            amountLeft -= distance;
            count += 1;
        }
        count /= 2;
        System.out.println("Bob can drive to work and back " + count + " times");

    }
}
