public class WhileLoop_2 {
    static void printTable (int n) {
        int multiplier = 10;
        while(multiplier > 0)
        {
            System.out.print(n * multiplier + " ");
            multiplier--;
        }
        System.out.println();
    }
}
