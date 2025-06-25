package Java_Basics;

import java.util.Scanner;

public class ResumeBuilder {
    public static void main (String[] args){

        // Mini Resume Builder (CLI Project

        Scanner scanner = new Scanner(System.in);

        // Welcome Message
        System.out.println("Mini Resume Builder ( CLI )");

        // Declare Variables
        String name;
        String designation;
        String place;
        String skills;
        String education;
        String experience;
        String contactInfo;
        String projects;
        String socials;
        String languages;


        // Input for users
        System.out.print("Enter your name: ");
        name = scanner.nextLine();
        System.out.print("Enter your designation: (student / web dev etc.): ");
        designation = scanner.nextLine();
        System.out.print("Enter your work place or university: ");
        place = scanner.nextLine();
        System.out.print("Enter your Education: ");
        education = scanner.nextLine();
        System.out.print("Enter your Skills: ");
        skills = scanner.nextLine();
        System.out.print("Enter your Experience level ");
        experience = scanner.nextLine();
        System.out.print("Enter your projects: ");
        projects = scanner.nextLine();
        System.out.print("Enter the languages your know: ");
        languages = scanner.nextLine();
        System.out.print("Enter your socials: ");
        socials = scanner.nextLine();
        System.out.print("Enter your contactinfo: ");
        contactInfo = scanner.nextLine();


        // Resume Output
        System.out.println("\nMyself: " + name);
        System.out.println("I am currently a " + designation + " at " + place );
        System.out.println("The highest level of education i have completed is " + education);
        System.out.println("My arsenal has the following sets of skills : " + skills);
        System.out.println("I have large experience in " + experience);
        System.out.println("I have completed and submitted a large amount of time in building projects such as " + projects);
        System.out.println("I am highly profefficient in speaking languages such as: " + languages);
        System.out.println("Here are my socials do check them out: " + socials);
        System.out.println("If you liked my profile and work here are my contact information: " + contactInfo);

        scanner.close();
    }
}
