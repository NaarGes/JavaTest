import java.io.IOException;
import java.io.*;
import java.util.Scanner;

public class Main {

    static Scanner in = new Scanner(System.in);

    public static void main(String args[]) {   

        while(true) {
            
            // show menu to user
            System.out.println("** Welcome to Job Applicant Program **\r\nAdd an Applicant:\r\n 1. Accountant\r\n 2. Web Programmer\r\n 3. Mobile Programmer\r\n\r\n Show information:\r\n 4. Accountant Applicants\r\n 5. Web Programmer Applicants\r\n 6. Mobile Programmer Applicants\r\n\r\n 7. Exit:\r\nEnter Intented Option Number: ");
            // get menu option number from user
            int option = Integer.parseInt(in.nextLine());

            switch(option) {
                // add an accountant applicant to 'Accountants.txt' file
                case 1: addAccountant();
                        break;
                
                // add a web programmer applicant to 'Web Programmers.txt' file
                case 2: addWebProgrammer();
                        break;

                // add a mobile programmer applicant to 'Mobile Programmer.txt' file
                case 3: addMobileProgrammer();
                        break;

                // show descriptions of all accountant applicants
                case 4: read("Accountants");
                        break;

                // show descriptions of all web programmer applicants
                case 5: read("Web Programmers");
                        break;

                // show descriptions of all mobile programmer applicants
                case 6: read("Mobile Programmers");
                        break;

                // exit 
                case 7:  java.lang.System.exit(0);
                        break;

                default: System.out.println("Invalid Option!");
                        break;
            }
        }
    }

    // this method writes description into 'filename.txt'
    public static void write(String filename, String description) {

        try {

            FileWriter fw = new FileWriter(filename + ".txt", true);
            PrintWriter out = new PrintWriter(fw);

            out.println(description);
            out.println("\r\n");
            out.close();
	    } catch (IOException e) {

            System.out.println("ERROR!");
	    }
        // log for user
        System.out.println("New " + filename + " Applicant Successfully Created!\r\n\r\n");
    }

    // this method reads 'filename.txt' and print into console
    public static void read(String filename) {

        try {
            System.out.println("* List of All " + filename + " *");

            FileReader fr = new FileReader(filename + ".txt");
            BufferedReader br = new BufferedReader(fr);

            String buffer;
            while((buffer = br.readLine()) != null) {
                System.out.println(buffer);
            }  
            br.close();

        } catch (IOException e) {

            System.out.println("File not found!");
        }
    }

    public static void addAccountant() {

        // get information from input
        System.out.println("\r\n**Adding Accountant Applicant**\r\nSSID: ");
        int ssid = Integer.parseInt(in.nextLine());

        System.out.println("Name: ");
        String name = in.nextLine();

        System.out.println("Work Experience (years): ");
        int workExperience = Integer.parseInt(in.nextLine());

        System.out.println("Last Educational Certificate: ");
        String degree = in.nextLine();

        // create an instance 
        Accountant acc = new Accountant(ssid, name, workExperience, degree);

        // write in file
        write("Accountants", acc.description());
    }

    public static void addWebProgrammer() {

        // get information from input
        System.out.println("\r\n**Adding Web Programmer Applicant**\r\nSSID: ");
        int ssid = Integer.parseInt(in.nextLine());

        System.out.println("Name: ");
        String name = in.nextLine();

        System.out.println("Work Experience (years): ");
        int workExperience = Integer.parseInt(in.nextLine());

        System.out.println("Last Job Position: ");
        String lastJobPosition = in.nextLine();

        System.out.println("Programming Language: ");
        String programmingLanguage = in.nextLine();

        // create an instance 
        WebProgrammer wp = new WebProgrammer(ssid, name, workExperience, lastJobPosition, programmingLanguage);

        // write in file 
        write("Web Programmers", wp.description());
    }

    public static void addMobileProgrammer() {

        // get information from input
        System.out.println("\r\n**Adding Mobile Programmer Applicant**\r\nSSID: ");
        int ssid = Integer.parseInt(in.nextLine());

        System.out.println("Name: ");
        String name = in.nextLine();

        System.out.println("Work Experience (years): ");
        int workExperience = Integer.parseInt(in.nextLine());

        System.out.println("Last Job Position: ");
        String lastJobPosition = in.nextLine();

        System.out.println("Number of Apps at Market: ");
        int appsAtMarket = Integer.parseInt(in.nextLine());

        // create an instance 
        MobileProgrammer mp = new MobileProgrammer(ssid, name, workExperience, lastJobPosition, appsAtMarket);

        // write in file 
        write("Mobile Programmers", mp.description());
    }
}