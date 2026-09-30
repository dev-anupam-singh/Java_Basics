import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

// Custom exception
class PositiveNumberException extends Exception {
    public PositiveNumberException(String message) {
        super(message);
    }
}

public class ReadNumbers {

    public static void main(String[] args) {
