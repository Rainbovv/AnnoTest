package ca.main.objects;

import ca.main.annotations.DefaultValue;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class ObjectFactory {

	private ObjectFactory(){};

	public AbstractObject getObject(String type) {

		AbstractObject object = null;

		if (type.equalsIgnoreCase("B")) object = new B();
		if (type.equalsIgnoreCase("A")) object = new A();

		if (object.getClass().isAnnotationPresent(DefaultValue.class)) {
			DefaultValue defaultValue = object.getClass().getAnnotation(DefaultValue.class);
			object.setValue(defaultValue.value());
		}
		return object;
	}

	public AbstractObject getObject(String type, int value) {

		AbstractObject object = null;

		if (type.equalsIgnoreCase("B")) object = new B(value);
		if (type.equalsIgnoreCase("A")) object = new A(value);

		return object;
	}

	private static class SingletonHolder {
		private final static ObjectFactory INSTANCE = new ObjectFactory();
	}

	public static ObjectFactory getInstance() {
		return SingletonHolder.INSTANCE;
	}
}
