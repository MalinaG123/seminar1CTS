package ro.ase.cts.gr1085;

public class UpperCaseException extends Exception{
    @Override
    public String getMessage() {
        return "Au fost introduse doar lit mari!";
    }
}
