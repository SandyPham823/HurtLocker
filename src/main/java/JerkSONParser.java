import java.io.File;
import java.io.IOException;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

class JerkSONParser {

    private String groceryData;

    public JerkSONParser() {
        this.groceryData = loadFile();
    }

    private String loadFile(){
            ClassLoader classLoader = getClass().getClassLoader();
            File file = new File(classLoader.getResource("RawData.txt").getFile());
            StringBuilder result = new StringBuilder("");

            try (Scanner scanner = new Scanner(file)) {
                while (scanner.hasNextLine()) {
                    String line = scanner.nextLine();
                    result.append(line).append("\n");
                }

            } catch (IOException e) {
                e.printStackTrace();
            }

            return result.toString();
        }

        public String getGroceryData(){
        return groceryData;
        }

        public String changeSeparator(String str){
            Pattern separator = Pattern.compile("[##]", Pattern.CASE_INSENSITIVE);
            Matcher newSep = separator.matcher(str);
            return newSep.replaceAll("\n");
        }



    }
