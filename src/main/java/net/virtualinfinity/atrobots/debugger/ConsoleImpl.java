package net.virtualinfinity.atrobots.debugger;

import java.io.IOException;

/**
 * TODO: Describe this class.
 *
 * @author Daniel Pitts
 */
public class ConsoleImpl implements Console {
    private final ConsoleInput input;
    private final ConsoleOutput output;
    private final ConsoleOutput error;

    public ConsoleImpl(NewClazz003148365408355007ConsoleImpl parameterObject) {
        this.input = parameterObject.getInput();
        this.output = parameterObject.getOutput();
        this.error = parameterObject.getError();
    }

    public void println(Object o) {
        output.println(o);
    }

    public String readline() throws IOException {
        try {
            println("> ");
            return input.readLine();
        } catch (IOException e) {
            println("IO Exception handling debug command: " + e.getLocalizedMessage());
        }
        return null;
    }

    public void handleException(Exception e) {
        error.handleExceptione(e);
    }
}
