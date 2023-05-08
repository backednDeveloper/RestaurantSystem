public class datasInputsClass {
    public static String inputProductInformations() {
        int typeOfProduct = printsMethods.inputRequiredInt("1 - For the food products " + "\n" +
                "2 - For the  drinks products " + "\n" +
                "Select one of the options above : "
        );
        switch (typeOfProduct) {
            case 1:
                boolean found = false;
                for (meals meals : globalDatas.mealsData) {
                    meals.getInfoMeals();
                    String input = printsMethods.inputRequiredString("Enter the name of the new product : ");
                    String mealname = input.trim().toUpperCase();
                    int placeInMenu = printsMethods.inputRequiredInt("Enter the number of the place in the menu : ");
                    for (meals information : globalDatas.mealsData) {
                        boolean sameproductsearch = false;
                        meals mealsFound = globalDatas.mapMeals.put(mealname, information);
                        meals mealsList = globalDatas.mapMeals.put(placeInMenu, information);
                        if (mealsFound != null) {
                            System.out.println("This product is available on our list. " + "\n" + "Please add another product name " + "\n"); // after use excepitons methods
                            sameproductsearch = true;
                            return datasInputsClass.inputProductInformations();
                        }
                        if (mealsList != null) {
                            System.out.println("This product list number is available on our list. " + "\n" + "Please add another number " + "\n"); // after use excepitons methods
                            sameproductsearch = true;
                            return datasInputsClass.inputProductInformations();
                        }
                        if (!sameproductsearch) {
                            String input1 = printsMethods.inputRequiredString("Enter the name of the new product : ");
                            String mealname1 = input1.trim().toUpperCase();
                            int placeInMenu1 = printsMethods.inputRequiredInt("Enter the number of the place in the menu : ");
                            int mealprice = printsMethods.inputRequiredInt("Enter the price of the product price : ");
                            meals newMeal = new meals(mealname1, mealprice, placeInMenu1);
                            globalDatas.mealsData.add(newMeal);
                            globalDatas.mapMeals.put(newMeal.getMeal(), meals);
                            globalDatas.mapMeals.put(newMeal.getPlaceInMenu(), meals);
                            globalDatas.mapMeals.put(newMeal.getMealprice(), meals);
                            newMeal.getInfoMeals();
                        }
                    }
                    found = true;
                }
                if (!found) {
                    System.out.println("Not yet information. " + "\n");
                    String input = printsMethods.inputRequiredString("Enter the name of the new product : ");
                    String mealname = input.trim().toUpperCase();
                    int placeInMenu = printsMethods.inputRequiredInt("Enter the number of the place in the menu : ");
                    int mealprice = printsMethods.inputRequiredInt("Enter the price of the product price : ");
                    meals newMeal = new meals(mealname, mealprice, placeInMenu);
                    globalDatas.mealsData.add(newMeal);
                    newMeal.getInfoMeals();
                }
                break;
            case 2:
                boolean found1 = false;
                for (drinks drinks : globalDatas.drinksData) {
                    drinks.getInfo();
                    String input1 = printsMethods.inputRequiredString("Enter the name of the new product : ");
                    String drinkname = input1.toUpperCase().trim();
                    int placeInMenuDrink = printsMethods.inputRequiredInt("Enter the number of the place in the menu : ");
                    for (drinks information : globalDatas.drinksData) {
                        boolean sameproductsearch1 = false;
                        drinks serachProduct = globalDatas.mapDrinks.put(drinkname, information);
                        drinks drinkList = globalDatas.mapDrinks.put(placeInMenuDrink, information);
                        if (serachProduct != null) {
                            System.out.println("This product is available on our list. " + "\n" + "Please add another product name"); // after use excepitons methods
                            sameproductsearch1 = true;
                            return datasInputsClass.inputProductInformations();
                        }
                        if (drinkList != null) {
                            System.out.println("This product list number available on our list. " + "\n" + "Please add another number"); // after use excepitons methods
                            sameproductsearch1 = true;
                            return datasInputsClass.inputProductInformations();
                        }
                        if (!sameproductsearch1) {
                            String input2 = printsMethods.inputRequiredString("Enter the name of the new product : ");
                            String drinkname1 = input2.toUpperCase().trim();
                            int placeInMenuDrink1 = printsMethods.inputRequiredInt("Enter the number of the place in the menu : ");
                            int drinkprice = printsMethods.inputRequiredInt("Enter the price of the product price : ");
                            drinks newdrink = new drinks(drinkname1, drinkprice, placeInMenuDrink1);
                            globalDatas.drinksData.add(newdrink);
                            globalDatas.mapDrinks.put(drinkname1, newdrink);
                            globalDatas.mapDrinks.put(placeInMenuDrink1, newdrink);
                            globalDatas.mapDrinks.put(drinkprice, newdrink);
                            newdrink.getInfo();
                        }
                    }
                    found1 = true;
                }
                if (!found1) {
                    System.out.println("Not yet information. ");
                    String input1 = printsMethods.inputRequiredString("Enter the name of the new product : ");
                    String drinkname = input1.toUpperCase().trim();
                    int placeInMenuDrink = printsMethods.inputRequiredInt("Enter the number of the place in the menu : ");
                    int drinkprice = printsMethods.inputRequiredInt("Enter the price of the product price : ");
                    drinks newdrink = new drinks(drinkname, drinkprice, placeInMenuDrink);
                    globalDatas.drinksData.add(newdrink);
                    globalDatas.mapDrinks.put(drinkname, newdrink);
                    globalDatas.mapDrinks.put(placeInMenuDrink, newdrink);
                    globalDatas.mapDrinks.put(drinkprice, newdrink);
                    newdrink.getInfo();

                }
                break;
            default:
                System.out.println("Wrong choose. ");
        }
        return administrationMenu.menu();
    }

    public static String inputProductUpdateInformations() {
        int typeOfProduct = printsMethods.inputRequiredInt("1 - For the renewal of food products " + "\n" +
                "2 - For the renewal of drinks products " + "\n" +
                "Select one of the options above : "
        );
        switch (typeOfProduct) {
            case 1:
                boolean found = false;
                for (meals meals : globalDatas.mealsData) {
                    meals.getInfoMeals();
                    String MealName = printsMethods.inputRequiredString("Enter the name of the product : ");
                    boolean found1 = false;
                    meals foundMeal = globalDatas.mapMeals.put(MealName, meals);
                    if (foundMeal != null) {
                        int choose = printsMethods.inputRequiredInt("1 - Update for name " + "\n" +
                                "2 - Update for price " + "\n" +
                                "3 - Update for list number " + "\n" +
                                "Choose number of above : "
                        );
                        switch (choose) {
                            case 1:
                                String newMealName = printsMethods.inputRequiredString("Enter the new name of the product : ");
                                meals.setMeal(newMealName);
                                found1 = true;
                                break;
                            case 2:
                                int newMealPrice = printsMethods.inputRequiredInt("Enter the new price of product : ");
                                meals.setMealprice(newMealPrice);
                                found1 = true;
                                break;
                            case 3:
                                int newMealList = printsMethods.inputRequiredInt("Enter the new list numberof product : ");
                                meals.setPlaceInMenu(newMealList);
                                found1 = true;
                                break;
                            default:
                                System.out.println("Wrong entered .!!");
                        }

                    }
                    if (!found1) {
                        System.out.println("No same product found with this name " + "\n");
                        return datasInputsClass.inputProductUpdateInformations();
                    }

                    found = true;
                }
                if (!found) {
                    System.out.println("Not yet information. ");
                    return homePanel.panel();
                }
                break;
            case 2:
                boolean found3 = false;
                for (drinks drinks : globalDatas.drinksData) {
                    drinks.getInfo();
                    String drinkName = printsMethods.inputRequiredString("Enter the name of the product : ");
                    boolean found2 = false;
                    for (drinks information : globalDatas.drinksData) {
                        drinks foundDrink = globalDatas.mapDrinks.put(drinkName, information);
                        if (foundDrink != null) {
                            int choose = printsMethods.inputRequiredInt("1 - Update for name " + "\n" +
                                    "2 - Update for price " + "\n" +
                                    "3 - Update for list number " + "\n" +
                                    "Choose number of above : "
                            );
                            switch (choose) {
                                case 1:
                                    String newDrinkName = printsMethods.inputRequiredString("Enter the new name of the product : ");
                                    information.setDrinkname(newDrinkName);
                                    found2 = true;
                                    break;
                                case 2:
                                    int newDrinkPrice = printsMethods.inputRequiredInt("Enter the new price of product : ");
                                    information.setDrinkprice(newDrinkPrice);
                                    found2 = true;
                                    break;
                                case 3:
                                    int newDrinkList = printsMethods.inputRequiredInt("Enter the new list number of product : ");
                                    information.setPlaceInMenuDrink(newDrinkList);
                                    found2 = true;
                                    break;
                                default:
                                    System.out.println("Wrong entered .!!");
                            }

                        }
                        if (!found2) {
                            System.out.println("No same product found with this name " + "\n");
                            return datasInputsClass.inputProductUpdateInformations();
                        }
                    }
                    found3 = true;
                }
                if (!found3) {
                    System.out.println("Not yet information. ");
                    return homePanel.panel();
                }

                break;
            default:
                System.out.println("Wrong entered .!! ");
        }
        return administrationMenu.menu();
    }

    public static String inputDeleteInformations() {
        int typeOfProduct = printsMethods.inputRequiredInt("1 - For the renewal of food products " + "\n" +
                "2 - For the renewal of drinks products " + "\n" +
                "Select one of the options above : "
        );
        switch (typeOfProduct) {
            case 1:
                boolean found = false;
                for (meals meals : globalDatas.mealsData) {
                    meals.getInfoMeals();
                    found = true;
                    if (!found) {
                        System.out.println("Not yet information. ");
                        return homePanel.panel();
                    }
                    String MealName = printsMethods.inputRequiredString("Enter the name of the product : ");
                    boolean found1 = false;
                    for (meals information : globalDatas.mealsData) {
                        meals foundMeal = globalDatas.mapMeals.put(MealName, information);
                        if (foundMeal != null) {
                            globalDatas.mealsData.remove(foundMeal);
                            found1 = true;
                            break;
                        }
                    }
                    if (!found1) {
                        System.out.println("No same product found with this name " + "\n");
                        return datasInputsClass.inputProductUpdateInformations();
                    }
                }
                break;
            case 2:
                boolean found3 = false;
                for (drinks drinks : globalDatas.drinksData) {
                    drinks.getInfo();
                    found3 = true;
                }
                if (!found3) {
                    System.out.println("Not yet information. ");
                    return homePanel.panel();
                }
                String drinkName = printsMethods.inputRequiredString("Enter the name of the product : ");
                boolean found2 = false;
                for (drinks information : globalDatas.drinksData) {
                    drinks foundDrink = globalDatas.mapDrinks.put(drinkName, information);
                    if (foundDrink != null) {
                        globalDatas.drinksData.remove(foundDrink);
                        found2 = true;
                    }
                }
                if (!found2) {
                    System.out.println("No same product found with this name " + "\n");
                    return datasInputsClass.inputProductUpdateInformations();
                }
        }
        return administrationMenu.menu();
    }
}
