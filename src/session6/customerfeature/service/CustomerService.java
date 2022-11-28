package session6.customerfeature.service;

import session6.customerfeature.dao.CustomerDAO;
import session6.customerfeature.model.Customer;

public class CustomerService {

    private CustomerDAO dao;
    public CustomerService(CustomerDAO dao) {
        this.dao = dao;
    }

    public Customer getCustomerById(int id) {
        return dao.getCustomerById(id);
    }
}
