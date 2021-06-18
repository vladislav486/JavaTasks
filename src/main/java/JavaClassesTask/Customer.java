package JavaClassesTask;

public class Customer implements Comparable <Customer> {


    private String firstName, lastName, surname;
    public String address;
    private int id;
    public int cardNum, bankNum;
    
    public Customer(String firstName, String lastName, String surname, String address){
        this.firstName = firstName;
        this.lastName = lastName;
        this.surname = surname;
        this.address = address;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getCardNum() {
        return cardNum;
    }

    public void setCardNum(int cardNum) {
        this.cardNum = cardNum;
    }

    public int getBankNum() {
        return bankNum;
    }

    public void setBankNum(int bankNum) {
        this.bankNum = bankNum;
    }

    @Override
    public String toString() {
        return ("("+ firstName +", "+ lastName +", "+ surname +"," +
                " "+ address +", "+ id +", "+ cardNum +", "+ bankNum +")");
    }

    @Override
    public int compareTo(Customer o) {
        return this.lastName.compareTo(o.lastName);
    }
}
