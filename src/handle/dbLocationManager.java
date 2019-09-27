//Class Created On 2018.11.30 By Jaco van Stryp
//Class Will Manage Database Location
package handle;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;
import javax.swing.JOptionPane;

public class dbLocationManager {

    public String getLocalStorageLocation() {
        String path = System.getProperty("user.home") + File.separator + "Documents";
        path += File.separator + "";
        return path;
    }

    String local = this.getLocalStorageLocation();
            String dbLocMain = this.getDatabaseLocation();

            public boolean isFullSolo(String grade, String event)
            {
                return true;
            }
             public boolean isFullGroup(String grade, String event)
            {
                return true;
            }

    public boolean isOverLim(String gName, String grade, String event)
    {
        try
        {
            
               
        int maxMem = this.getMaxGroupMembers(grade, event);
        String customDir = (dbLocMain + "\\Culture_Management_Admin\\Students\\Grade_" + grade + "\\" + event + "\\Groups\\" + gName + ".db");
             int totalEnt = 0;
        Scanner scFile = new Scanner(new File(customDir));
        while(scFile.hasNextLine())
        {
            String line = scFile.nextLine();
            totalEnt++;
            System.out.println(totalEnt);
        }
        scFile.close();
        if(maxMem <= totalEnt)
        {
            System.out.println("NOT OVER LIMIT");
            return true;
        }
        else
        {
                                System.out.println("NOT OVER LIMIT");

            return false;
        }
       
        }
        
        catch(Exception e)
        {
            System.out.println("File Not Yet Existing");
                        System.out.println("OVER LIMIT EXCEPTION");

            return false;
        }

    }
    
