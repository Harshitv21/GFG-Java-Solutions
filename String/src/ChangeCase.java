public class ChangeCase {
    public static void changeCase(String s) {
        String first = s.charAt(0) + "";
        StringBuilder capital = new StringBuilder(first.toUpperCase() + s.substring(1));

        String upper = s.toUpperCase();

        System.out.print(capital);
        System.out.println();
        System.out.print(upper);
        System.out.println();
    }
}
