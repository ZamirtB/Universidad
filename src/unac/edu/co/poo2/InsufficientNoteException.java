package unac.edu.co.poo2;

public class InsufficientNoteException extends Exception {
    private String message;
    public InsufficientNoteException(String message) {this.message = message;
    }

    @Override
    public String getMessage() {
        return this.message;
        }
    }

