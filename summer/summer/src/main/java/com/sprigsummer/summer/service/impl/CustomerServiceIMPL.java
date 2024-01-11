package com.sprigsummer.summer.service.impl;

import com.sprigsummer.summer.dto.CustomerDTO;
import com.sprigsummer.summer.dto.request.CustomerUpdateDTO;
import com.sprigsummer.summer.entity.Customer;
import com.sprigsummer.summer.repo.CustomerRepo;
import com.sprigsummer.summer.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CustomerServiceIMPL implements CustomerService {

    @Autowired
    private CustomerRepo customerRepo;
    @Override
    public String saveCustomer(CustomerDTO customerDTO) {
        Customer customer = new Customer(
                customerDTO.getCustomerId(),
                customerDTO.getCustmerName(),
                customerDTO.getCustomerAddress(),
                customerDTO.getCustomerSalary(),
                customerDTO.getContactNumber(),
                customerDTO.getNic(),
                customerDTO.isActive()
        );
   customerRepo.save(customer);

        return customerDTO.getCustmerName();
    }

    @Override
    public void updateCustomer(CustomerUpdateDTO customerUpdateDTO) {

        if(customerRepo.existsById(customerUpdateDTO.getCustomerId())){

            Customer customer = customerRepo.getReferenceById(customerUpdateDTO.getCustomerId());

            customer.setCustmerName(customerUpdateDTO.getCustmerName());
            customer.setCustomerAddress(customerUpdateDTO.getCustomerAddress());
            customer.setCustomerSalary(customerUpdateDTO.getCustomerSalary());

            customerRepo.save(customer);


        }else{
            throw new RuntimeException("no data found");
        }


    }

    @Override
    public CustomerDTO getCustomerById(int customerId) {
        if(customerRepo.existsById(customerId)){
            Customer customer = customerRepo.getReferenceById(customerId);
            CustomerDTO customerDTO = new CustomerDTO(
                    customer.getCustomerId(),
                    customer.getCustmerName(),
                    customer.getCustomerAddress(),
                    customer.getContactNumber(),
                    customer.getNic(),
                    customer.isActive(),
                    customer.getCustomerSalary()
            );
return customerDTO;
        }
        else {
            throw new RuntimeException("no data found");
        }


    }


}
