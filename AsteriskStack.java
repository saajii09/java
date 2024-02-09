import java.util.Scanner;

public class AsteriskStack {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the width of the stack: ");
        int width = input.nextInt();
        System.out.print("Enter the height of the stack: ");
        int height = input.nextInt();

        int width1 = (width % 2 == 0) ? 2 : 1;
        int width2 = width + 2;

        for (int num = 0; num < height; num++) {
            if (num == 0) {
                for (int num1 = 0; num1 < (width2 - width1) / 2; num1++) {
                    System.out.print(" ");
                }
                for (int num1 = 0; num1 < width1; num1++) {
                    System.out.print("*");
                }
            } else if (num == height - 1) {
                for (int num1 = 0; num1 < width2; num1++) {
                    System.out.print("*");
                }
            } else {
                for (int num1 = 0; num1 < (width2 - width) / 2; num1++) {
                    System.out.print(" ");
                }
                for (int num1 = 0; num1 < width; num1++) {
                    System.out.print("*");
                }
            }
            System.out.println();
        }
    }
}
