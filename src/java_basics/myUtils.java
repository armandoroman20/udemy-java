package java_basics;

public class myUtils {
    public static String printSomeJunk(String argument) {
        return "here's the info " + argument;
    }

    public static void printSomeJunk(int argument) {
        System.out.println("here's some integer data " + argument);
    }

    public static void sumTwoNumbers(int firstArg, int secondArg){
        System.out.println("This is the sum: " + (firstArg + secondArg));
    }

    public static int add10(int someArgument){
        int result = someArgument+10;
        return result;
    }
}
