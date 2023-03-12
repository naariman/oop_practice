import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {

    public static final String WELCOME_MESSAGE = "1.Add product \n" +
            "2.Add user\n" +
            "3.Get order\n" +
            "4.User info\n" +
            "5.Product info\n" +
            "6.Products left\n";


    public static void main(String[] args) {

        SalesManagement salesManagement = new SalesManagement();

        Scanner scanner = new Scanner(System.in);

        int choice = -1;

        while (choice != 0) {


            System.out.println(WELCOME_MESSAGE);

            choice = scanner.nextInt();

            switch (choice) {
                case 1: {
                    System.out.println("Enter product ID");
                    int id = scanner.nextInt();
                    System.out.println("Enter the name of product");
                    String name = scanner.next();
                    System.out.println("Enter quantity of products");
                    int quantity = scanner.nextInt();
                    System.out.println("Enter price of product");
                    double price = scanner.nextDouble();

                    Product product = new Product(id, name, quantity, price);
                    salesManagement.addProduct(product);

                    System.out.println("The product is added!");

                    break;
                }

                case 2: {

                    System.out.println("Choose which user you want to add");

                    System.out.println("1.Ordinary user");
                    System.out.println("2.Prime user");
                    System.out.println("3.Loyal user");

                    int choiceUser = scanner.nextInt();

                    if (choiceUser == 1) {
                        System.out.println("Enter ID");
                        int id = scanner.nextInt();
                        System.out.println("Enter name");
                        String name = scanner.next();
                        System.out.println("Enter surname");
                        String surname = scanner.next();
                        System.out.println("balance");
                        double balance = scanner.nextDouble();

                        User user = new OrdinaryUser(id, name, surname, balance);
                        salesManagement.addUser(user);

                        System.out.println("The Ordinary user is added");

                        break;
                    } else if (choiceUser == 2) {
                        System.out.println("Enter ID");
                        int id = scanner.nextInt();
                        System.out.println("Enter name");
                        String name = scanner.next();
                        System.out.println("Enter surname");
                        String surname = scanner.next();
                        System.out.println("balance");
                        double balance = scanner.nextDouble();

                        User user = new PrimeUser(id, name, surname, balance);
                        salesManagement.addUser(user);

                        System.out.println("The prime user is added");

                        break;
                    } else if (choiceUser == 3) {
                        System.out.println("Enter ID");
                        int id = scanner.nextInt();
                        System.out.println("Enter name");
                        String name = scanner.next();
                        System.out.println("Enter surname");
                        String surname = scanner.next();
                        System.out.println("balance");
                        double balance = scanner.nextDouble();

                        User user = new LoyalUser(id, name, surname, balance);
                        salesManagement.addUser(user);

                        System.out.println("The loyal user is added");

                        break;
                    }

                    break;
                }

                case 3: {
                    System.out.println("Get order");

                    System.out.println("Enter user ID");
                    int userId = scanner.nextInt();

                    System.out.println("Enter product ID");
                    int productId = scanner.nextInt();

                    salesManagement.addOrder(userId, productId);

                    break;
                }

                case 4: {
                    System.out.println("Enter id of User");

                    int id = scanner.nextInt();

                    salesManagement.printInfoUser(id);

                    break;
                }

                case 5: {
                    System.out.println("Enter id of Product");

                    int id = scanner.nextInt();

                    salesManagement.printInfoProduct(id);

                    break;
                }

                case 6: {
                    System.out.println("Enter product id");

                    int id = scanner.nextInt();

                    salesManagement.counterProductsLeft(id);

                    break;
                }
            }
        }
    }
}