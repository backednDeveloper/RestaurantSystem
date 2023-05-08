public class restourantMenus {
    public static String restourantMenus() {
        int typeOfProduct = printsMethods.inputRequiredInt("1 - For meals " + "\n" +
                "2 - For drinks " + "\n" +
                "Select one of the options above : "
        );
        switch (typeOfProduct) {
            case 1:

                break;
            case 2:

                break;
            default:
                System.out.println("Wrong choose !!! ");
                break;
        }
        int typeOfProduct1 = printsMethods.inputRequiredInt("1 - For the food products " + "\n" +
                "2 - For the  drinks products " + "\n" +
                "Select one of the options above : "
        );
        switch (typeOfProduct1) {
            case 1:
                boolean found = false;
                for (meals meals : globalDatas.mealsData) {
                    meals.getInfoMeals();
                    found = true;
                }
                if (!found) {
                    System.out.println("Not yet information. ");
                    return homePanel.panel();
                }
                int ordernumbers = 1;
                while (ordernumbers >= 1) {
                    boolean sameproductsearch = false;
                    for (meals information : globalDatas.mealsData) {
                        String mealname = printsMethods.inputRequiredString("Enter the name of the product : ");
                        meals mealsFound = globalDatas.mapMeals.put(mealname, information);
                        if (mealsFound != null) {
                            orderInformationDatas orderInformationDatas = new orderInformationDatas(mealname, ordernumbers);
                            globalDatas.orderInformations.add(orderInformationDatas);
                            globalDatas.orderInformations.get(orderInformationDatas.getOrderNumbers()).getOrderInformations();
                            ordernumbers++;
                            break;
                        }
                        sameproductsearch = true;
                    }
                    if (!sameproductsearch) {
                        System.out.println("Please select an item on the menu. ");
                        return restourantMenus.restourantMenus();
                    }
                }
                break;
            case 2:
                boolean found1 = false;
                for (meals meals : globalDatas.mealsData) {
                    meals.getInfoMeals();
                    found1 = true;
                }
                if (!found1) {
                    System.out.println("Not yet information. ");
                    return homePanel.panel();
                }
                int ordernumbers1 = 1;
                while (ordernumbers1 >= 1) {
                    boolean sameproductsearch = false;
                    for (drinks information1 : globalDatas.drinksData) {
                        String drinkName = printsMethods.inputRequiredString("Enter the name of the product : ");
                        drinks drinkFound = globalDatas.mapDrinks.put(drinkName, information1);
                        if (drinkFound != null) {
                            orderInformationDatas orderInformationDatas = new orderInformationDatas(drinkName, ordernumbers1);
                            globalDatas.orderInformations.add(orderInformationDatas);
                            globalDatas.orderInformations.get(orderInformationDatas.getOrderNumbers()).getOrderInformations();
                            ordernumbers1++;
                            break;
                        }
                        sameproductsearch = true;
                    }
                    if (!sameproductsearch) {
                        System.out.println("Please select an item on the menu. ");
                        return restourantMenus.restourantMenus();
                    }
                }
                break;
            default:
                System.out.println("Wrong added. ");
        }
        return restourantMenus.restourantMenus();
    }
}
