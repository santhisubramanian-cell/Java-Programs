package two_d_array;

import java.util.Scanner;

public class array11 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int r = sc.nextInt();
        int c = sc.nextInt();

        int[][] seat = new int[r][c];

        for(int i = 0; i < r; i++) {
            for(int j = 0; j < c; j++) {
                seat[i][j] = sc.nextInt();
            }
        }

        int violations = 0;

        System.out.println("Seating Layout:");
        for(int i = 0; i < r; i++) {
            for(int j = 0; j < c; j++) {
                System.out.print(seat[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("\nViolation Coordinates:");

        for(int i = 0; i < r; i++) {
            for(int j = 0; j < c; j++) {

                if(seat[i][j] == 1) {

                    for(int x = -1; x <= 1; x++) {
                        for(int y = -1; y <= 1; y++) {

                            if(x == 0 && y == 0) continue;

                            int ni = i + x;
                            int nj = j + y;

                            if(ni >= 0 && ni < r && nj >= 0 && nj < c) {
                                if(seat[ni][nj] == 1) {
                                    System.out.println("- Seat at ("+i+","+j+") is too close to ("+ni+","+nj+")");
                                    violations++;
                                }
                            }

                        }
                    }

                }

            }
        }

        System.out.println("\nViolations Found: " + violations);

        if(violations == 0)
            System.out.println("Status: Compliant");
        else
            System.out.println("Status: Non-Compliant");
    }
}