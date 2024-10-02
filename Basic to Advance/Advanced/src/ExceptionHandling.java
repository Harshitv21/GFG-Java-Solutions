public class ExceptionHandling {
    class TestClass
    {
        int a, b, Min;
        TestClass(){};

        TestClass(int x,int y)
        {
            this.a = x;
            this.b = y;
            this.Min = Integer.MAX_VALUE;
        }
        public void findMin() {
            try {
                // Addition
                int addition = a + b;
                Min = Math.min(Min, addition);
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }

            try {
                // Subtraction
                int subtraction = a - b;
                Min = Math.min(Min, subtraction);
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }

            try {
                // Multiplication
                int multiplication = a * b;
                Min = Math.min(Min, multiplication);
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }

            try {
                // Division (handle division by zero)
                if (b != 0) {
                    int division = a / b;
                    Min = Math.min(Min, division);
                }
            } catch (ArithmeticException e) {
                System.out.println(e.getMessage());
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }

            // Print the minimum value
            System.out.println(Min);
        }
    }
}
