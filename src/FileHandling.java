import java.io.BufferedReader;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class FileHandling {

    public static void main(String[] args) {

        displayEmployees();
        readFile();

    }

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

    }//end readFile

    private static void displayEmployees() {



    }//end displayEmployees

}
