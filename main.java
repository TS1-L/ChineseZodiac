import java.util.Scanner;

public class Main {



    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter your birth year: ");
        int year = input.nextInt();
        
        int a = year % 12;
        
        switch (a) {
            case 0:
                System.out.println("Your Chinese Zodiac is Monkey");
                break;
            case 1:
                System.out.println("Your Chinese Zodiac is Cockerel");
                break;
            case 2:
                System.out.println("Your Chinese Zodiac is Dog");
                break;
            case 3:
                System.out.println("Your Chinese Zodiac is Pig");
                break;
            case 4:
                System.out.println("Your Chinese Zodiac is Mouse");
                break;
            case 5:
                System.out.println("Your Chinese Zodiac is Ox");
                break;
            case 6:
                System.out.println("Your Chinese Zodiac is Tiger");
                break;
            case 7:
                System.out.println("Your Chinese Zodiac is Rabbit");
                break;
            case 8:
                System.out.println("Your Chinese Zodiac is Dragon");
                break;
            case 9:
                System.out.println("Your Chinese Zodiac is Snake");
                break;
            case 10:
                System.out.println("Your Chinese Zodiac is Horse");
                break;
            case 11:
                System.out.println("Your Chinese Zodiac is Sheep");
                break;

        }



    }
}
