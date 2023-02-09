public class SQRService {
    public int sqrOfNumber(int FirstNumber, int LastNumber) {
        int cnt = 0;
        for (int i = 10; i < 100; i++) {
            if (i * i >= FirstNumber && i * i <= LastNumber) {
                cnt = cnt + 1;
            }
        }

        return cnt;
    }
}
