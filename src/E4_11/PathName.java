package E4_11;

import java.util.Scanner;

public class PathName {
    public String driveLetter,path,fileName, extension;

    public PathName(){
        scan();
    }
    public void scan(){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the drive letter (e.g., C): ");
         driveLetter = scanner.next();

        System.out.print("Enter the path (e.g., \\Windows\\System): ");
         path = scanner.next();

        System.out.print("Enter the file name (e.g., Readme): ");
         fileName = scanner.next();

        System.out.print("Enter the extension (e.g., txt): ");
         extension = scanner.next();
    }
    public String getComplitefileName(){
        String completeFileName;
        if (System.getProperty("os.name").startsWith("Windows")) {
            completeFileName = driveLetter + ":\\" + path + "\\" + fileName + "." + extension;
        } else {
            completeFileName = path + "/" + fileName + "." + extension;
        }
        return completeFileName;
    }

}
