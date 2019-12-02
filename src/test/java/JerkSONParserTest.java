import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class JerkSONParserTest {
    private String groceryText;
    private JerkSONParser jerkSONParser;

    @Before
    public void setUp() {
        this.jerkSONParser = new JerkSONParser();
        this.groceryText = jerkSONParser.getGroceryData();
    }

    //@Test
    //public void


}
