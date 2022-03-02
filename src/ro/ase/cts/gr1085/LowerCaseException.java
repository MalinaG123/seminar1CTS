package ro.ase.cts.gr1085;

public class LowerCaseException extends Exception{
    @Override
    public String getMessage() {
        return "Au fost introduse doar lit mici!";
    }
}
