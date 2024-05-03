package singleton;

import singleton.Clipboard;

public class Main {
    public static void main(String[] args) {

        Clipboard c1=Clipboard.getInstance();

        c1.copy("abc");
        c1.paste();
    }
}