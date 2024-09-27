public class PrintSquareWallNestedLoops {
    public static void squareWall(int s) {
        for(int i = 0; i < s; i++) {
            for(int j = 1; j <= s; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
