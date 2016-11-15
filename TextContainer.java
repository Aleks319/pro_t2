package hw.task2;

import java.io.*;

@SaveTo(s = "D:\\Java\\PRO\\save.txt")
public class TextContainer {

    private String text = "some text";

    public TextContainer(String text) {
        this.text = text;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    @Saver
    public void save(String text, String file) throws IOException {
        try (FileWriter fw = new FileWriter(file)) {
            fw.write(text);
        }
    }
}
