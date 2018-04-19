package MySerializedBy;

public interface Serializer {
    String serialize(Object object) throws IllegalAccessException, AnnotationSerializedByNotFound;
}
