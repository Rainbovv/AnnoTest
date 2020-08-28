package ca.main.objects;

import ca.main.annotations.DefaultValue;

@DefaultValue(100)
public class B extends AbstractObject{


	public int value;

	protected B() {};

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
