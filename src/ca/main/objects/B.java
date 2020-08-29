package ca.main.objects;

import ca.main.annotations.DefaultValue;


public class B extends AbstractObject{

	@DefaultValue(100)
	public int value;

	protected B() {}

	protected B(int value) {
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
		return "B{" + "value='" + value + '\'' + '}';
	}
}
