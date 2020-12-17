package guru.springframework.msscbrewery.services;

import guru.springframework.msscbrewery.web.model.Customer;

public interface CustomerService {
    Customer getCustomerById(Integer customerId);
    Customer saveCustDetails(Customer customer);

    void updateCustomer(Integer customerId, Customer customer);

    void deleteById(Integer customerId);


}
