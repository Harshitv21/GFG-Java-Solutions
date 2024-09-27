public class DayBeforeNDays {
    public static void utility(int d, int n) {
        int res = d - (n % 7);
        if(res < 0) res += 7;

        System.out.print(res);
    }
}
