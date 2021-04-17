package Logger;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class Logger {
    private String path;

    public Logger(String path) {
        this.path = path;
    }

    private void logMessage(ErrorMessage message) {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(path, true))) {
            bw.write(message.toLine());
            bw.newLine();
            bw.flush();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }



    public void logFatal(String message) {
        String timeStamp;
        ErrorMessage em = new ErrorMessage("FATAL", message,
                timeStamp = new SimpleDateFormat("dd.MM.yyyy " + "HH:mm:ss").format(Calendar.getInstance().getTime()));
        logMessage(em);
    }public void logError(String message) {
        String timeStamp;
        ErrorMessage em = new ErrorMessage("ERROR", message,
                timeStamp = new SimpleDateFormat("dd.MM.yyyy " + "HH:mm:ss").format(Calendar.getInstance().getTime()));
        logMessage(em);
    }public void logInfo(String message) {
        String timeStamp;
        ErrorMessage em = new ErrorMessage("INFO", message,
                timeStamp = new SimpleDateFormat("dd.MM.yyyy " + "HH:mm:ss").format(Calendar.getInstance().getTime()));
        logMessage(em);
    }public void logDebug(String message) {
        String timeStamp;
        ErrorMessage em = new ErrorMessage("DEBUG", message,
                timeStamp = new SimpleDateFormat("dd.MM.yyyy " + "HH:mm:ss").format(Calendar.getInstance().getTime()));
        logMessage(em);
    }

}
