package jave_basics;

public class ControlFlow {
    public static void main(String[] args) {


//        int favoriteTemp = 75;
//        int currentTemp = 100;
//
//        String opinion;
//
//        if (favoriteTemp == currentTemp) {
//            if (currentTemp < favoriteTemp - 30) {
//                opinion = "It's cold outside...";
//            } else if (currentTemp < favoriteTemp - 20) {
//                opinion = "It's kinda cold out..";
//            } else if (currentTemp > favoriteTemp + 10) {
//                opinion = "It's hot outside...";
//            } else {
//                opinion = "It's a beautiful day";
//            }
//        }else{
//            opinion = "unknown temp";
//        }
//        System.out.println(opinion);

        int month = 5;
        String monthString = "";

        switch(month){

            case 1: monthString = "January";
                break;
            case 2: monthString = "february";
                break;
            case 3: monthString = "March";
                break;
            case 4: monthString = "April";
                break;
            case 5: monthString = "May";
                break;
            default: monthString ="unkown month";
                break;

        }
        System.out.println(monthString);

    }
}
