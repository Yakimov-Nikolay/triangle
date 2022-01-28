import java.util.Scanner;

public class tri {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());

        printRomb(n);
    }

    private static void printRomb(int n) {
        triangle(n);
        triangle2(n);
    }

    private static void triangle(int n) {
        for (int r = 1; r <= n; r++) {

            for (int space = 0; space < n - r; space++) {
                System.out.print(" ");
            }

            for (int star = 0; star < r; star++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    private static void triangle2(int n){
        for (int r = 1; r <= n; r++) {

            for (int space = 0; space < r; space++) {
                System.out.print(" ");
            }

            for (int star = 0; star <n-r; star++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

}
