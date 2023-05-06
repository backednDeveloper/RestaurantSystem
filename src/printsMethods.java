import java.util.Scanner;

public class printsMethods {
    public static String inputRequiredString(String title) {
        Scanner sc = new Scanner(System.in);
        System.out.println(title);
        return sc.nextLine();
    }

    public static int inputRequiredInt(String title) {
        Scanner sc = new Scanner(System.in);
        System.out.println(title);
        return sc.nextInt();
    }
}
