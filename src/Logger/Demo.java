package Logger;

public class Demo {
    public static void main(String[] args) {
       /* Logger lg = new Logger("C:\\Users\\nikikachelmaier\\Desktop\\test.log");

        lg.logMessage(new ErrorMessage("FATAL","test","19:25"));*/

        Logger lg = new Logger("C:\\Users\\nikikachelmaier\\Desktop\\test.log");

        lg.logFatal("Fatal Error");
        lg.logError("Error");
        lg.logInfo("Information");
        lg.logDebug("Debugger");
    }

}
