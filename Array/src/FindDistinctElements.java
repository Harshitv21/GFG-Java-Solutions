import java.util.HashMap;

public class FindDistinctElements {
    static int distinct(int M[][], int N) {
        int count = 0;
        HashMap<Integer, Integer> mpp = new HashMap<>();

        for (int i = 0; i < M[0].length; i++) {
            mpp.put(M[0][i], mpp.getOrDefault(M[0][i], 0) + 1);
        }

        for (int key : mpp.keySet()) {
            int currentCount = 0;
            for(int i = 0; i < N; i++) {
                boolean currElementFound = false;
                for(int j = 0; j < M[i].length; j++) {
                    if(M[i][j] == key) {
                        currElementFound = true;
                        break;
                    }
                }
                if(currElementFound) {
                    currentCount++;
                }
            }
            if(currentCount == N) count++;
        }
        return count;
    }
}
