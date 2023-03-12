import java.util.List;

public class OrdinaryUser extends User{

    public OrdinaryUser(int id, String name, String surname, double balance) {
        super(id, name, surname, balance);
    }

    @Override
    public void updateBalance(Product product) {
        if(this.getOrderArrayList().contains(product)){
            setBalance(getBalance() - product.getPrice());
        }
    }



    @Override
    public void printInfoOrder() {
        System.out.println(getOrderArrayList());
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
