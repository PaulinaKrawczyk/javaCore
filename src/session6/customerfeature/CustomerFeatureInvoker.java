package session6.customerfeature;

import session6.customerfeature.controller.CustomerController;
import session6.customerfeature.dao.CustomerDAO;
import session6.customerfeature.model.Customer;
import session6.customerfeature.service.CustomerService;

public class CustomerFeatureInvoker {

    // Implement feature which can return you a customer information for given id
    public static void main(String[] args) {
        String expectedCustomerName = "Jane Smith";
        CustomerDAO dao = new CustomerDAO();
        CustomerService service = new CustomerService(dao);
        CustomerController controller = new CustomerController(service);
        Customer aliveCustomer = controller.getCustomerById(2);
        String actualCustomerName = aliveCustomer.getName();
        System.out.printf("Is name of '%s' is equal to expected '%s' : %s",
                actualCustomerName, expectedCustomerName, expectedCustomerName.equals(actualCustomerName));
    }

}
