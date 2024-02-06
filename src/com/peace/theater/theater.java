package com.peace.theater;
import java.util.Scanner;
public class theater {


    public static void main(String[] args) {
        // Representation of seats in the theater
        int[][] seats = {
                {0, 0, 0, 1, 1, 1, 0, 0, 1, 1},
                {1, 1, 0, 1, 0, 1, 1, 0, 0, 0},
                {1, 1, 1, 1, 1, 1, 1, 1, 1, 1},
                {0, 0, 0, 1, 1, 1, 1, 0, 0, 0},
                {0, 1, 1, 1, 0, 0, 0, 1, 1, 1}
        };

        // Print the initial state of the theater
        System.out.println("Initial state of the theater:");

        //  printSeats(seats);

        // Input ticket status for each seat
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number of rows you want");
        int row = scanner.nextInt();
        System.out.println("enter the number of column you want");
        int col = scanner.nextInt();
       if(seats [row][col] == 0){
            System.out.println("There is an available seat");
        }else if(seats [row][col] == 1){
            System.out.println("No available space");
        }
    }
}

