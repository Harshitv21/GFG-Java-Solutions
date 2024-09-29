public class LeapYear {
    public static void utility(int y) {
        String isLeap = "False";

        // Assign True or False to isLeap
        if(y % 400 == 0) isLeap = "True";
        else if((y % 4 == 0) && (y % 100 != 0)) isLeap = "True";

        // The line below prints the output
        System.out.println(isLeap);
    }
}
