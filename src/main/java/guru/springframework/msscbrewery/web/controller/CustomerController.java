package guru.springframework.msscbrewery.web.controller;

import com.sun.net.httpserver.Headers;
import guru.springframework.msscbrewery.services.CustomerService;
import guru.springframework.msscbrewery.web.model.Customer;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RequestMapping("/api/v1/customer")
@RestController
public class CustomerController {
    private final CustomerService customerService;
    public CustomerController(CustomerService customerService){
        this.customerService=customerService;
    }
    @GetMapping("/{customerId}")
    public ResponseEntity<Customer> getCustomer(@PathVariable("customerId") Integer customerId){
        return new ResponseEntity<>(customerService.getCustomerById(customerId), HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity handlePost(@RequestBody Customer customer){
        Customer savedCustDetails=customerService.saveCustDetails(customer);
        HttpHeaders header = new HttpHeaders();
        header.add("Location", "/api/v1/customer/"+savedCustDetails.getCustomerName()+"/"+savedCustDetails.getId().toString());
        return new ResponseEntity(header, HttpStatus.CREATED);
    }
    @PutMapping("{customerId}")
    public ResponseEntity handleUpdate(@PathVariable("customerId") Integer customerId, @RequestBody Customer customer){
        customerService.updateCustomer(customerId, customer);
        return new ResponseEntity(HttpStatus.NO_CONTENT);
    }

    @DeleteMapping("{customerId}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void handleDelete(@PathVariable("customerId") Integer customerId){
        customerService.deleteById(customerId);
    }
}
