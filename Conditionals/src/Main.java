import java.util.Random;
import java.util.Scanner;

public class Main {
    private static Object and;
    private static int month;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Choose a numbers: ");
        int userChoice1 = scanner.nextInt();

        System.out.println("Choose another number:");
        int userChoice2 = scanner.nextInt();
        if (userChoice1 > userChoice2){
            System.out.println("userChoice1 is greater than userChoice2");
        }else{System.out.println("userChoice2 is greater than userChoice1");
        }

        System.out.println("Choose another number:");
        int userChoice3 = scanner.nextInt();
        if (userChoice3 % 2 == 0) {
        System.out.println("This number is even");} else {System.out.println("This number is odd");
        }



        System.out.println("Choose a colour");
        System.out.println("Please choose between red or green");
        String userChoice = scanner.nextLine();
        System.out.println(userChoice);
        if (userChoice.equals("red") )  {System.out.println("Stop");}
        else if (userChoice.equals("green")){
            System.out.println("Go");

        }
        else {System.out.println("Input not recognized");}

    }

        System.out.println("Choose a number between 1 and 12");
        int userChoice = scanner.nextInt();
        System.out.println(userChoice);
        switch (userChoice) {
            case 1:
            case 2:
            case 3:
                System.out.println("Spring");
                break;
            case 4:
            case 5:
            case 6:
                System.out.println("Summer");
                break;
            case 7:
            case 8:
            case 9:
                break;
            case 10:
            case 11:
            case 12:
                System.out.println("winter");
                break;
            default:
                System.out.println("Input not recognized");




        }
    }
    }










