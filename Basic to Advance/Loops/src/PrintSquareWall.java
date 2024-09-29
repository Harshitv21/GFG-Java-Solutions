public class PrintSquareWall {
    public static void squareWall(int s) {
        for(int i = 1; i <= s; i++) {
            for(int j = 1; j <= s; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
