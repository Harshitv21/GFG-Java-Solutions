public class SeparateEvenOdd {
    public static int[] evenOdd(int[] numbers) {
        int evenNoCount = 0, oddNoCount = 0;

        for (int number : numbers) {
            if (number % 2 == 0) evenNoCount++;
        }
        for (int number : numbers) {
            if (number % 2 != 0) oddNoCount++;
        }

        int[] arrEven = new int[evenNoCount];
        int[] arrOdd = new int[oddNoCount];
        int j = 0;
        int k = 0;

        for(int i = 0; i < numbers.length; i++) {
            if(numbers[i] % 2 == 0) {
                arrEven[j] = numbers[i];
                j++;
            } else {
                arrOdd[k] = numbers[i];
                k++;
            }
        }

        int[] newArr = new int[numbers.length];

        j = 0;
        k = 0;
        for(int i = 0; i < arrEven.length; i++) {
            newArr[j] = arrEven[i];
            j++;
        }
        for(int i = evenNoCount; i < arrEven.length + arrOdd.length; i++) {
            newArr[i] = arrOdd[k];
            k++;
        }

        return newArr;
    }
}
