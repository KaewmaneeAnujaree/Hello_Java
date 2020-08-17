import java.util.Scanner;
public class Basic_datatype {
    public static void main(String[] args) {
        Scanner Keyboard = new Scanner(System.in);
        //int
        System.out.print("Input int number: " + "\n"); //get values from the keyboard
        int numberA = Keyboard.nextInt();           //get value from keyboard as int
        System.out.print("Input int number: " + "\n");
        int numberB = Keyboard.nextInt();

        // char
        char chars[]={'T','o','t','a','l',':'};
        String message = new String(chars);

        int SumInt;
        SumInt = numberA + numberB;

        System.out.println(message + " " + SumInt  + "\n");

        //float
        System.out.print("Input float number: " + "\n");
        float numberC = Keyboard.nextFloat();           //get value from keyboard as float
        System.out.print("Input float number: " + "\n");
        float numberD = Keyboard.nextFloat();

        float SumFloat;
        SumFloat = numberC + numberD;

        System.out.println(message + " " + SumFloat + "\n");

        float result;   //result of SumInt and SumFloat
        result = SumInt + SumFloat;
        System.out.println("result: " + result);
    }
}
