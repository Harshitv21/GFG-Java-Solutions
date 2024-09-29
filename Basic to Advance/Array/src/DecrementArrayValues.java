public class DecrementArrayValues {
    public static int[] decrementArrayElements(int[] numbers) {
        for(int i = 0; i < numbers.length; i++) {
            numbers[i] -= 1;
        }

        return numbers;
    }
}
