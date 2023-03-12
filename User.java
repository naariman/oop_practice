import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public abstract class User {

    private int id;
    private String name;
    private String surname;
    private double balance;
    private List<Product> orderArrayList;

    public User(int id, String name, String surname, double balance) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.balance = balance;
        this.orderArrayList = new ArrayList<>();
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void setOrderArrayList(List<Product> orderArrayList) {
        this.orderArrayList = orderArrayList;
    }


    public List<Product> getOrderArrayList() {
        return this.orderArrayList;
    }

    public abstract void updateBalance(Product product);

    public void addProduct(Product product) {
        orderArrayList.add(product);
        updateBalance(product);
    }

    abstract public void printInfoOrder();

}
