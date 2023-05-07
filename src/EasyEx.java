import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class EasyEx {
    public static String convertToString() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        String nToStr = Integer.toString(n);
        if (nToStr.length() > 0 && n >= -100 && n <= 100) {
            return "Good job";
        }
        return "Wrong answer";
    }

    public static void currencyFormatter() {
        Scanner currency = new Scanner(System.in);
        System.out.print("Enter an amount of money: ");
        double vault = currency.nextInt();

        NumberFormat u = NumberFormat.getCurrencyInstance(Locale.US);
        // NumberFormat i = NumberFormat.getCurrencyInstance(Locale.I);
        NumberFormat c = NumberFormat.getCurrencyInstance(Locale.CHINA);
        NumberFormat f = NumberFormat.getCurrencyInstance(Locale.FRANCE);

        System.out.println("US:" + u.format(vault));
        System.out.println("CHINA:" + c.format(vault));
        System.out.println("FRANCE:" + f.format(vault));
    }

    public static void workWithStr() {
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();
        String b = sc.nextLine();

        int sumLength = a.length() + b.length();
        String word = a.toUpperCase().charAt(0) + a.substring(1) + " " + b.toUpperCase().charAt(0) + b.substring(1);

        if (a.charAt(0) > b.charAt(0)) {
            System.out.println(sumLength + " \nYes " + "\n" + word);
        } else if (a.charAt(0) < b.charAt(0)) {
            System.out.println(sumLength + " \nNo " + "\n" + word);
        }
    }

    public static String selectWord() {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String S = in.next();
        System.out.print("Enter a start index: ");
        int start = in.nextInt();
        System.out.print("Enter an end index: ");
        int end = in.nextInt();
        System.out.print("result: ");
        if (end < start) {
            return "Error";
        }
        return S.substring(start, end);
    }
}
