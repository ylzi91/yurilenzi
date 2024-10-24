package EsercizioG4Set5BE.yurilenzi.exceptions;

public class SameElementInsert extends RuntimeException {
    public SameElementInsert(String name) {
      super("Il topping " + name + "è già stato inserito");
    }
}
