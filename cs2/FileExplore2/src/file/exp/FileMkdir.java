/* main: FileExplore2.java */

package file.exp;

import java.io.File;
import java.util.Scanner;

public class FileMkdir {

    public static String dirName = "";

    public static Scanner myObj = new Scanner(System.in);

    public static void mDir() {

        // create an abstract pathname (File object) 
        //File f = new File("F:\\program");
        File f = new File("/Users/antw/homeProject/cs2/FileExplore2/TestFolder");
        
        System.out.print(" Enter dir name to create :: ");
        dirName = myObj.nextLine();
        //dirName = "testing";

        System.out.println(" Directory Name Entered is : " + dirName);
        File newF = new File(f.getAbsolutePath() + "/" + dirName);

        // check if the directory can be created 
        // using the abstract path name 
        if (newF.mkdirs()) {
            // display that the directory is created 
            // as the function returned true 
            System.out.println("Directory is created");
        } else {
            // display that the directory cannot be created 
            // as the function returned false 
            System.out.println("Directory cannot be created");
        }
    }

    public static void main(String[] args) {
        mDir();
    }
}