public class SQRService {
    public int sqrOfNumber(int FIRST_NUMBER, int LAST_NUMBER) {
        int cnt = 0;
        for (int i = 10; i < 100; i++) {
            if (i * i >= FIRST_NUMBER && i * i <= LAST_NUMBER) {
                cnt = cnt + 1;
            }
        }

        return cnt;
    }
}
