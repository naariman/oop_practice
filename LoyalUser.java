import java.util.List;

public class LoyalUser extends User{

    private double cashback;

    public LoyalUser(int id, String name, String surname, double balance) {
        super(id, name, surname, balance);
        this.cashback = 0.05;
    }

    @Override
    public void updateBalance(Product product) {
        if(this.getOrderArrayList().contains(product)){
            setBalance(getBalance() - product.getPrice());
            setBalance(product.getPrice() * cashback);
        }
    }

    @Override
    public void printInfoOrder() {
        System.out.println();
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + super.getId() +
                ", name='" + super.getName() + '\'' +
                ", balance=" + super.getBalance() +
                ", orderArrayList=" + super.getOrderArrayList() +
                '}';
    }
}