    public void cloneEventsToLocal() {

        //Creation Of Sub Folders
        File customDir = new File(local + "\\Culture_Management_System\\Server_Events_Clone");

        if (customDir.exists()) {
            System.out.println(customDir + " already exists");
        } else if (customDir.mkdirs()) {
            System.out.println(customDir + " was created");
        }
        //GRADE 1
        customDir = new File(local + "\\Culture_Management_System\\Server_Events_Clone\\Grade_1");
        if (customDir.exists()) {
            System.out.println(customDir + " already exists");
        } else if (customDir.mkdirs()) {
            System.out.println(customDir + " was created");
        } else {
            System.out.println(customDir + " was not created");
        }
        //GRADE 2
        customDir = new File(local + "\\Culture_Management_System\\Server_Events_Clone\\Grade_2");

        if (customDir.exists()) {
            System.out.println(customDir + " already exists");
        } else if (customDir.mkdirs()) {
            System.out.println(customDir + " was created");
        } else {
            System.out.println(customDir + " was not created");
        }
        //GRADE 3
        customDir = new File(local + "\\Culture_Management_System\\Server_Events_Clone\\Grade_3");

        if (customDir.exists()) {
            System.out.println(customDir + " already exists");
        } else if (customDir.mkdirs()) {
            System.out.println(customDir + " was created");
        } else {
            System.out.println(customDir + " was not created");
        }
        //GRADE 4
        customDir = new File(local + "\\Culture_Management_System\\Server_Events_Clone\\Grade_4");

        if (customDir.exists()) {
            System.out.println(customDir + " already exists");
        } else if (customDir.mkdirs()) {
            System.out.println(customDir + " was created");
        } else {
            System.out.println(customDir + " was not created");
        }
        //GRADE 5
        customDir = new File(local + "\\Culture_Management_System\\Server_Events_Clone\\Grade_5");

        if (customDir.exists()) {
            System.out.println(customDir + " already exists");
        } else if (customDir.mkdirs()) {
            System.out.println(customDir + " was created");
        } else {
            System.out.println(customDir + " was not created");
        }
        //GRADE 6
        customDir = new File(local + "\\Culture_Management_System\\Server_Events_Clone\\Grade_6");

        if (customDir.exists()) {
            System.out.println(customDir + " already exists");
        } else if (customDir.mkdirs()) {
            System.out.println(customDir + " was created");
        } else {
            System.out.println(customDir + " was not created");
        }
        //GRADE 7
        customDir = new File(local + "\\Culture_Management_System\\Server_Events_Clone\\Grade_7");

        if (customDir.exists()) {
            System.out.println(customDir + " already exists");
        } else if (customDir.mkdirs()) {
            System.out.println(customDir + " was created");
        } else {
            System.out.println(customDir + " was not created");
        }
        //GRADE 8
        customDir = new File(local + "\\Culture_Management_System\\Server_Events_Clone\\Grade_8");

        if (customDir.exists()) {
            System.out.println(customDir + " already exists");
        } else if (customDir.mkdirs()) {
            System.out.println(customDir + " was created");
        } else {
            System.out.println(customDir + " was not created");
        }
        //GRADE 9
        customDir = new File(local + "\\Culture_Management_System\\Server_Events_Clone\\Grade_9");

        if (customDir.exists()) {
            System.out.println(customDir + " already exists");
        } else if (customDir.mkdirs()) {
            System.out.println(customDir + " was created");
        } else {
            System.out.println(customDir + " was not created");
        }
        //GRADE 10
        customDir = new File(local + "\\Culture_Management_System\\Server_Events_Clone\\Grade_10");

        if (customDir.exists()) {
            System.out.println(customDir + " already exists");
        } else if (customDir.mkdirs()) {
            System.out.println(customDir + " was created");
        } else {
            System.out.println(customDir + " was not created");
        }
        //GRADE 11
        customDir = new File(local + "\\Culture_Management_System\\Server_Events_Clone\\Grade_11");

        if (customDir.exists()) {
            System.out.println(customDir + " already exists");
        } else if (customDir.mkdirs()) {
            System.out.println(customDir + " was created");
        } else {
            System.out.println(customDir + " was not created");
        }
        //GRADE 12
        customDir = new File(local + "\\Culture_Management_System\\Server_Events_Clone\\Grade_12");

        if (customDir.exists()) {
            System.out.println(customDir + " already exists");
        } else if (customDir.mkdirs()) {
            System.out.println(customDir + " was created");
        } else {
            System.out.println(customDir + " was not created");
        }
        //Teacher
        customDir = new File(local + "\\Culture_Management_System\\Server_Events_Clone\\Grade_Teacher");

        if (customDir.exists()) {
            System.out.println(customDir + " already exists");
        } else if (customDir.mkdirs()) {
            System.out.println(customDir + " was created");
        } else {
            System.out.println(customDir + " was not created");
        }

        //Start Cloning Data
        try {

            String dbLoc = this.getDatabaseLocation() + "\\Culture_Management_Admin\\Culture\\Events\\Grade_";

            for (int i = 1; i < 13; i++) {
                File Localfolder = new File(local + "\\Culture_Management_System\\Server_Events_Clone\\Grade_" + i);
                //DELETES DATA
                for (File file : Localfolder.listFiles()) {
                    if (!file.isDirectory()) {
                        file.delete();
                    }
                }
                File folder = new File(dbLoc + i);

                File[] listOfFiles = folder.listFiles();

                if (listOfFiles.length != 0) {

                    for (int j = 0; j < listOfFiles.length; j++) {
                        Scanner scFile = new Scanner(new File(listOfFiles[j].getAbsolutePath()));
                        PrintWriter printer = new PrintWriter(new FileWriter(local + "\\Culture_Management_System\\Server_Events_Clone\\Grade_" + i + "\\" + listOfFiles[j].getName()), false);

                        while (scFile.hasNextLine()) {
                            printer.println(scFile.nextLine());
                        }
                        scFile.close();
                        printer.close();
                    }
                }
            }

            //Teacher Saving
            File folder = new File(dbLoc + "Teacher");
            File[] listOfFiles = folder.listFiles();
            File newLocalfolder = new File(local + "\\Culture_Management_System\\Server_Events_Clone\\Grade_Teacher");
            for (File file : newLocalfolder.listFiles()) {
                if (!file.isDirectory()) {
                    file.delete();
                }
            }
            if (listOfFiles.length != 0) {

                for (int j = 0; j < listOfFiles.length; j++) {
                    Scanner scFile = new Scanner(new File(listOfFiles[j].getAbsolutePath()));

                    PrintWriter printer = new PrintWriter(new FileWriter(local + "\\Culture_Management_System\\Server_Events_Clone\\Grade_" + "Teacher" + "\\" + listOfFiles[j].getName()), false);
                    while (scFile.hasNextLine()) {
                        printer.println(scFile.nextLine());
                    }
                    scFile.close();
                    printer.close();
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    public String getUserGrade()
    {
        try
        {
             String localLocation = this.getLocalStorageLocation() + "\\Culture_Management_System";
            Scanner scFileGrade = new Scanner(new File(localLocation + "\\Student_Grade.db"));
           String mainUserGrade = scFileGrade.nextLine();
            scFileGrade.close();
                    return mainUserGrade;

        } catch(Exception e)
            
        {
            
            e.printStackTrace();
                    return "Invalid";

        }

         
    }
    
    public int getMaxGroupMembers(String grade, String event)
            {
                 try {
                     if(this.isGroup(grade, event) == true)
                     {
            String localLoc = this.getLocalStorageLocation() + "\\Culture_Management_System\\Server_Events_Clone\\Grade_" + grade + "\\" + event + ".db";
            Scanner scFile = new Scanner(new File(localLoc));
            String line = "";
            for (int i = 0; i < 7; i++) {
                line = scFile.nextLine();
            }
            return Integer.parseInt(line);
                     }
                     else
                     {
                         return 0;
                     }
         

        } catch (Exception e) {
            e.printStackTrace();
            System.err.println("Unable To Check If Event Is Group");
            return 0;
        }
            }

    public boolean isGroup(String grade, String event) {

        try {
            String localLoc = this.getLocalStorageLocation() + "\\Culture_Management_System\\Server_Events_Clone\\Grade_" + grade + "\\" + event + ".db";
            Scanner scFile = new Scanner(new File(localLoc));
            String line = "";
            for (int i = 0; i < 6; i++) {
                line = scFile.nextLine();
            }
            if (line.equalsIgnoreCase("Solo")) {
                scFile.close();
                return false;

            } else {
                scFile.close();
                return true;
            }

        } catch (Exception e) {
            
            return false;
        }

    }

    public void createAllSubFolders() {

        String path = this.getDatabaseLocation(); //this is the user input at first run
        File customDir = new File(path + "\\Culture_Management_Admin");

        if (customDir.exists()) {
            System.out.println(customDir + " already exists");
        } else if (customDir.mkdirs()) {
            System.out.println(customDir + " was created");
            try {
                PrintWriter printer = new PrintWriter(new FileWriter(customDir + "\\server.propperties"), false);
                printer.print("0\n"
                        + "0\n"
                        + "0\n"
                        + "0\n"
                        + "0\n"
                        + "0\n"
                        + "0\n"
                        + "0\n"
                        + "0\n"
                        + "0\n"
                        + "0\n"
                        + "0\n"
                        + "0\n"
                        + "30\n"
                        + "30\n"
                        + "30\n"
                        + "30\n"
                        + "30\n"
                        + "30\n"
                        + "30\n"
                        + "30\n"
                        + "30\n"
                        + "30\n"
                        + "30\n"
                        + "30\n"
                        + "30");
                printer.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        } else {
            System.out.println(customDir + " was not created");
        }
        //Subjects
        customDir = new File(path + "\\Culture_Management_Admin\\Culture\\Events");
        

        if (customDir.exists()) {
            System.out.println(customDir + " already exists");
        } else if (customDir.mkdirs()) {
            System.out.println(customDir + " was created");
        } else {
            System.out.println(customDir + " was not created");
        }
        //Students
        customDir = new File(path + "\\Culture_Management_Admin\\Students");
        if (customDir.exists()) {
            System.out.println(customDir + " already exists");
        } else if (customDir.mkdirs()) {
            System.out.println(customDir + " was created");
        } else {
            System.out.println(customDir + " was not created");
        }
        //GRADE 1
        customDir = new File(path + "\\Culture_Management_Admin\\Students\\Grade_1");
        if (customDir.exists()) {
            System.out.println(customDir + " already exists");
        } else if (customDir.mkdirs()) {
            System.out.println(customDir + " was created");
        } else {
            System.out.println(customDir + " was not created");
        }
        //GRADE 2
        customDir = new File(path + "\\Culture_Management_Admin\\Students\\Grade_2");

        if (customDir.exists()) {
            System.out.println(customDir + " already exists");
        } else if (customDir.mkdirs()) {
            System.out.println(customDir + " was created");
        } else {
            System.out.println(customDir + " was not created");
        }
        //GRADE 3
        customDir = new File(path + "\\Culture_Management_Admin\\Students\\Grade_3");

        if (customDir.exists()) {
            System.out.println(customDir + " already exists");
        } else if (customDir.mkdirs()) {
            System.out.println(customDir + " was created");
        } else {
            System.out.println(customDir + " was not created");
        }
        //GRADE 4
        customDir = new File(path + "\\Culture_Management_Admin\\Students\\Grade_4");

        if (customDir.exists()) {
            System.out.println(customDir + " already exists");
        } else if (customDir.mkdirs()) {
            System.out.println(customDir + " was created");
        } else {
            System.out.println(customDir + " was not created");
        }
        //GRADE 5
        customDir = new File(path + "\\Culture_Management_Admin\\Students\\Grade_5");

        if (customDir.exists()) {
            System.out.println(customDir + " already exists");
        } else if (customDir.mkdirs()) {
            System.out.println(customDir + " was created");
        } else {
            System.out.println(customDir + " was not created");
        }
        //GRADE 6
        customDir = new File(path + "\\Culture_Management_Admin\\Students\\Grade_6");

        if (customDir.exists()) {
            System.out.println(customDir + " already exists");
        } else if (customDir.mkdirs()) {
            System.out.println(customDir + " was created");
        } else {
            System.out.println(customDir + " was not created");
        }
        //GRADE 7
        customDir = new File(path + "\\Culture_Management_Admin\\Students\\Grade_7");

        if (customDir.exists()) {
            System.out.println(customDir + " already exists");
        } else if (customDir.mkdirs()) {
            System.out.println(customDir + " was created");
        } else {
            System.out.println(customDir + " was not created");
        }
        //GRADE 8
        customDir = new File(path + "\\Culture_Management_Admin\\Students\\Grade_8");

        if (customDir.exists()) {
            System.out.println(customDir + " already exists");
        } else if (customDir.mkdirs()) {
            System.out.println(customDir + " was created");
        } else {
            System.out.println(customDir + " was not created");
        }
        //GRADE 9
        customDir = new File(path + "\\Culture_Management_Admin\\Students\\Grade_9");

        if (customDir.exists()) {
            System.out.println(customDir + " already exists");
        } else if (customDir.mkdirs()) {
            System.out.println(customDir + " was created");
        } else {
            System.out.println(customDir + " was not created");
        }
        //GRADE 10
        customDir = new File(path + "\\Culture_Management_Admin\\Students\\Grade_10");

        if (customDir.exists()) {
            System.out.println(customDir + " already exists");
        } else if (customDir.mkdirs()) {
            System.out.println(customDir + " was created");
        } else {
            System.out.println(customDir + " was not created");
        }
        //GRADE 11
        customDir = new File(path + "\\Culture_Management_Admin\\Students\\Grade_11");

        if (customDir.exists()) {
            System.out.println(customDir + " already exists");
        } else if (customDir.mkdirs()) {
            System.out.println(customDir + " was created");
        } else {
            System.out.println(customDir + " was not created");
        }
        //GRADE 12
        customDir = new File(path + "\\Culture_Management_Admin\\Students\\Grade_12");

        if (customDir.exists()) {
            System.out.println(customDir + " already exists");
        } else if (customDir.mkdirs()) {
            System.out.println(customDir + " was created");
        } else {
            System.out.println(customDir + " was not created");
        }
        //Teacher
        customDir = new File(path + "\\Culture_Management_Admin\\Students\\Grade_Teacher");

        if (customDir.exists()) {
            System.out.println(customDir + " already exists");
        } else if (customDir.mkdirs()) {
            System.out.println(customDir + " was created");
        } else {
            System.out.println(customDir + " was not created");
        }

        //SubjectGen
        //Grade 1
        customDir = new File(path + "\\Culture_Management_Admin\\Culture\\Events\\Grade_1");

        if (customDir.exists()) {
            System.out.println(customDir + " already exists");
        } else if (customDir.mkdirs()) {
            System.out.println(customDir + " was created");
        } else {
            System.out.println(customDir + " was not created");
        }

        //Grade 2
        customDir = new File(path + "\\Culture_Management_Admin\\Culture\\Events\\Grade_2");

        if (customDir.exists()) {
            System.out.println(customDir + " already exists");
        } else if (customDir.mkdirs()) {
            System.out.println(customDir + " was created");
        } else {
            System.out.println(customDir + " was not created");
        }

        //Grade 3
        customDir = new File(path + "\\Culture_Management_Admin\\Culture\\Events\\Grade_3");

        if (customDir.exists()) {
            System.out.println(customDir + " already exists");
        } else if (customDir.mkdirs()) {
            System.out.println(customDir + " was created");
        } else {
            System.out.println(customDir + " was not created");
        }

        //Grade 4
        customDir = new File(path + "\\Culture_Management_Admin\\Culture\\Events\\Grade_4");

        if (customDir.exists()) {
            System.out.println(customDir + " already exists");
        } else if (customDir.mkdirs()) {
            System.out.println(customDir + " was created");
        } else {
            System.out.println(customDir + " was not created");
        }

        //Grade 5
        customDir = new File(path + "\\Culture_Management_Admin\\Culture\\Events\\Grade_5");

        if (customDir.exists()) {
            System.out.println(customDir + " already exists");
        } else if (customDir.mkdirs()) {
            System.out.println(customDir + " was created");
        } else {
            System.out.println(customDir + " was not created");
        }

        //Grade 6
        customDir = new File(path + "\\Culture_Management_Admin\\Culture\\Events\\Grade_6");

        if (customDir.exists()) {
            System.out.println(customDir + " already exists");
        } else if (customDir.mkdirs()) {
            System.out.println(customDir + " was created");
        } else {
            System.out.println(customDir + " was not created");
        }

        //Grade 7
        customDir = new File(path + "\\Culture_Management_Admin\\Culture\\Events\\Grade_7");

        if (customDir.exists()) {
            System.out.println(customDir + " already exists");
        } else if (customDir.mkdirs()) {
            System.out.println(customDir + " was created");
        } else {
            System.out.println(customDir + " was not created");
        }

        //Grade 8
        customDir = new File(path + "\\Culture_Management_Admin\\Culture\\Events\\Grade_8");

        if (customDir.exists()) {
            System.out.println(customDir + " already exists");
        } else if (customDir.mkdirs()) {
            System.out.println(customDir + " was created");
        } else {
            System.out.println(customDir + " was not created");
        }

        //Grade 9
        customDir = new File(path + "\\Culture_Management_Admin\\Culture\\Events\\Grade_9");

        if (customDir.exists()) {
            System.out.println(customDir + " already exists");
        } else if (customDir.mkdirs()) {
            System.out.println(customDir + " was created");
        } else {
            System.out.println(customDir + " was not created");
        }

        //Grade 10
        customDir = new File(path + "\\Culture_Management_Admin\\Culture\\Events\\Grade_10");

        if (customDir.exists()) {
            System.out.println(customDir + " already exists");
        } else if (customDir.mkdirs()) {
            System.out.println(customDir + " was created");
        } else {
            System.out.println(customDir + " was not created");
        }

        //Grade 11
        customDir = new File(path + "\\Culture_Management_Admin\\Culture\\Events\\Grade_11");

        if (customDir.exists()) {
            System.out.println(customDir + " already exists");
        } else if (customDir.mkdirs()) {
            System.out.println(customDir + " was created");
        } else {
            System.out.println(customDir + " was not created");
        }

        //Grade 12
        customDir = new File(path + "\\Culture_Management_Admin\\Culture\\Events\\Grade_12");

        if (customDir.exists()) {
            System.out.println(customDir + " already exists");
        } else if (customDir.mkdirs()) {
            System.out.println(customDir + " was created");
        } else {
            System.out.println(customDir + " was not created");
        }

        //Grade Teacher
        customDir = new File(path + "\\Culture_Management_Admin\\Culture\\Events\\Grade_Teacher");

        if (customDir.exists()) {
            System.out.println(customDir + " already exists");
        } else if (customDir.mkdirs()) {
            System.out.println(customDir + " was created");
        } else {
            System.out.println(customDir + " was not created");
        }

    }

    public void CheckIfDatabaseLocationExcists() {
        try {

            String path = System.getProperty("user.home") + File.separator + "Documents";
            path += File.separator + "Culture_Management_System";
            File customDir = new File(path);
            System.out.println(path);
            if (customDir.exists()) {
                System.out.println(customDir + " already exists");
            } else if (customDir.mkdirs()) {
                try {
                    Runtime.getRuntime().exec("attrib +h \"" + customDir + "\""); //This Will Attempt To Hide The File
                } catch (IOException e) {

                }
                System.out.println(customDir + " was created");

            } else {
                System.out.println(customDir + " was not created");
                JOptionPane.showMessageDialog(null, "Could not create files to local directories\n\nPlease make sure this computer has appropriate permisions to create folders in\n\n'Documents'");
            }

            boolean found = false;

            while (found == false) {

                PrintWriter printMain = new PrintWriter(new FileWriter(this.getLocalStorageLocation() + "\\Culture_Management_System\\dbLocation.db", true));
                printMain.print("");
                printMain.close();

                String location = "";
                Scanner scConstruct = new Scanner(new File(this.getLocalStorageLocation() + "\\Culture_Management_System\\dbLocation.db"));
                while (scConstruct.hasNextLine()) {
                    location = (scConstruct.nextLine());
                }
                System.out.println(location);
                File f1 = new File(location);
                while (f1.isDirectory() == false) {
                    PrintWriter printMainNew = new PrintWriter(new FileWriter(this.getLocalStorageLocation() + "\\Culture_Management_System\\dbLocation.db", false));
                    location = JOptionPane.showInputDialog(null, "Please Enter A Location Where All Server And Student Data Can Be Stored\n\nThis Location Needs READ AND WRITE\nAccess From All Deveices That Will Be Using This Software", "Warning", JOptionPane.WARNING_MESSAGE);
                    printMainNew.print(location);
                    printMainNew.close();

                    f1 = new File(location);
                }

                found = true;
                this.createAllSubFolders();

            }

        } catch (Exception ex) {

            System.exit(0);

        }

    }

    public String getDatabaseLocation() { // this method will check if the database location does exists and then return the location of it
        //The user will be prompted if that location does not exist!

        try {
            Scanner scFile = new Scanner(new File(this.getLocalStorageLocation() + "\\Culture_Management_System\\dbLocation.db"));

            String line = scFile.nextLine();
            System.out.println(line);

            return line;
        } catch (Exception ex) {
            try {
                this.CheckIfDatabaseLocationExcists();
                Scanner scFile = new Scanner(new File(this.getLocalStorageLocation() + "\\Culture_Management_System\\dbLocation.db"));

                String line = scFile.nextLine();
                System.out.println(line);

                return line;

            } catch (Exception ex1) {

            }

        }
        return "";

    }

}
