/* not part of solution */
interface Add {
    public int addParameters(int x, int y);
}

public class MultiParamLambdaExp {
    public static Add helperFunction() {
        Add obj = ((x, y) -> x + y);

        return obj;
    }
}
