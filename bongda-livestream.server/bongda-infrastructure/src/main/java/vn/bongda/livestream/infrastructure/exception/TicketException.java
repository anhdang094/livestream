package vn.bongda.livestream.infrastructure.exception;

public class TicketException extends Exception {

    private static final long serialVersionUID = 1L;

    public TicketException(String s) {
        super(s);
    }

    public TicketException(String s, Throwable throwable) {
        super(s, throwable);
    }

    public TicketException(Throwable throwable) {
        super(throwable);
    }

}
