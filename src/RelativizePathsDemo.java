import java.nio.file.Path;
import java.nio.file.Paths;

public class RelativizePathsDemo {

    public static void main(String[] args) {

        Path p1 = Paths.get("C:/Users/TRAIN/Downloads/Clayton Oracle Java programs/Java Programming 2019 Learner/IO/Logs/errorLogs.txt");
        Path p2 = Paths.get("C:/Users/TRAIN/Downloads/Clayton Oracle Java programs/Java Programming 2019 Learner/IO/");
        Path p3 = p2.relativize(p1);
        System.out.println(p3);

    }//end main

}//end class relativizePathsDemo
