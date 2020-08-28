package ca.main.objects;

import ca.main.annotations.DefaultValue;


public class A extends AbstractObject{

	private int value;

	protected A() {};

	protected A(int value) {
		this.value = value;
	}

	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		this.value = value;
	}

	@Override
	public String toString() {
		return "A{" + "value='" + value + '\'' + '}';
	}
}
