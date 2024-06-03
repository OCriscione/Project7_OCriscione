import java.util.Scanner;

public class Project7_OCriscione {
    static Scanner kc = new Scanner(System.in);
    public static void main(String[] args) {

        char options;
        int k, f, c, h;

        do {
            options = displayMenu();
            if (options == 'F') {
                System.out.println("Please enter Fahrenheit ");
                f = kc.nextInt();
                System.out.println(farToCel(f));
            } else if (options == 'C') {
                System.out.println("Please enter Celsius ");
                c = kc.nextInt();
                System.out.println(celToFar(c));
            } else if (options == 'K') {
                System.out.println("Please enter Celsius ");
                k = kc.nextInt();
                System.out.println(celToKel(k));

            } else if (options == 'H') {
                System.out.println("Please enter Kelvin");
                h = kc.nextInt();
                System.out.println(kelToFar(h));
            }

        }while(options != 'Q');

    }
    public static char displayMenu() {


        boolean verify = false;
        char ch;
        do {

            System.out.println("Please select one of the following:");
            System.out.println("F - To convert Fahrenheit to Celsius");
            System.out.println("C - To convert Celsius to Fahrenheit");
            System.out.println("K - To convert Celsius to Kelvin");
            System.out.println("H - To convert Kelvin to Fahrenheit");
            System.out.println("Q - To Quit");

            String options = kc.next();
            ch = (Character.toUpperCase(options.charAt(0)));
            if (ch == 'Q' || ch == 'F' || ch == 'C' || ch == 'K' || ch == 'H')
                verify = true;


            //return displayMenu();
        } while (!verify);
        return ch;
    }

    public static int celToKel(int celsius){
        double k;
        k = (celsius + 273);
        return (int) k;
    }

    public static int farToCel(int fahrenheit) {
        int c;
        c = (fahrenheit - 32) * 5 / 9;
        return c;
    }

    public static int celToFar(int celsius) {
        int f;
        f = celsius * 9 / 5 + 32;
        return f;
    }
    public static int kelToFar(int kelvin) {
        double h;
        h = 1.8 * (kelvin - 273)+ 32;
        return (int) h;
    }
}


