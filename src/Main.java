import java.util.Objects;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        greet question
        System.out.println("""
                Hello, I'm Nara, I will be your BTU assistant today
                Here are some common questions you might want to ask us
                1)How do I register in BTU university?
                2)What's yearly price of BTU university?
                3)Why should I enroll in BTU over other universities?
                4)What is the academic calendar for BTU?
                5)What’s the difference between a college and a university?
                6)What are the different types of  graduate degrees?
                7)Can you work while studying in BTU?
                8)What is a GPA?
                If you have any other questions, you can type it out and we will send it to administration""");



        while (true) {
            //        scanning the next input in the terminal and saving it to a1 variable
            java.util.Scanner scanner = new Scanner(System.in);
            String a1 = scanner.next();
//            checking if answer equals to integer 1-8, otherwise ending the loop
            if(!Objects.equals(a1, "1")&&!Objects.equals(a1, "2")&&!Objects.equals(a1, "3")&&!Objects.equals(a1, "4")&&!Objects.equals(a1, "5")&&!Objects.equals(a1, "6")&&!Objects.equals(a1, "7")&&!Objects.equals(a1, "8")){
                break;
            }
            switch (a1) {
                case "1" -> System.out.println("You need to go to your online edu page and set BTU as your first choice in the university list");
                case "2" -> System.out.println("BTU university costs 2250 lari a year");
                case "3" -> System.out.println("BTU has great educational level and reputation. it is backed by Silicon valley and grants many opportunities to it's students");
                case "4" -> System.out.println("you can check it here: https://btu.edu.ge/stsavla/akademiuri-kalendari/");
                case "5" -> System.out.println("Colleges offer only undergraduate degrees while universities offer graduate degrees as well, but the terms are often used interchangeably.");
                case "6" -> System.out.println("Associate: a two-year program that either leads to a specific vocation or transitions to a bachelor program. Bachelor: a four or five-year program where students earn credits in a wide variety of courses.");
                case "7" -> System.out.println("Absolutely! BTU will do everything to make your schedule comfortable!");
                case "8" -> System.out.println("Grade Point Average (GPA) is a numeric indicator for a student's academic performance, calculated on a scale of 4.0.");
            }
            System.out.println("""
                Here are some other questions you might want to ask us
                1)How do I register in BTU university?
                2)What's yearly price of BTU university?
                3)Why should I enroll in BTU over other universities?
                4)What is the academic calendar for BTU?
                5)What’s the difference between a college and a university?
                6)What are the different types of  graduate degrees?
                7)Can you work while studying in BTU?
                8)What is a GPA?
                If you have any other questions, you can type it out and we will send it to administration""");



            }
//        presumably sending a1 variable here to the administration
        System.out.println("Your question was sent to administration and will be answered shortly!");

        }

    }
