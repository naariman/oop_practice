import java.util.ArrayList;
import java.util.List;

public class PrimeUser extends User{


    public PrimeUser(int id, String name, String surname, double balance) {
        super(id, name, surname, balance);
    }

    @Override
    public void updateBalance(Product product) {
        if(this.getOrderArrayList().contains(product)){
            setBalance(getBalance() - (product.getPrice() * 0.95));
        }
    }

    @Override
    public void printInfoOrder() {

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
