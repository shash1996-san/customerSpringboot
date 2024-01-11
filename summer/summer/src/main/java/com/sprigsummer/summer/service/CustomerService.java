package com.sprigsummer.summer.service;

import com.sprigsummer.summer.dto.CustomerDTO;
import com.sprigsummer.summer.dto.request.CustomerUpdateDTO;

public interface CustomerService {

    public String saveCustomer(CustomerDTO customerDTO);

    void updateCustomer(CustomerUpdateDTO customerUpdateDTO);


    CustomerDTO getCustomerById(int customerId);
}
