public class restourantMenus {
    public static String restourantMenus() {
        int typeOfProduct = printsMethods.inputRequiredInt("1 - For meals " + "\n" +
                "2 - For drinks " + "\n" +
                "Select one of the options above : "
        );
        switch (typeOfProduct) {
            case 1:
                for (meals meals : globalDatas.mealsData) {
                    String meals1 = globalDatas.mapMealsString.get(meals).getMeal();
                    int mealsPrice = globalDatas.mapMealsInt.get(meals).getMealprice();
                    System.out.println(" ------------- Meals ------------- " + "\n" +
                            meals1 +
                            " ------------- Prices ------------- " + "\n" +
                            mealsPrice
                    );
                    break;
                }
            case 2:
                for (drinks drinks : globalDatas.drinksData) {
                    String drinks1 = globalDatas.mapDrinksString.get(drinks).getDrinkname();
                    int drinkPrices = globalDatas.mapDrinksInt.get(drinks).getDrinkprice();
                    System.out.println(" ------------- Drinks ------------- " + "\n" +
                            drinks1 +
                            " ------------- Prices ------------- " + "\n" +
                            drinkPrices
                    );
                    break;
                }
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
                String mealname = printsMethods.inputRequiredString("Enter the name of the product : ");
                for (meals meals : globalDatas.mealsData) {
                    boolean sameproductsearch = false;
                    meals mealsFound = globalDatas.mapMealsString.put(mealname, meals);
                    if (mealsFound != null) {
                        int ordernumbers = 0;
                        orderInformationDatas orderInformationDatas = new orderInformationDatas(mealname, ordernumbers);
                        while (ordernumbers > 0) {
                            globalDatas.orderInformations.add(orderInformationDatas);
                            ordernumbers++;
                            System.out.println("Your order number " + ordernumbers + " has been confirmed." + "\n" +
                                    "Order informations : " + globalDatas.orderInformations.get(ordernumbers).getOrderInformations()
                            );
                        }
                        sameproductsearch = true;
                    }
                    if (!sameproductsearch) {
                        System.out.println("Please select an item on the menu. ");
                        return restourantMenus.restourantMenus();
                    }
                }
            case 2:
                String drinkname = printsMethods.inputRequiredString("Enter the name of the product : ");
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
                }
        }
        return restourantMenus.restourantMenus();
    }
}
