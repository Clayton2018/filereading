import java.net.URI;
import java.nio.file.Path;
import java.nio.file.Paths;

public class PathDemo {

    public static void main(String[] args) {

        Path[] paths = new Path[5];
        paths[0] = Paths.get("C:\\Users\\TRAIN\\Downloads\\Clayton Oracle Java programs\\Java Programming 2019 Learner\\employee.txt");
        paths[1] = Paths.get("C:/Users/TRAIN/Downloads/Clayton Oracle Java programs/Java Programming 2019 Learner/employee.txt");
        paths[2] = Paths.get("C:","Users","TRAIN","Downloads","Clayton Oracle Java programs","Java Programming 2019 Learner","employee.txt");
        paths[3] = Paths.get("employee.txt");
        paths[4] = Paths.get(URI.create("file://////~/employee.txt"));

        for (int i = 0; i < paths.length; i++){

            System.out.println("Default File Path p[" + i + "] - " + paths[i]);

        }//end for loop

    }//end main

}//end class
