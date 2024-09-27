public class PrintSquare {
    public static void square(int s) {
        for (int i = 1; i <= s; i++) {
            if (i == 1) {
                for(int j = 1; j <= s; j++) {
                    System.out.print("* ");
                }
                System.out.println();
            } else if (i > 1 && i < s) {
                for(int j = 1; j <= s; j++) {
                    if ((j == 1) || (j == s)) System.out.print("* ");
                    else System.out.print("  ");
                }
                System.out.println();
            } else {
                for(int j = 1; j <= s; j++) {
                    System.out.print("* ");
                }
                System.out.println();
            }
        }
    }
}
