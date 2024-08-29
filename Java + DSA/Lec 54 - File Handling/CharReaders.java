import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.InputStreamReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;

/**
 * Character Reader classes!
 */
public class CharReaders {
    public static void main(String[] args) throws IOException {

        // InputStreamReader is a bridge from Bytes to character Streams.
        InputStreamReader isr = new InputStreamReader(System.in);

        System.out.print("Enter letters : ");

        int letter = isr.read(); // Can throw IOException

        // Read all the characters in the input stream
        while (isr.ready()) {
        System.out.print((char)letter + " ");
        letter = isr.read();
        }

        isr.close(); // Close the input stream


        
        // FileReader reads character data from files on disk!
        FileReader fr = new FileReader("./for_fr.txt");

        System.out.print("Enter letters : ");

        System.out.println(fr);
        int letter2 = fr.read(); // Can throw IOException

        // Read all the characters in the given File.
        while (fr.ready()) {
        System.out.print((char) letter2 + " ");
        letter2 = fr.read();
        }
        fr.close(); // Close the FileReader



        // BufferReader reads character data from files on disk!
        // It Creates a char buffer from the Reader object (that have charactersread!)
        BufferedReader br = new BufferedReader(new FileReader("./for_fr.txt"));

        System.out.println("Reading with " + br);

        // Read all the lines in the given File.
        while (br.ready()) {
        // Allows for read() and readLine() for whole lines!

        String letter3 = br.readLine(); // Gives string
        System.out.println( "LINE: " + letter3);
        }

        br.close(); // Close the BufferReader

        
        
        // OutputStreamWriter helps to write chars to the given Output Stream!!
        OutputStreamWriter osw = new OutputStreamWriter(System.out, "UTF-8");
        
        osw.write("😅😁 Allowed Unicode!\n");
        osw.write("DIPESH IS GREAT, DON'T FORGOT THAT `🤫\n");

        // Close the OutputStreamWriter
        osw.close(); // not required when using try-catch



        // FileWriter helps to write characters to the given File
        FileWriter fw = new FileWriter("./for_fr.txt", true); // bool to append or not

        fw.write("\nIt's a new line written by FileWriter...");
        fw.close(); // Close the FileWriter

        
        // Efficient using buffer
        BufferedWriter bw = new BufferedWriter(new FileWriter("./for_fr.txt"));
        bw.write("HEY");
        bw.close();
        

        // Creating file-objects also!
        File fo = new File("./file_object.txt");

        // Creating actual or temporary files if required!
        fo.createNewFile();

        // Now, we can write, read the file as needed.
        FileWriter fw2 = new FileWriter("./file_object.txt");
        fw2.append("Impediment to action, advances action!");
        fw2.close();
        
        // fo.delete() // delete files!


        // There are many more like them, with various use cases!

    }
}