package hw.task2;

import java.io.IOException;
import java.lang.reflect.Method;


public class TestSave {
    public static void main(String[] args) {

        TextContainer tc = new TextContainer("BRRRRRRRRRRRRRRRRRRRRRRRRRRRRRR");
        Class<?> cls = TextContainer.class;

        Method[]  m = cls.getMethods();
        try {
            if (cls.isAnnotationPresent(SaveTo.class)) {
               for (Method mt : m) {
                  if (mt.isAnnotationPresent(Saver.class)) {
                        SaveTo an = cls.getAnnotation(SaveTo.class);
                        tc.save(tc.getText(), an.s());
                    }
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
