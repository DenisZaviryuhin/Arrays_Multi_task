package app;

import java.util.Scanner;


public class Main01 {
    static int number;

    public static void main(String[] args) {

        int[][] ticketNumbers = {
                {22, 33, 44, 43},
                {56, 32, 45, 67},
                {31, 89, 66, 91},
                {10, 12, 87, 77}
        };
        int winnerNum = 77;
        System.out.println("Ticket: ");
        for (int numbers[] : ticketNumbers) {
            for (int value : numbers) {
                System.out.print(value + " ");
            }
            System.out.println();
        }

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your number : ");
        number = scanner.nextInt();
        if (number == winnerNum) {
            System.out.println("You win!");
        } else {
            System.out.println("Try one more time!");
            scanner.close();
        }
    }
}






