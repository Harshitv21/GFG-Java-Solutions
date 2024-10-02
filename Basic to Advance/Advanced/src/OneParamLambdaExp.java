/* not part of solution */
interface Multiply {
    public int multiplyBy5(int n);
}

public class OneParamLambdaExp {
    public static Multiply helperFunction() {
        Multiply obj = (n -> n * 5);

        return obj;
    }
}
