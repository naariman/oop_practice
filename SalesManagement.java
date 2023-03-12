    import java.util.ArrayList;

    public class SalesManagement {
        private ArrayList<Product> productArrayList;
        private ArrayList<User> userArrayList;
        private ArrayList<Order> orderArrayList;

        public SalesManagement() {
            this.productArrayList = new ArrayList<Product>();
            this.orderArrayList = new ArrayList<Order>();
            this.userArrayList = new ArrayList<User>();
        }

        public SalesManagement(ArrayList<Product> productArrayList, ArrayList<Order> orderArrayList, ArrayList<User> userArrayList) {
            this.productArrayList = productArrayList;
            this.orderArrayList = orderArrayList;
            this.userArrayList = userArrayList;
        }

        public ArrayList<Product> getProductArrayList() {
            return productArrayList;
        }

        public ArrayList<User> getUserArrayList() {
            return userArrayList;
        }

        public ArrayList<Order> getOrderArrayList() {
            return orderArrayList;
        }

        public void addProduct(Product product) {
            this.productArrayList.add(product);
        }

        public void addOrder(int userID, int productID) {
            for (User user :
                    userArrayList) {
                if (user.getId() == userID) {
                    for (Product product :
                            productArrayList) {
                        if (product.getId() == productID) {
                            if (product.getQuantity() >= 1) {
                                if (user.getBalance() >= product.getPrice()) {
                                    user.addProduct(product);
                                    product.setQuantity(product.getQuantity() - 1);
                                    System.out.println("Thank you");
                                    if(user.getOrderArrayList().contains(product)) {

                                    }
                                } else {
                                    System.out.println("Not enough money");
                                }
                            } else {
                                System.out.println("quantity of product is 0");
                            }
                        }
                    }
                }
            }
        }

        public void addUser(User user) {
            this.userArrayList.add(user);
        }

        public void printInfoUser(int id) {
            for (User user :
                    userArrayList) {
                if (user.getId() == id) {
                    System.out.println(user.toString());
                }
            }
        }

        public void printInfoProduct(int id) {
            for (Product product :
                    productArrayList) {
                if (product.getId() == id) {
                    System.out.println(product.toString());
                }
            }
        }

        public void counterProductsLeft(int id) {

            int counter = 0;

            for (User user :
                    userArrayList) {
                for (Product product :
                        user.getOrderArrayList()) {
                    if (product.getId() == id) {
                        counter++;
                    }
                }
            }

            System.out.println(counter);
        }


    }
