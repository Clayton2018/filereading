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

        System.out.println(paths[0].getFileName());
        System.out.println(paths[0].getParent());
        System.out.println(paths[0].getNameCount());
        System.out.println(paths[0].isAbsolute());
        System.out.println(paths[3].toAbsolutePath());
        System.out.println(paths[0].toUri());

        Path rp = Paths.get("C:/JavaProgramming/IO/../NIO2//DemoFile.txt");
        System.out.println("rp.normalize() [" + rp.normalize() + "]");

        //Normalizing file sub paths
        Path sp = Paths.get("C:/Users/TRAIN/Downloads/Clayton Oracle Java programs/Java Programming 2019 Learner/IO/../NIO2//DemoFile.txt");
        System.out.println("p.subPath() [" + sp.getNameCount() + "][" + sp.subpath(0,9) + "]");
        System.out.println("p.subPath() [" + sp.getNameCount() + "][" + (sp.normalize()).subpath(0,6) + "]");



    }//end main

}//end class PathDemo
