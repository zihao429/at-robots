package net.virtualinfinity.atrobots.radio;

public class NewClazz004586089396494062RadioDispatcher {
	private RadioListener source;
	private int channel;
	private short value;

	public NewClazz004586089396494062RadioDispatcher(RadioListener source, int channel, short value) {
		this.source = source;
		this.channel = channel;
		this.value = value;
	}

	public RadioListener getSource() {
		return source;
	}

	public void setSource(RadioListener source) {
		this.source = source;
	}

	public int getChannel() {
		return channel;
	}

	public void setChannel(int channel) {
		this.channel = channel;
	}

	public short getValue() {
		return value;
	}

	public void setValue(short value) {
		this.value = value;
	}
}