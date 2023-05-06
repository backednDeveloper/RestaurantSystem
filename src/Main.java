
public class Main {
    public static void main(String[] args) {
        int choose = printsMethods.inputRequiredInt(
                "1 - Restaurant menu " + "\n" +
                        "2 - Administration panel" + "\n" +
                        "Select one of the options above : "
        );
        switch (choose) {
            case 1:
                System.out.println("Welcome our restaurant :) ");
                restourantMenus.restourantMenus();
            case 2:
                int password = 2023;
                int passwrod1 = printsMethods.inputRequiredInt("Enter password : ");
                if (passwrod1 == password) {
                    System.out.println("You entered administration panel.");
                    administrationMenu.menu();
                }
        }

    }
}
