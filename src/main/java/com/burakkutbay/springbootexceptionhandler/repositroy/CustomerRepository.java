package com.burakkutbay.springbootexceptionhandler.repositroy;


import com.burakkutbay.springbootexceptionhandler.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author : Burak KUTBAY
 * Date    : 21.11.2021
 */
public interface CustomerRepository extends JpaRepository<Customer, Long> {
}
