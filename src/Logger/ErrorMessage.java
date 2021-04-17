package Logger;

public class ErrorMessage {
    private String errorLevel;
    private String errorMessage;
    private String errorTime;

    public ErrorMessage(String errorLevel, String errorMessage, String errorTime) {
        switch (errorLevel) {
            case "FATAL":
                this.errorLevel = errorLevel;
                break;
            case "ERROR":
                this.errorLevel = errorLevel;
                break;
            case "INFO":
                this.errorLevel = errorLevel;
                break;
            case "DEBUG":
                this.errorLevel = errorLevel;
                break;
            default:
                try {
                    throw new WrongErrorLevelException();
                } catch (WrongErrorLevelException e) {
                    e.printStackTrace();
                }
        }
        this.errorMessage = errorMessage;
        this.errorTime = errorTime;
    }

    public String getErrorLevel() {
        return errorLevel;
    }

    public String getErrorMessage() {
        return errorMessage;
    }

    public String getErrorTime() {
        return errorTime;
    }

    public String toLine() {
        return errorTime + ":" + errorLevel + "-" + errorMessage;
    }
}
