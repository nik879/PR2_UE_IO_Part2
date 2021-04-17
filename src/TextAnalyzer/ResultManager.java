package TextAnalyzer;

import java.io.*;
import java.util.HashMap;

public class ResultManager {
    private HashMap<Character, Integer> Results;
    private String path;
    private static int counter=0;

    public ResultManager(String path) {
        Results = new HashMap<>();
        this.path = path;
    }

    public HashMap<Character, Integer> getResults() {
        return Results;
    }

    public String getPath() {
        return path;
    }

    public static int getCounter() {
        return counter;
    }

    public void read() throws WrongFormatException {
        try(BufferedReader br = new BufferedReader(new InputStreamReader (new FileInputStream(path)))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] parts = line.split(":");
                if (parts.length == 2) {
                    if (parts[0].contains(" ") || parts[1].contains(" ")) {
                        throw new WrongFormatException("space in line: " + counter);
                    }
                    Results.put(parts[0].charAt(0), Integer.parseInt(parts[1]));
                }else throw new WrongFormatException("Wrong Format in Line: "+counter);

                counter++;
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void wright(String path) {
        try(BufferedWriter bw = new BufferedWriter(new FileWriter(path))) {
            for (Character character : Results.keySet()) {
                bw.write(character+":"+Results.get(character));
                bw.newLine();
                bw.flush();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public String toString() {
        return "ResultManager{" +
                "Results=" + Results +
                ", path='" + path + '\'' +
                '}';
    }
}
