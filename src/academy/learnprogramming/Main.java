package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {
        printDayOfTheWeek(8);
        printDayOfTheWeek(0);
        printDayOfTheWeek(3);
        printDayOfTheWeek(5);
        printDayOfTheWeek(-1);
    }

    private static void printDayOfTheWeek(int day){
        switch(day) {
            case 0: case 1: case 2: case 3: case 4: case 5: case 6:
                if(day == 0)
                    System.out.println("Monday");

                else if(day == 1)
                    System.out.println("Tuesday");

                else if(day == 2)
                    System.out.println("Wednesday");

                else if(day == 3)
                    System.out.println("Thursday");

                else if(day == 4)
                    System.out.println("Friday");

                else if(day == 5)
                    System.out.println("Saturday");

                else if(day == 6)
                    System.out.println("Sunday");
                break;

            default:
                System.out.println("Invalid Day");
        }
    }
}
