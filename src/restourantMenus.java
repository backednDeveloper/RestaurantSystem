public class restourantMenus {
    public static String restourantMenus() {
        int typeOfProduct = printsMethods.inputRequiredInt("1 - For meals " + "\n" +
                "2 - For drinks " + "\n" +
                "Select one of the options above : "
        );
        switch (typeOfProduct) {
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
                break;
            case 2:
                boolean found1 = false;
                for (drinks drinks : globalDatas.drinksData) {
                    drinks.getInfo();
                    found1 = true;
                }
                if (!found1) {
                    System.out.println("Not yet information. ");
                    return homePanel.panel();
                }
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
                int ordernumbers = 1;
                while (ordernumbers >= 1) {
                    boolean sameproductsearch = false;
                    for (meals meals : globalDatas.mealsData) {
                        String mealname = printsMethods.inputRequiredString("Enter the name of the product : ");
                        meals mealsFound = globalDatas.mapMealsString.put(mealname, meals);
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
                /*String drinkname = printsMethods.inputRequiredString("Enter the name of the product : ");
                for (drinks drinks : globalDatas.drinksData) {
                    boolean sameproduct = false;
                    drinks drinksfound = globalDatas.mapDrinksString.put(drinkname, drinks);
                    if (drinksfound != null) {
                        int ordernumbers = 0;
                        orderInformationDatas orderInformationDatas = new orderInformationDatas(drinkname, ordernumbers);
                        while (ordernumbers > 0) {
                            globalDatas.orderInformations.add(orderInformationDatas);
                            ordernumbers++;
                            System.out.println("Your order number " + ordernumbers + " has been confirmed." + "\n" +
                                    "Order informations : " + globalDatas.orderInformations.get(ordernumbers).getOrderInformations()
                            );
                        }
                    }
                    if (!sameproduct) {
                        System.out.println("Please select an item on the menu. ");
                        return restourantMenus.restourantMenus();
                    }
                }*/
                break;
            default:
                System.out.println("Wrong added. ");
        }
        return restourantMenus.restourantMenus();
    }
}
