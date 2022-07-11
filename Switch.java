import java.util.Scanner;

public class Calculater {

    public static void main(String[] args) {

        Scanner userChoice = new Scanner(System.in);
        Scanner userNumbers = new Scanner(System.in);
        String choice = "0";
        int num1 = 1, num2 = 1;
        while (choice.compareTo("5") != 0) {
            System.out.println();
            System.out.println("please choose one of the next option:");
            System.out.println("1. subtraction");
            System.out.println("2. sum");
            System.out.println("3. multiplication");
            System.out.println("4. division");
            System.out.println("5. exit");
            choice = userChoice.nextLine();
            if(choice.compareTo("5") != 0) {
                System.out.println("please insert two numbers with space between the two:");
                if (userNumbers.hasNextInt()) {
                    num1 = userNumbers.nextInt();
                    if (userNumbers.hasNextInt()) {
                        num2 = userNumbers.nextInt();
                        switch (choice) {

                            case "1": {
                                System.out.println("subtraction");
                                int subtraction = num1 - num2;
                                System.out.println("the result is:" + subtraction);
                                break;

                            }

                            case "2": {
                                System.out.println("sum");
                                int sum = num1 + num2;
                                System.out.println("the result is:" + sum);
                                break;

                            }

                            case "3": {
                                System.out.println("multiplication");
                                int multiplication = num1 * num2;
                                System.out.println("the result is:" + multiplication);
                                break;

                            }

                            case "4": {
                                System.out.println("division");
                                int division = num1 / num2;
                                System.out.println("the result is:" + division);
                                break;

                            }
                        }
                    } else {
                        System.out.println("the second input: " + userNumbers.next() + " is not valid Integer");
                    }
                } else {
                    System.out.println("the first input: " + userNumbers.next() + " is not valid Integer");
                }
            }

        }
        System.out.println("Goodbye");
        userChoice.close();
        userNumbers.close();
    }
}
