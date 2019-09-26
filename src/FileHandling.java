import java.io.*;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;

public class FileHandling {

    private static ArrayList<String> employees = new ArrayList<>();

    public static void main(String[] args) {

        displayEmployees();
        readFile();
        writeFile();

    }

    private static void writeFile() {

        Path path = Paths.get("C:/Users/TRAIN/Downloads/Clayton Oracle Java programs/Java Programming 2019 Learner/userNames.txt");

        try{

            BufferedWriter bw = Files.newBufferedWriter(
                    path, Charset.forName("ISO-8859-1"),
                    StandardOpenOption.CREATE, StandardOpenOption.WRITE);
            for (String employee: employees){

                bw.write(employee);
                bw.newLine();

            }//end for

            bw.close();

        }//end try

        catch (IOException ioe){

            System.out.println("Error reading file");
            System.exit(0);

        }//end catch

    }//end method writeFile

    private static void readFile() {

        String line = "";
        Path path = Paths.get("C:/Users/TRAIN/Downloads/Clayton Oracle Java programs/Java Programming 2019 Learner/employee.txt");

        try{

            BufferedReader fileInput = Files.newBufferedReader(path, Charset.forName("ISO-8859-1"));
            line = fileInput.readLine();

            while (line != null){

                employees.add(line);
                line = fileInput.readLine();

            }//end while

            fileInput.close();

        }//end try

        catch(FileNotFoundException fnfe){

            System.out.println("File not found");

        }//end FileNotFoundException

        catch (EOFException eofe){

            System.out.println("End of file! no more lines to read!");

        }//end EOFException

        catch (IOException ioe){

            System.out.println("Error reading file!");

        }//end IOException

    }//end readFile

    private static void displayEmployees() {

        for(String employee: employees) {

            System.out.println(employee);

        }//end for loop

    }//end displayEmployees

}
