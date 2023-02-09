import static org.junit.jupiter.api.Assertions.assertEquals;

public class SQRServiceTest {
    @org.junit.jupiter.api.Test
    void SQRServiceCorrect() {
        SQRService sqr = new SQRService();

        // подготавливаем данные:
        int FirstNumber = 200;
        int LastNumber = 300;
        int expected = 3;
        // вызываем целевой метод:
        int actual = sqr.sqrOfNumber(FirstNumber, LastNumber);

        // производим проверку (сравниваем ожидаемый и фактический):
        assertEquals(expected, actual);
    }

    @org.junit.jupiter.api.Test
    void SQRServiceLeft() {
        SQRService sqr = new SQRService();

        // подготавливаем данные:
        int FirstNumber = 300;
        int LastNumber = 200;
        int expected = 0;
        // вызываем целевой метод:
        int actual = sqr.sqrOfNumber(FirstNumber, LastNumber);

        // производим проверку (сравниваем ожидаемый и фактический):
        assertEquals(expected, actual);
    }

    @org.junit.jupiter.api.Test
    void SQRServiceHigh() {
        SQRService sqr = new SQRService();

        // подготавливаем данные:
        int FirstNumber = 500;
        int LastNumber = 550;
        int expected = 1;
        // вызываем целевой метод:
        int actual = sqr.sqrOfNumber(FirstNumber, LastNumber);

        // производим проверку (сравниваем ожидаемый и фактический):
        assertEquals(expected, actual);
    }
}
