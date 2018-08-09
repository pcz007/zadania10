public class NameUndefinedException extends Exception {

    public NameUndefinedException() {
    }

    public NameUndefinedException(String message) {
        super(message);
    }

    public NameUndefinedException(String message, Throwable cause) {
        super(message, cause);
    }

    public NameUndefinedException(Throwable cause) {
        super(cause);
    }

    public NameUndefinedException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
