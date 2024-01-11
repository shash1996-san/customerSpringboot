package com.sprigsummer.summer.dto.request;

import java.util.ArrayList;

public class CustomerUpdateDTO {
    private int customerId;
    private  String custmerName;
    private String customerAddress;
    private String customerSalary;

    public CustomerUpdateDTO() {
    }

    public CustomerUpdateDTO(int customerId, String custmerName, String customerAddress, String customerSalary) {
        this.customerId = customerId;
        this.custmerName = custmerName;
        this.customerAddress = customerAddress;
        this.customerSalary = customerSalary;
    }

    public int getCustomerId() {
        return customerId;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }

    public String getCustmerName() {
        return custmerName;
    }

    public void setCustmerName(String custmerName) {
        this.custmerName = custmerName;
    }

    public String getCustomerAddress() {
        return customerAddress;
    }

    public void setCustomerAddress(String customerAddress) {
        this.customerAddress = customerAddress;
    }

    public String getCustomerSalary() {
        return customerSalary;
    }

    public void setCustomerSalary(String customerSalary) {
        this.customerSalary = customerSalary;
    }

    @Override
    public String toString() {
        return "CustomerUpdateDTO{" +
                "customerId=" + customerId +
                ", custmerName='" + custmerName + '\'' +
                ", customerAddress='" + customerAddress + '\'' +
                ", customerSalary='" + customerSalary + '\'' +
                '}';
    }
}
