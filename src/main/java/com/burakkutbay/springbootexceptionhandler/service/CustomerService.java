package com.burakkutbay.springbootexceptionhandler.service;

import com.burakkutbay.springbootexceptionhandler.entity.Customer;
import com.burakkutbay.springbootexceptionhandler.exception.CustomerNotFoundException;
import com.burakkutbay.springbootexceptionhandler.exception.CustomerNotNullException;
import com.burakkutbay.springbootexceptionhandler.repositroy.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

/**
 * @author : Burak KUTBAY
 * Date    : 21.11.2021
 */
@Service
public class CustomerService {

    @Autowired
    private CustomerRepository customerRepository;

    public Customer addCustomer(Customer customer) {
        if (customer.getName().isBlank() || customer.getName().isEmpty()) {
            throw new CustomerNotNullException("Customer name must be not null");
        }
        return customerRepository.save(customer);

    }

    public List<Customer> findAllCustomer() {
        return customerRepository.findAll();
    }

    public Customer getCustomerById(Long customerId) {
        Optional<Customer> optionalCustomer = customerRepository.findById(customerId);
        Customer customer = optionalCustomer.orElseThrow(() -> new CustomerNotFoundException(customerId + " "));
        return customer;
    }

    public void deleteCustomerById(Long customerId) {
        Optional<Customer> optionalCustomer = customerRepository.findById(customerId);
        Customer customer = optionalCustomer.orElseThrow(() -> new CustomerNotFoundException(customerId.toString()));

        customerRepository.deleteById(customerId);
    }

}
