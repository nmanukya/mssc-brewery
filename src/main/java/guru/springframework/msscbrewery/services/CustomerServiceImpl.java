package guru.springframework.msscbrewery.services;

import guru.springframework.msscbrewery.web.model.CustomerDto;
import org.springframework.stereotype.Service;

/**
 * Created by jt on 2019-04-21.
 */
@Service
public class CustomerServiceImpl implements CustomerService {
    @Override
    public CustomerDto getCustomerById(Integer customerId) {
        return CustomerDto.builder().id(customerId)
                .customerName("Vazgen")
                .build();
    }

    @Override
    public CustomerDto saveCustDetails(CustomerDto customerDto) {
        return CustomerDto.builder().id(customerDto.getId())
                .customerName(customerDto.getCustomerName())
                .build();
    }

    @Override
    public void updateCustomer(Integer customerId, CustomerDto customerDto) {
        //TODO implement updateCustomer
    }

    @Override
    public void deleteById(Integer customerId) {

    }
}
