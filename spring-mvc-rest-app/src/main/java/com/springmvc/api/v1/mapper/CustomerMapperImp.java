package com.springmvc.api.v1.mapper;

import com.springmvc.api.v1.model.CustomerDTO;
import com.springmvc.domain.Customer;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@NoArgsConstructor
public class CustomerMapperImp implements CustomerMapper {

    @Override
    public CustomerDTO customerToCustomerDTO(Customer customer) {
        CustomerDTO customerDTO = new CustomerDTO();
        if (customer == null) {
            return customerDTO;
        }
        customerDTO.setFirstname(customer.getFirstname());
        customerDTO.setLastname(customer.getLastname());
        return customerDTO;
    }

    @Override
    public Customer customerDtoToCustomer(CustomerDTO customerDTO) {
        Customer customer = new Customer();
        if (customerDTO == null) {
            return customer;
        }
        customer.setFirstname(customerDTO.getFirstname());
        customer.setLastname(customerDTO.getLastname());
        return customer;
    }
}
