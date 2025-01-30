
import java.util.Scanner;
public class Input{

public static void main(String[] args){

Scanner scanner = new Scanner(System.in);

System.out.print("Please enter your name: ");
String name = scanner.nextLine();
System.out.println();

System.out.print("Please enter your age: ");
int age = scanner.nextInt();
System.out.println();

System.out.print("Please enter your weight in pounds: ");
double weight = scanner.nextDouble();
System.out.println();

System.out.print("True or false, you have previouslt smoked: ");
boolean smoker = scanner.nextBoolean();
System.out.println();

System.out.println("your name: " + name);
System.out.println("your age: " + age);
System.out.println("your weight: "+ weight);
System.out.println("do you smoke: " + smoker);


    }
}