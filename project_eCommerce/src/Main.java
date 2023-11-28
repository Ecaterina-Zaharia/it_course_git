import java.util.Scanner;

        public class Main {
            public static void main(String[] args) {

                int items = 0;

                Scanner reader = new Scanner(System.in);

                System.out.println("Please, provide your budget");

                int user_budget = Integer.valueOf(reader.nextLine());


                String[] shop_item = new String[5];

                shop_item[0] = "Eggs 10 lei per 1 box - press 0";
                shop_item[1] = "Milk 12 lei per 1 1l  - press 1";
                shop_item[2] = "Meat 35 lei per 1 kg - press 2";
                shop_item[3] = "Juice 15 lei per 1l - press 3";
                shop_item[4] = "Orange  17 lei per 1kg - press 4";

                int[] price = new int[5];
                price[0] = 10;
                price[1] = 12;
                price[2] = 35;
                price[3] = 15;
                price[4] = 17;

                String[] shop_list = new String[100];

                int index = 0;
                while (index < shop_item.length) {
                    System.out.println(shop_item[index]);
                    index = index + 1;
                }

                System.out.println("Please, press the number of the item to add it to the basket: ");
                int user_choice = Integer.valueOf(reader.nextLine());

                while (user_budget != 0) {
                    if (user_budget < price[user_choice]) {
                        System.out.println("Insufficient budget to purchase this item.");
                        break;
                    } else {
                        user_budget = user_budget - price[user_choice];
                        System.out.println("Added " + shop_item[user_choice] + " to your basket.");
                        System.out.println("Your sold is: " + user_budget);
                        shop_list[items] = shop_item[user_choice];
                        items++;
                        System.out.println("Please, press the number of the item to add it to the basket: ");
                    }
                    user_choice = Integer.valueOf(reader.nextLine());
                }

                System.out.println();

                System.out.println("Items: ");
                for (int i = 0; i < items; i++) {

                    System.out.println();

                    System.out.println(shop_list[i]);
                }


            }
        }
    }
}