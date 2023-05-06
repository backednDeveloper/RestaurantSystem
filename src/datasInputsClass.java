public class datasInputsClass {
    public static String inputProductInformations() {
        int typeOfProduct1 = printsMethods.inputRequiredInt("1 - For meals " + "\n" +
                "2 - For drinks " + "\n" +
                "Select one of the options above : "
        );
        switch (typeOfProduct1) {
            case 1:
                for (meals meals : globalDatas.mealsData) {
                    String meals1 = globalDatas.mapMealsString.get(meals).getMeal();
                    int mealsPrice = globalDatas.mapMealsInt.get(meals).getMealprice();
                    System.out.println(" ------------- Meals ------------- " + "\n" +
                            meals1 +
                            " ------------- Prices ------------- " + "\n" +
                            mealsPrice
                    );
                }
                break;
            case 2:
                for (drinks drinks : globalDatas.drinksData) {
                    String drinks1 = globalDatas.mapDrinksString.get(drinks).getDrinkname();
                    int drinkPrices = globalDatas.mapDrinksInt.get(drinks).getDrinkprice();
                    System.out.println(" ------------- Drinks ------------- " + "\n" +
                            drinks1 +
                            " ------------- Prices ------------- " + "\n" +
                            drinkPrices
                    );
                }
                break;
            default:
                System.out.println("Wrong choose !!! ");
                break;
        }
        int typeOfProduct = printsMethods.inputRequiredInt("1 - For the food products " + "\n" +
                "2 - For the  drinks products " + "\n" +
                "Select one of the options above : "
        );
        switch (typeOfProduct) {
            case 1:
                String mealname = printsMethods.inputRequiredString("Enter the name of the product : ");
                int mealprice = printsMethods.inputRequiredInt("Enter the price of the product price : ");
                for (meals meals : globalDatas.mealsData) {
                    boolean sameproductsearch = false;
                    meals mealsFound = globalDatas.mapMealsString.put(mealname, meals);
                    if (mealsFound != null) {
                        System.out.println("This product is available on our list. " + "\n" + "Please add another product name " + "\n"); // after use excepitons methods
                        return datasInputsClass.inputProductInformations();
                    }

                    if (!sameproductsearch) {
                        meals meals2 = new meals(mealname, mealprice);
                        globalDatas.mealsData.add(meals2);
                        globalDatas.mapMealsString.put(mealname, meals);
                        globalDatas.mapMealsInt.put(mealprice, meals);
                        System.out.println("New product added to the list. ");
                    }
                }
            case 2:
                String drinkname = printsMethods.inputRequiredString("Enter the name of the product : ");
                int drinkprice = printsMethods.inputRequiredInt("Enter the price of the product price : ");
                for (drinks drinks : globalDatas.drinksData) {
                    boolean sameproductsearch = false;
                    drinks serachProduct = globalDatas.mapDrinksString.put(drinkname, drinks);
                    if (serachProduct != null) {
                        System.out.println("This product is available on our list. " + "\n" + "Please add another product name"); // after use excepitons methods
                        sameproductsearch = true;
                        return datasInputsClass.inputProductInformations();
                    }
                    if (!sameproductsearch) {
                        drinks drinks2 = new drinks(drinkname, drinkprice);
                        globalDatas.drinksData.add(drinks2);
                        globalDatas.mapDrinksString.put(drinkname, drinks);
                        globalDatas.mapDrinksInt.put(drinkprice, drinks);
                        System.out.println("New product added to the list. ");
                    }

                }
        }
        return administrationMenu.menu();
    }

    public static String inputProductUpdateInformations() {
        int typeOfProduct1 = printsMethods.inputRequiredInt("1 - For meals " + "\n" +
                "2 - For drinks " + "\n" +
                "Select one of the options above : "
        );
        switch (typeOfProduct1) {
            case 1:
                for (meals meals : globalDatas.mealsData) {
                    String meals1 = globalDatas.mapMealsString.get(meals).getMeal();
                    int mealsPrice = globalDatas.mapMealsInt.get(meals).getMealprice();
                    System.out.println(" ------------- Meals ------------- " + "\n" +
                            meals1 +
                            " ------------- Prices ------------- " + "\n" +
                            mealsPrice
                    );
                }
                break;
            case 2:
                for (drinks drinks : globalDatas.drinksData) {
                    String drinks1 = globalDatas.mapDrinksString.get(drinks).getDrinkname();
                    int drinkPrices = globalDatas.mapDrinksInt.get(drinks).getDrinkprice();
                    System.out.println(" ------------- Drinks ------------- " + "\n" +
                            drinks1 +
                            " ------------- Prices ------------- " + "\n" +
                            drinkPrices
                    );
                }
                break;
            default:
                System.out.println("Wrong choose !!! ");
                break;
        }
        int typeOfProduct = printsMethods.inputRequiredInt("1 - For the renewal of food products " + "\n" +
                "2 - For the renewal of drinks products " + "\n" +
                "Select one of the options above : "
        );
        switch (typeOfProduct) {
            case 1:
                String MealName = printsMethods.inputRequiredString("Enter the name of the product : ");
                int MealPrice = printsMethods.inputRequiredInt("Enter the name of the product price :");
                boolean found1 = false;
                for (meals meals : globalDatas.mealsData) {
                    meals foundMeal = globalDatas.mapMealsString.put(MealName, meals);
                    if (foundMeal != null) {
                        meals.setMeal(MealName);
                        meals.setMealprice(MealPrice);
                        found1 = true;
                    }
                    if (!found1) {
                        System.out.println("No product found with this name " + "\n");
                        return datasInputsClass.inputProductUpdateInformations();
                    }
                }
            case 2:
                String newDrinkName = printsMethods.inputRequiredString("Enter the name of the product : ");
                int newDrinkPrice = printsMethods.inputRequiredInt("Enter the name of the product price :");
                boolean found = false;
                for (drinks drinks : globalDatas.drinksData) {
                    drinks foundDrinks = globalDatas.mapDrinksString.put(newDrinkName, drinks);
                    if (foundDrinks != null) {
                        drinks.setDrinkname(newDrinkName);
                        drinks.setDrinkprice(newDrinkPrice);
                        found = true;
                    }
                    if (!found) {
                        System.out.println("No product found with this name " + "\n");
                        return administrationMenu.menu();
                    }
                }
        }
        return administrationMenu.menu();
    }

    public static String inputDeleteInformations() {
        int typeOfProduct1 = printsMethods.inputRequiredInt("1 - For meals " + "\n" +
                "2 - For drinks " + "\n" +
                "Select one of the options above : "
        );
        switch (typeOfProduct1) {
            case 1:
                for (meals meals : globalDatas.mealsData) {
                    String meals1 = globalDatas.mapMealsString.get(meals).getMeal();
                    int mealsPrice = globalDatas.mapMealsInt.get(meals).getMealprice();
                    System.out.println(" ------------- Meals ------------- " + "\n" +
                            meals1 +
                            " ------------- Prices ------------- " + "\n" +
                            mealsPrice
                    );
                }
                break;
            case 2:
                for (drinks drinks : globalDatas.drinksData) {
                    String drinks1 = globalDatas.mapDrinksString.get(drinks).getDrinkname();
                    int drinkPrices = globalDatas.mapDrinksInt.get(drinks).getDrinkprice();
                    System.out.println(" ------------- Drinks ------------- " + "\n" +
                            drinks1 +
                            " ------------- Prices ------------- " + "\n" +
                            drinkPrices
                    );
                }
                break;
            default:
                System.out.println("Wrong choose !!! ");
                break;
        }
        int typeOfProduct = printsMethods.inputRequiredInt("1 - For the delete of food products " + "\n" +
                "2 - For the delete of drinks products " + "\n" +
                "Select one of the options above : "
        );
        switch (typeOfProduct) {
            case 1:
                String MealName = printsMethods.inputRequiredString("Enter the name of the product : ");
                int MealPrice = printsMethods.inputRequiredInt("Enter the name of the product price :");
                boolean found1 = false;
                for (meals meals : globalDatas.mealsData) {
                    meals foundMeal = globalDatas.mapMealsString.put(MealName, meals);
                    if (foundMeal != null) {
                        meals meals1 = new meals(MealName, MealPrice);
                        globalDatas.mealsData.remove(meals1);
                        globalDatas.mapMealsString.remove(MealName);
                        globalDatas.mapMealsInt.remove(MealPrice);
                        found1 = true;
                    }
                    if (!found1) {
                        System.out.println("No product found with this name " + "\n");
                        return administrationMenu.menu();
                    }
                }
            case 2:
                String DrinkName = printsMethods.inputRequiredString("Enter the name of the product : ");
                int DrinkPrice = printsMethods.inputRequiredInt("Enter the name of the product price :");
                boolean found = false;
                for (drinks drinks : globalDatas.drinksData) {
                    drinks foundDrinks = globalDatas.mapDrinksString.put(DrinkName, drinks);
                    if (foundDrinks != null) {
                        drinks drinks1 = new drinks(DrinkName, DrinkPrice);
                        globalDatas.mapDrinksString.remove(DrinkName);
                        globalDatas.mapDrinksInt.remove(DrinkPrice);
                        globalDatas.drinksData.remove(drinks1);
                    }
                    if (!found) {
                        System.out.println("No product found with this name " + "\n");
                        return administrationMenu.menu();
                    }
                }
        }

        return administrationMenu.menu();
    }
}
