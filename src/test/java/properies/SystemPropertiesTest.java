package properies;

import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

public class SystemPropertiesTest {

    @Test
    @Tag("TypeTesting")
    void systemPropertiesTest () {
        String property = System.getProperty("type", "Regress");
    }
}
