/*
A. Hello World
B. File already exists. Use the append method instead (THIS IS THE ANSWER)
C. Compilation Error due to incorrect syntax in the code
D. Run time error due to File
E. Run time error
*/


package prjJavaIO;

import java.io*;

import prjJavaIO.Main.OverwriteException;

interface Writer {
    void write(String text) throws IOException, OverwriteException;
}

abstract class Appender {
    public voic append(String text) throws IOException {
        PrintWriter writer = new PrintWriter(new FileOutputStream("test.txt", true));
        writer.println(text);
        writer.close();
    }
}



class Main {
    static class OverwriteException extends Exception {
        public OverwriteException(String message) {
            super(message);
        }
    }

    static class FileAppender extends Appender implements Writer {
        public void write (String text) throws OverwriteException, IOException {
            File file = new file("test.txt");
            if (file.exists()) {
                throw new OverwriteException("File already exists. Use the append method instead.");
            }
            append(text);
        }
    }

    public static void main(String[] args) {
        try {
            Writer writer = new FileAppender();
            writer.write("Hello");
            writer.write("World");
        } catch (OverwriteException e) {
            System.out.println("e.getMessage()");
        } catch (IOException e) {
            e.printStackTrace();
        }

        try {
            FileInputStream in = new FileInputStream("test.txt");
            int data = in.read();
            while (data != -1) {
                System.out.print(char data);
                data = in.read();
            }
            in.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}