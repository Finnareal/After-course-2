package MyToString;

import java.lang.reflect.Field;

public class Main {
    public static void main(String[] args) throws IllegalAccessException {
        Spool spool = new Spool("Steel", 2000, true);
        SpinningReel spinningReel = new SpinningReel("Reel Maker", 5670d, false);
        Spinning spinning = new Spinning("God", 8670d);

        System.out.println(myToString(spool));
        System.out.println(myToString(spinningReel));
        System.out.println(myToString(spinning));
    }

    private static String myToString(Object object) throws IllegalAccessException {
        Class objectClass = object.getClass();
        String result = objectClass.getName() + " {";
        Field[] fields = objectClass.getDeclaredFields();

        for (Field field : fields) {
            field.setAccessible(true);
            if (field.getType().isPrimitive() || field.getType().getTypeName() == "java.lang.String"){
                result += " " + field.getName() + " = '" + field.get(object) + "'";
            }else {
                result += (" " + myToString(field.get(object)));
            }
        }
        return result + "}";
    }
}
