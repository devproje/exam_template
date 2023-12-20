package util;

import javax.swing.*;
import java.io.File;
import java.net.URL;

public class Res {
    private final String path;

    public Res(String path) {
        this.path = path;
    }

    public ImageIcon getImage() {
        URL url;
        try {
            File file = new File("./res/" + path);
            url = file.toURI().toURL();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

        return new ImageIcon(url);
    }
}
