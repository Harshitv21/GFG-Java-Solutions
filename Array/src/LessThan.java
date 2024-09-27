public class LessThan {
    public static int[] lessThan(int[] numbers,int k) {
        int newLen = 0;
        for(int i = 0; i < numbers.length; i++) {
            if(numbers[i] < k) newLen++;
        }

        int[] arr = new int[newLen];
        int j = 0;
        for(int i = 0; i < numbers.length; i++) {
            if(numbers[i] < k) {
                arr[j] = numbers[i];
                j++;
            }
        }
        return arr;
    }
}
