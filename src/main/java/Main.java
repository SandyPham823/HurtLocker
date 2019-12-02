import org.apache.commons.io.IOUtils;
import java.io.IOException;

public class Main extends JerkSONParser {

    public String readRawDataToString() throws Exception{
        ClassLoader classLoader = getClass().getClassLoader();
        String result = IOUtils.toString(classLoader.getResourceAsStream("RawData.txt"));
        return result;
    }

    public static void main(String[] args) throws Exception{
        String output = (new Main()).readRawDataToString();
        output = new JerkSONParser().changeSeparator(output);

        System.out.println(output);

    }
}
