package java_basics;

import someotherpackage.ExampleClass;

public class LearningMethods {
    public static void main(String[] args) {

        System.out.println("asdfjkl");
        String someJunk = myUtils.printSomeJunk("This is String information");
        System.out.println(someJunk);
        myUtils.sumTwoNumbers(40, 40);
        int myvar = myUtils.add10(99);
        System.out.println(myvar);
        // importing the doSomething() method
        // which imports the someotherpackage
        ExampleClass.doSomething();
    }


}
