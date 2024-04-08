import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            int n = scanner.nextInt();
            // 1,1,2,3,5,8,13,21,34,55,89, ...

            int N1 = 1, N2 = 2;

            int s = N1 + N2;

            boolean isHave = false;

            while (s <= n) {

                N1 = N2;
                N2 = s;

                s = N1 + N2;

                if (s == n) {
                    isHave = true;
                }
            }

            if (isHave || s == 1) {
                System.out.println("True");
            } else
                System.out.println("False");
        }
    }
}