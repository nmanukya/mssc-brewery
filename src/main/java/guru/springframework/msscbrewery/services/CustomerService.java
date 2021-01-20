package guru.springframework.msscbrewery.services;

import guru.springframework.msscbrewery.web.model.CustomerDto;

public interface CustomerService {
    CustomerDto getCustomerById(Integer customerId);
    CustomerDto saveCustDetails(CustomerDto customerDto);

    void updateCustomer(Integer customerId, CustomerDto customerDto);

    void deleteById(Integer customerId);


}
