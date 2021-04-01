import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class HamletParserTest {
    private String hamletText;
    private HamletParser hamletParser;

    @Before
    public void setUp() {
        this.hamletParser = new HamletParser();
        this.hamletText = hamletParser.getHamletData();
    }

    @Test
    public void testChangeHamletToLeon() {
        // Act
        String returned = hamletParser.changeHamletToLeon();
        // Assert
        Assert.assertFalse(returned.contains("hamlet"));
    }

    @Test
    public void testChangeHoratioToTariq() {
        // Act
        String returned = hamletParser.changeHoratioToTariq();
        // Assert
        Assert.assertFalse(returned.contains("horatio"));
    }

    @Test
    public void testFindHoratio() {
        // Act
        boolean returned = hamletParser.findHoratio();
        // Assert
        Assert.assertTrue(returned);
    }

    @Test
    public void testFindHamlet() {
        // Act
        boolean returned = hamletParser.findHamlet();
        // Assert
        Assert.assertTrue(returned);
    }
}