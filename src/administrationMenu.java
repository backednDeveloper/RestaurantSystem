public class administrationMenu {
    public static String menu() {
        int choose = printsMethods.inputRequiredInt("Choices " + "\n" +
                "1 - For entering a new product into the database " + "\n" +
                "2 - For product repair in the base " + "\n" +
                "3 - To delete a product from the database " + "\n" +
                "4 - Return Restaurant Menu " + "\n" +
                "5 - Exit System " + "\n" +
                "Select one of the options above : "
        );
        switch (choose) {
            case 1:
                System.out.println("Inclusion of information : ");
                datasInputsClass.inputProductInformations();
            case 2:
                System.out.println("Updating information : ");
                datasInputsClass.inputProductUpdateInformations();
            case 3:
                System.out.println("Deleting informations : ");
                datasInputsClass.inputDeleteInformations();
            case 4:
                System.out.println("Returned Menu : ");
                return homePanel.panel();

            case 5:
                System.out.println(" ---------- Exiting System ---------- ");
                System.exit(-1);
        }

        return administrationMenu.menu();
    }

}
