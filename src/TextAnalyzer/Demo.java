package TextAnalyzer;

public class Demo {
    public static void main(String[] args) throws WrongFormatException {
        ResultManager rm = new ResultManager("C:\\Users\\nikikachelmaier\\Desktop\\Map.txt");
        rm.read();
        System.out.println(rm);
        rm.wright("C:\\Users\\nikikachelmaier\\Desktop\\WrittenMap.txt");
        TextAnalyzer ta = new TextAnalyzer(rm, "C:\\Users\\nikikachelmaier\\Desktop\\sample.txt");
        ta.read();
        rm.wright("C:\\Users\\nikikachelmaier\\Desktop\\Textanalyzer.txt");
        System.out.println(rm.getResults());
    }
}
