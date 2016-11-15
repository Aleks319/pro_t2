package hw.task2;

import java.lang.annotation.*;

@Retention(value = RetentionPolicy.RUNTIME)
public @interface SaveTo {
    String s();
}
