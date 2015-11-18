import java.lang.reflect.Field;


public class ObjectSerializer {

	public static String serializer(Object modelObject) throws IllegalArgumentException, IllegalAccessException{
		String object = "";
		Class<? extends Object> cls = modelObject.getClass();
		for(Field field:cls.getDeclaredFields()){
			field.setAccessible(true);
			object +=field.getName()+" "+field.get(modelObject)+"\n";
		}

		return object;
	}
	
}
