/* not part of solution */
interface Hello {
    public void sayHello();
}

public class NoParamLambdaExp {
    public static Hello helperFunction() {
        Hello obj = () -> System.out.println("Hello");

        return obj;
    }
}
