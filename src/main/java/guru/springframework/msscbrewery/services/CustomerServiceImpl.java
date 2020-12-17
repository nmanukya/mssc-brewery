package guru.springframework.msscbrewery.services;

import guru.springframework.msscbrewery.web.model.Customer;
import org.springframework.stereotype.Service;

/**
 * Created by jt on 2019-04-21.
 */
@Service
public class CustomerServiceImpl implements CustomerService {
    @Override
    public Customer getCustomerById(Integer customerId) {
        return Customer.builder().id(customerId)
                .customerName("Vazgen")
                .build();
    }

    @Override
    public Customer saveCustDetails(Customer customer) {
        return Customer.builder().id(customer.getId())
                .customerName(customer.getCustomerName())
                .build();
    }

    @Override
    public void updateCustomer(Integer customerId, Customer customer) {
        //TODO implement updateCustomer
    }

    @Override
    public void deleteById(Integer customerId) {

    }
}
