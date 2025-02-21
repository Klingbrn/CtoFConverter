import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    double celsius = 0;
    double fahrenheit = 0;
    boolean done = false;
    String trash = "";

        do
        {
            System.out.println("Please input the temperature in C: ");

            if(in.hasNextDouble())
            {
                celsius = in.nextDouble();
                in.nextLine();
                fahrenheit = (celsius*9/5)+32;
                done = true;
            }
            else
            {
                trash = in.nextLine();
                System.out.println("you've entered the wrong input " + trash);
                System.out.println("Please re-enter your input ");
            }
        }while(!done);
        System.out.printf("the temperature in fahrenheit is: %.2f", fahrenheit);


    }
}