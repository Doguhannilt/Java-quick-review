package Files;

import java.io.FileReader;
import java.io.InputStreamReader;

public class App {
    public static void main(String[] args) {

        /*
         * Stream means a sequence of data but in general we use stream to read and
         * write data for File Handling part.
         */

        /*
         * I/O uses Streams as abstraction layer that is used to read and write data
         * Java implements there within class hierarchy as OutputStream and InputStream
         * Files can be used to read and write files
         */

        /*
         * To begin with, you need to understand Streams concept in Java
         * There are two version of Streams in Java: Byte Stream and Character Stream
         * 
         * [BYTE STREAMS]
         * Byte Streams are used to read and write bytes such as text files, image
         * files, etc.
         * InputStream and OutputStream are used to read and write bytes [ABSTRACT
         * CLASS]
         * Known subclasses is BufferedInputStream and BufferedOutputStream
         * Trick: If a class name ends with "Stream", it is a Byte Stream
         * 
         * 
         * [CHARACTER STREAMS]
         * Character Streams are used to read and write characters such as unicode files
         * Reader and Writer are used to read and write characters [ABSTRACT CLASS]
         * Known subclasses is BufferedReader and BufferedWriter
         */

        /*
         * IO Exception
         * Description: An exception that occurs during input/output operations
         * Known as checked exception
         * Advantage: We can catch it and handle it
         */

        /*
         * Additional Notes:
         * System.out is a Stream
         * System.in is a Stream
         * System.err is a Stream
         */

        // READ FROM KEYBOARD

        // try (InputStreamReader fr = new InputStreamReader(System.in)) {
        // System.out.print("Enter some letters:");
        // int letters = isr.read();
        // while (isr.ready()) {
        // System.out.println((char) letters);
        // letters = isr.read();
        // }
        // isr.close();
        // System.out.println("");
        // } catch (Exception e) {
        // System.out.println(e);
        // }

        // READ FROM FILE
        // try (FileReader fr = new FileReader("src/Files/test.txt")) {
        //     int letters = fr.read();
        //     while (fr.ready()) {
        //         System.out.println((char) letters);
        //         letters = fr.read();
        //     }
        //     fr.close();
        //     System.out.println("");
        // } catch (Exception e) {
        //     System.out.println(e);
        // }
    }
}