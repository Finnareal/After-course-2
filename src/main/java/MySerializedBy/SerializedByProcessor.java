package MySerializedBy;

import java.lang.reflect.Field;

public class SerializedByProcessor implements Serializer {

    @Override
    public String serialize(Object object) throws IllegalAccessException, AnnotationSerializedByNotFound {
        Class objectClass = object.getClass();
        final SerializedBy serializedBy = (SerializedBy) objectClass.getAnnotation(SerializedBy.class);
        String result = objectClass.getName() + " {";

        if (serializedBy != null){
            Field[] fields = objectClass.getDeclaredFields();
            for (Field field : fields) {
                field.setAccessible(true);
                if (field.getType().isPrimitive() || field.getType().getTypeName() == "java.lang.String"){
                    result += " " + field.getName() + " = '" + field.get(object) + "'";
                }else {
                    result += (" " + serialize(field.get(object)));
                }
            }
        }else {
            throw new AnnotationSerializedByNotFound("Cannot parse object " + object + " Annotation SerializedBy not found! ");
        }
        return result + "}";
    }
}
