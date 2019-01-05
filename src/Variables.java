
public class Variables {

    public static int isOdd(int roomNumber) {
        if (roomNumber % 2 != 0) {
            System.out.println("You got an Odd number");
        }
        return roomNumber;
    }

    public static void greeting(String s) {
        System.out.println(s);
    }

    public static int greatestCommonFactor(int a, int b) {

        //do something
        return greatestCommonFactor(10, 55);
       }


    public static void main(String args[]) {

        int roomNumber = 113;
        double eValue = 2.71828;
        String subject = "Computer Science";
        System.out.println("This is room # " + roomNumber);
        System.out.println("e is close to " + eValue);
        System.out.println("I am learning a bit about " + subject);

    }
}
