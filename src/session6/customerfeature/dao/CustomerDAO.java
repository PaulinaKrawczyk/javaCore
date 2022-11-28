package session6.customerfeature.dao;

import session6.customerfeature.model.Customer;
import java.util.ArrayList;
import java.util.List;
public class CustomerDAO {
    List<Customer> db;
    public CustomerDAO() {
        db = List.of(
            new Customer(1, "John Does"),
            new Customer(2, "Jane Smith"),
            new Customer(3, "Ivan Paulouski")
        );
    }
    public Customer getCustomerById(int id) {
        for (Customer customer: db) {
            if (customer.getId() == id){
                return customer;
            }
        }
        return new Customer(0, "Unknown person");
    }
}
