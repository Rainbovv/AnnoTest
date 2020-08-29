package ca.main.objects;

import ca.main.annotations.DefaultValue;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class ObjectFactory {

	private ObjectFactory(){}

	public AbstractObject getObject(String type) throws Exception {

		AbstractObject object;

		if (type.equalsIgnoreCase("B")) object = new B();
		else object = new A();

			Field field = object.getClass().getDeclaredField("value");

			if (field.isAnnotationPresent(DefaultValue.class)) {
				object.setValue(field.getAnnotation(DefaultValue.class).value());
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
