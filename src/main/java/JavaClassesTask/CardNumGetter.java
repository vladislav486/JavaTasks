package JavaClassesTask;


public class CardNumGetter{
    public static void getCustomerByCardNumber(Customer [] customers, int min, int max){
        System.out.println("Customers that have required medical card number : ");
        for (Customer customer : customers) {
            if (customer.getCardNum() >= min && customer.getCardNum() <= max){
                System.out.println(customer);
            }
        }
    }
}
