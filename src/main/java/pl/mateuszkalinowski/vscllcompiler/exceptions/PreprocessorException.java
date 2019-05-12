package pl.mateuszkalinowski.vscllcompiler.exceptions;

public class PreprocessorException extends Exception {

    public PreprocessorException(String message, int line, String file) {
        super(String.format("File: '%s', line: %s, %s",file, line, message));
    }
}
