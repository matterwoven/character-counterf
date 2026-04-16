import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;


public class CharacterFrequencyCounterTest {
    @Test
    void testCharacterShowsUpMultipleTimesGivesCorrectFrequency() {
        //Arrange
        CharacterFrequencyCounter counter = new CharacterFrequencyCounter("hello");
        //Act
        int actual = counter.getFrequency('l');
        //Assert
        assertEquals(2, actual);
    }
}