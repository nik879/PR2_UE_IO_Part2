package Logger;

public class WrongErrorLevelException extends Exception {
    public WrongErrorLevelException() {
    }

    public WrongErrorLevelException(String message) {
        super(message);
    }

    public WrongErrorLevelException(String message, Throwable cause) {
        super(message, cause);
    }

    public WrongErrorLevelException(Throwable cause) {
        super(cause);
    }

    public WrongErrorLevelException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
