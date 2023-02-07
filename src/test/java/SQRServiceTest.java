import static org.junit.jupiter.api.Assertions.assertEquals;

public class SQRServiceTest {
    @org.junit.jupiter.api.Test
    void SQRServiceCorrect() {
        SQRService sqr = new SQRService();

        // подготавливаем данные:
        int FIRST_NUMBER = 200;
        int LAST_NUMBER = 300;
        int expected = 3;
        // вызываем целевой метод:
        int actual = sqr.sqrOfNumber(FIRST_NUMBER, LAST_NUMBER);

        // производим проверку (сравниваем ожидаемый и фактический):
        assertEquals(expected, actual);
    }

    @org.junit.jupiter.api.Test
    void SQRServiceLeft() {
        SQRService sqr = new SQRService();

        // подготавливаем данные:
        int FIRST_NUMBER = 300;
        int LAST_NUMBER = 200;
        int expected = 0;
        // вызываем целевой метод:
        int actual = sqr.sqrOfNumber(FIRST_NUMBER, LAST_NUMBER);

        // производим проверку (сравниваем ожидаемый и фактический):
        assertEquals(expected, actual);
    }

    @org.junit.jupiter.api.Test
    void SQRServiceHigh() {
        SQRService sqr = new SQRService();

        // подготавливаем данные:
        int FIRST_NUMBER = 500;
        int LAST_NUMBER = 550;
        int expected = 1;
        // вызываем целевой метод:
        int actual = sqr.sqrOfNumber(FIRST_NUMBER, LAST_NUMBER);

        // производим проверку (сравниваем ожидаемый и фактический):
        assertEquals(expected, actual);
    }
}
