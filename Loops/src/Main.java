import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);


        System.out.println("Insert a number");
        int n = Integer.parseInt(input.nextLine());
        while (n<(0))
        {n++;
            System.out.println(n);
        }
        for (int i=1; i<=n; i++)
        {
            if (((i % 3) == 0) && ((i % 5) == 0)) // Is it a multiple of 3 & 5?
                System.out.println("fizzbuzz");
            else if ((i % 3) == 0) // Is it a multiple of 3?
                System.out.println("fizz");
            else if ((i % 5) == 0) //  Is it a multiple of 5?
                System.out.println("buzz");
            else
                System.out.println(i);//  Not a multiple of 3 or 5

        }
        }



    }


