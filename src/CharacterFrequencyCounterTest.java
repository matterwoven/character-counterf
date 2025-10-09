import static org.junit.Assert.assertEquals;

import javax.xml.crypto.dsig.spec.C14NMethodParameterSpec;

import org.junit.jupiter.api.Test;

public class CharacterFrequencyCounterTest {
    
    @Test
    public void testRepeatedLetterInStringFrequency() {
            //Arrange
            CharacterFrequencyCounter counter = new CharacterFrequencyCounter("Hello");
            //Act
            int actual = counter.getFrequency('1');
            //Assert
            assertEquals(2, actual);
    }

    @Test
    public void testSingleLetterInStringFrequency() {
            //Arrange
            CharacterFrequencyCounter counter = new CharacterFrequencyCounter("Hello");
            //Act
            int actual = counter.getFrequency('e');
            //Assert
            assertEquals(1, actual);
    }
    
    @Test
    public void testRelativeFrequencyOnlySpecialCharacters() {
            //Arrange
            CharacterFrequencyCounter counter = new CharacterFrequencyCounter("$%^&");
            //Act
            int actual = counter.getRelativePercentage('1');
            //Assert
            assertEquals(0.0, actual, .001);
    }
}