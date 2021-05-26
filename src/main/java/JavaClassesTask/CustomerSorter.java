package JavaClassesTask;

import java.util.Arrays;

public class CustomerSorter {
    public static void main(String[] args) {
        sortCustomers();
        CardNumGetter.getCustomerByCardNumber(getCustomers(), 01023, 43512);
    }

    public static Customer [] getCustomers(){

        Customer firstCustomer = new Customer("Josh", "Radin","Johnovich", "Minsk");
        Customer secondCustomer = new Customer("Alex", "Vachovsky", "Igorevna", "America");
        Customer thirdCustomer = new Customer("Harry", "Potter", "Albusovich", "Hogwartz");

        firstCustomer.setId(2310);
        firstCustomer.setCardNum(14524);
        firstCustomer.setBankNum(141568);
        secondCustomer.setId(1568);
        secondCustomer.setCardNum(65882);
        secondCustomer.setBankNum(544693);
        thirdCustomer.setId(4785);
        thirdCustomer.setCardNum(42206);
        thirdCustomer.setBankNum(664287);


        Customer [] customers = { firstCustomer, secondCustomer, thirdCustomer };

        return customers;

    }
    public static void sortCustomers(){
        System.out.println("Here is the list of all customers : \n" +Arrays.asList(getCustomers()) );
        Customer [] allCustomers = getCustomers();
        Arrays.sort(allCustomers);
        System.out.println("And here is the list of all customers, sorted by last name : \n" + Arrays.asList(allCustomers));
    }

}

