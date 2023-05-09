public class restourantMenus {
    public static String restourantMenus() {
        int typeOfProduct1 = printsMethods.inputRequiredInt("1 - For the food products " + "\n" +
                "2 - For the  drinks products " + "\n" +
                "Select one of the options above : "
        );
        switch (typeOfProduct1) {
            case 1:
                System.out.println("-------- Menu -------- ");
                int index = 1;
                for (meals information : globalDatas.mealsData) {
                    System.out.println(index + "-" + information.getInfoMeals());
                    index++;
                    int choose = printsMethods.inputRequiredInt("Enter the number of products you choose from the menu : ");
                    int choose1 = printsMethods.inputRequiredInt("Choose product from menu (0 is exit): ");
                    if (choose1 == 0) {
                        break;
                    } else if (choose1 < 1 || choose1 > globalDatas.mealsData.size()) {
                        System.out.println("Wrong choose!");
                    } else {
                        meals choosProduct = globalDatas.mealsData.get(choose1 - 1);
                        int choosNumber = printsMethods.inputRequiredInt("Enter how many of this item you want : ");
                        int chooseAdress = printsMethods.inputRequiredInt("Write your adress : ");
                        int price = information.getMealprice() * choosNumber;
                        boolean look = false;
                        if (information.getMealprice() == price / choosNumber) {
                            orderInformationDatas informationDatas = new orderInformationDatas(choosProduct.getMeal(), choosNumber, price, chooseAdress);
                            globalDatas.orderInformations.add(informationDatas);
                            System.out.println(informationDatas.getOrderInformations());
                            look = true;
                        }
                        if (!look) {
                            orderInformationDatas informationDatas1 = new orderInformationDatas(choosProduct.getMeal(), choosNumber, price, chooseAdress);
                            informationDatas1.setPrice(price + (informationDatas1.getPrice()));
                            globalDatas.orderInformations.add(informationDatas1);
                            System.out.println("The number of the product you choose from the menu : " + information.getPlaceInMenu()
                                    + "\n" + "Your #" + choose + " order"
                                    + "\n" + "Your order informations " + "\n" + informationDatas1.getOrderInformations()
                                    + "\n" + "Your order total price is : " + "\n" + price
                            );
                        }
                    }
                }
                break;
            case 2:
                break;
            default:
                System.out.println("Wrong added. ");
        }
        return restourantMenus.restourantMenus();

    }
}
