import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {
    @Test
    public void StationNumber() {
        Radio Number = new Radio();

        Number.stationNumber = 5;

        int expected = 5;
        int actual = Number.stationNumber;

        Assertions.assertEquals(expected, actual);
    }

    @Test

    public void stationVolume() {
        Radio volume = new Radio();

        volume.stationVolume = 5;

        int expected = 10;
        int actual = 10;

        Assertions.assertEquals(expected, actual);

    }
}

