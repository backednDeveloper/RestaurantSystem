public class homePanel {
    public static String panel() {
        int choose = printsMethods.inputRequiredInt(
                "1 - Restaurant menu " + "\n" +
                        "2 - Administration panel" + "\n" +
                        "3 - Exit System" + "\n" +
                        "Select one of the options above : "
        );
        switch (choose) {
            case 1:
                System.out.println("Welcome our restaurant :) ");
                restourantMenus.restourantMenus();
                break;
            case 2:
                int password = 2023;
                int passwrod1 = printsMethods.inputRequiredInt("Enter password : ");
                if (passwrod1 == password) {
                    System.out.println("You entered administration panel.");
                    administrationMenu.menu();
                }
                break;
            case 3 :
                System.exit(-1);
            default:
                System.out.println("Wrong entered. ");
                break;
        }
        return homePanel.panel();
    }
}
