import java.io.*;
import java.util.ArrayList;

public class FileReading {

      private static ArrayList<String> employees = new ArrayList<>();

    public static void main(String[] args) {


        readFile(employees);
        displayEmployees(employees);



    }//end main

    private static void displayEmployees(ArrayList<String> employees) {

        for (String employee: employees){

            System.out.println(employee);

        }


    }//end displayEmployees

    private static void readFile(ArrayList<String> employees) {

        String line = "";
        BufferedReader fileInput = null;

        try{

            fileInput = new BufferedReader(new FileReader(
                    new File("C:/Users/TRAIN/Downloads/Clayton Oracle Java programs/Java Programming 2019 Learner/employee.txt")));

            line = fileInput.readLine();
            while(line != null){

                employees.add(line);
                line = fileInput.readLine();

            }//end while


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


}//end class
