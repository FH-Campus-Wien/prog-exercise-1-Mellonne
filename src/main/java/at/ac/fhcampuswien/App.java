package at.ac.fhcampuswien;

import java.util.Scanner;

public class App {

    //todo Task 1
    public void sayHelloWorld(){
      System.out.println("Hello World!"); // input your solution here
    }

    //todo Task 2
    public void helloRobot(){
     System.out.println("0123456789012345678901");
     System.out.println("         __");
     System.out.println(" _(\\    |@@|" );
     System.out.println("(__/\\__ \\--/ __");
     System.out.println("   \\___|----|  |   __");
     System.out.println("       \\ }{ /\\ )_ / _\\");
     System.out.println("       /\\__/\\ \\__O (__");
     System.out.println("      (--/\\--)    \\__/");
     System.out.println("      _)(  )(_");
     System.out.println("     `---''---`");
       // input your solution here
    }

    //todo Task 3
    public void sumOfLiterals(){
        // input your solution here
        char z ='Z';
        int hexadecimalnum = 0xFace;
        int octalnum = 012;
        long longnum = 80L;
        float floatnum1 = 44e-1f;
        float  floatnum2 = 5.5f;
        double decimalnum1 = 8.88e1;
        double decimalnum2 = 99.9;
        int sum = 0;

        sum = (sum+z);
        sum = (sum+hexadecimalnum);
        sum = (sum+octalnum);
        sum = (int) (sum+longnum);
        sum = (int) (sum+floatnum1);
        sum = (int) (sum+floatnum2);
        sum = (int) (sum + decimalnum1);
        sum = (int) (sum +decimalnum2);

        System.out.println(sum);

    }

    //todo Task 4
    public void addTwoNumbers(){
        // input your solution here
        int x;
        int y;
        int sum;
        Scanner scanner;
        scanner = new Scanner(System.in);
        x = scanner.nextInt();
        y = scanner.nextInt();
        sum = x+y;
        System.out.println(sum);
    }

    //todo Task 5
    public void swapTwoNumbers(){
        // input your solution here
        int x;
        int y;
        Scanner scanner;
        scanner = new Scanner(System.in);
        System.out.println("Before Swap:");
        System.out.print("x: ");
        x = scanner.nextInt();
        System.out.print("y: ");
        y = scanner.nextInt();
        System.out.println("After Swap:");
        System.out.println("x: "+y);
        System.out.println("y: "+x);

    }

    //todo Task 6
    public void compareTwoNumbers(){
        // input your solution here
        int n1;
        int n2;
        Scanner scanner;
        scanner = new Scanner(System.in);
        System.out.print("n1: ");
        n1 = scanner.nextInt();
        System.out.print("n2: ");
        n2 = scanner.nextInt();
        if(n1==n2) {
            System.out.println("n1 == n2");
        }
        if(n1>n2){
            System.out.println("n1 > n2");
        }
        if(n2>n1){
            System.out.println("n2 > n1");
        }

    }

    //todo Task 7
    public void ratingSalesPerson(){
        // input your solution here
        int annualrevenue;
        Scanner scanner;
        scanner = new Scanner(System.in);
        System.out.print("Enter annual Revenue: ");
        annualrevenue = scanner.nextInt();
        if(annualrevenue<0 || annualrevenue>=100000) {
            System.out.println("Invalid Revenue");
        }
        if(annualrevenue>=0 && annualrevenue < 20000){
            System.out.println("Poor Sales Revenue");
        }
        if(annualrevenue>=20000 && annualrevenue < 50000){
            System.out.println("Average Sales Revenue");
        }
        if(annualrevenue>=50000 && annualrevenue < 80000){
            System.out.println("Good Sales Revenue");
        }
        if(annualrevenue>=80000 && annualrevenue < 100000){
            System.out.println("Excellent Sales Revenue");
        }
    }

    //todo Task 8
    public void getCommissionRate(){
        // input your solution here
        int commclass;
        Scanner scanner;
        scanner = new Scanner(System.in);
        System.out.print("Enter CommissionClass: ");
        commclass = scanner.nextInt();
        switch(commclass){
            case 1:
                System.out.println("Your Commission Rate was set to 0.01");
                break;
            case 2:
                System.out.println("Your Commission Rate was set to 0.02");
                break;
            case 3:
                System.out.println("Your Commission Rate was set to 0.03");
                break;
            case 4:
                System.out.println("Your Commission Rate was set to 0.04");
                break;
            default:
                System.out.println("Your Commission Rate was set to 0.0");
        }


    }

    //todo Task 9
    public void leapyear(){
        // input your solution here
    }

    //todo Task 10
    public void transposedNumbers(){
        // input your solution here
    }


    public static void main(String[] args){
        App exercise1 = new App();

        System.out.println("Task 1: Say Hello World");
        exercise1.sayHelloWorld();

        System.out.println("\nTask 2: Hello Robot");
        exercise1.helloRobot();

        System.out.println("\nTask 3: Literals");
        exercise1.sumOfLiterals();

        System.out.println("\nTask 4: Add two Numbers");
        exercise1.addTwoNumbers();

        System.out.println("\nTask 5: Swap two Numbers without using a helper variable");
        exercise1.swapTwoNumbers();

        System.out.println("\nTask 6: Compare two Numbers");
        exercise1.compareTwoNumbers();

        System.out.println("\nTask 7: Rating Sales Person");
        exercise1.ratingSalesPerson();

        System.out.println("\nTask 8: Commission Rate");
        exercise1.getCommissionRate();

        System.out.println("\nTask 9: Leapyear");
        exercise1.leapyear();

        System.out.println("\nTask 10: Transposed Numbers");
        exercise1.transposedNumbers();
    }
}