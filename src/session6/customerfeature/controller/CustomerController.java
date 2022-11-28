package session6.customerfeature.controller;

import session6.customerfeature.model.Customer;
import session6.customerfeature.service.CustomerService;

public class CustomerController {

    private final CustomerService service;

    public CustomerController(CustomerService service) {
        this.service = service;
    }

    public Customer getCustomerById(int id) {
        return service.getCustomerById(id);
    }
}
