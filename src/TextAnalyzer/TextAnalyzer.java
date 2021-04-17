package TextAnalyzer;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class TextAnalyzer {
    private ResultManager rm;
    private String path;

    public TextAnalyzer(ResultManager rm, String path) {
        this.rm = rm;
        this.path = path;
    }
    public void read() throws WrongFormatException {
        try(BufferedReader br = new BufferedReader(new FileReader(path))) {
            int byteread = 0;
            while ((byteread = br.read()) != -1) {
                Character c = (char) byteread;
                if (!Character.isLetterOrDigit(c)) {
                    continue;
                }
                if (rm.getResults().containsKey(c)) {
                    int value = rm.getResults().get(c);
                    value++;
                    rm.getResults().put(c, value);
                } else {
                    rm.getResults().put(c, 1);
                }
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
