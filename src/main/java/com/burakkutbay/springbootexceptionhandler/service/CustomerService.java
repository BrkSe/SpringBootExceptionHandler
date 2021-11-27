package com.burakkutbay.springbootexceptionhandler.service;

import com.burakkutbay.springbootexceptionhandler.entity.Customer;
import com.burakkutbay.springbootexceptionhandler.repositroy.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author : Burak KUTBAY
 * Date    : 21.11.2021
 */
@Service
public class CustomerService {

    @Autowired
    private CustomerRepository customerRepository;

    public Customer addCustomer(Customer customer){
        return customerRepository.save(customer);
    }

    public List<Customer> findAllCustomer(){
        return customerRepository.findAll();
    }

    public Customer getCustomerById(Long customerId){
        return customerRepository.findById(customerId).get();
    }

    public void deleteCustomerById(Long customerId){
        customerRepository.deleteById(customerId);
    }

}
