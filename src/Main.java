import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {


        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        String[] mass = str.split(" ");
        try{

            double a = Double.valueOf(mass[0]);
            double b = Double.valueOf(mass[2]);

            Calculate(a,b, mass[1]);

        }catch(Exception e){
            System.out.println("Error! Not number");
        }

    }

    private static void Calculate(double a, double b, String mass) throws IOException {
        FileWriter writer = new FileWriter("C:\\Users\\tatia\\Desktop\\input.txt", true);
       double result;
        switch(mass) {
            case "+":
                result =  a+b;
                writer.write(result+"\n");
                break;
            case "-":
                result =  a-b;
                writer.write(result+"\n");
                break;
            case "*":
                result =  a*b;
                writer.write(result+"\n");
                break;
            case "/":
                if(b == 0){
                    writer.write("Error! Division by zero"+"\n");
                    } else {
                System.out.println(a/b);}
                break;
            default:

                writer.write("Operation Error!"+"\n");
                break;
        }

        FileReader reader = new FileReader("C:\\Users\\tatia\\Desktop\\input.txt");
        Scanner scanner = new Scanner(reader);

        writer.close();
        while(scanner.hasNextLine()){
            System.out.println(scanner.nextLine());
        }
        reader.close();
    }
}