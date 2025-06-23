

public class IncdecOp {
    public static void main (String[] args) {

        int counter = 0;
        System.out.println("Initial counter: " + counter);

        // Increment by 1 by five times
        counter++;
        counter++;
        counter++;
        counter++;
        counter++;
        System.out.println("After incrementing 5 times: " + counter);

        // Decrement by 1 three times
        counter--;
        counter--;
        counter--;
        System.out.println("After decrementing 3 times: " + counter);

        // Final counter value
        System.out.println("Final counter value: " + counter);

    }
}
