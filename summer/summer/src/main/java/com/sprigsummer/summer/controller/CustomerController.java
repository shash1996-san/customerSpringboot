package com.sprigsummer.summer.controller;
import com.sprigsummer.summer.dto.CustomerDTO;
import com.sprigsummer.summer.dto.request.CustomerUpdateDTO;
import com.sprigsummer.summer.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin
@RequestMapping("api/v1/customer" )

public class CustomerController {
    @Autowired
    private CustomerService customerService;

    @PostMapping("/test")
    public String saveCustomer( @RequestBody  CustomerDTO customerDTO){
        customerService.saveCustomer(customerDTO);

        return "saved"  ;
    }

    @PutMapping("/update")
    public  String updateCustomer(@RequestBody CustomerUpdateDTO customerUpdateDTO){
        customerService.updateCustomer(customerUpdateDTO);

        return "updated";
    }

    @GetMapping(
            path = "/get-by-id",
            params = "id"
    )
    public CustomerDTO getCustomerById(@RequestParam (value = "id") int customerId){
        CustomerDTO customerDTO = customerService.getCustomerById(customerId);
        return customerDTO;
    }



}
