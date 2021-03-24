package net.virtualinfinity.atrobots.radio;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Daniel Pitts
 */
public class RadioDispatcher {
    private final List<RadioListener> radioListeners = new ArrayList<RadioListener>();

    public void addRadioListener(RadioListener radioListener) {
        radioListeners.add(radioListener);
    }

    public void dispatch(NewClazz004586089396494062RadioDispatcher parameterObject) {
        for (RadioListener listener : radioListeners) {
            listener.radioSignal(parameterObject.getSource(), parameterObject.getChannel(), parameterObject.getValue());
        }
    }
}
