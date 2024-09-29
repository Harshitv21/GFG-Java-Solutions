public class Average {
    public static double posAverage(int[] numbers) {
        double res = 0.0;
        int sum = 0;
        int count = 0;

        for(int i = 0; i < numbers.length; i++) {
            if(numbers[i] >= 0) {
                sum += numbers[i];
                count++;
            }
        }
        res = sum / (double)count;

        return res;
    }
}
