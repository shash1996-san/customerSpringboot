package com.sprigsummer.summer.dto;

import org.hibernate.annotations.Type;

import javax.persistence.Column;
import java.util.ArrayList;

public class CustomerDTO {



    private int customerId;
    private  String custmerName;
    private String customerAddress;
    private ArrayList contactNumber;
    private String nic;
    private boolean active;
    private String customerSalary;

    public CustomerDTO() {
    }

    public CustomerDTO(int customerId, String custmerName, String customerAddress, ArrayList contactNumber, String nic, boolean active, String customerSalary) {
        this.customerId = customerId;
        this.custmerName = custmerName;
        this.customerAddress = customerAddress;
        this.contactNumber = contactNumber;
        this.nic = nic;
        this.active = active;
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

    public ArrayList getContactNumber() {
        return contactNumber;
    }

    public void setContactNumber(ArrayList contactNumber) {
        this.contactNumber = contactNumber;
    }

    public String getNic() {
        return nic;
    }

    public void setNic(String nic) {
        this.nic = nic;
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    public String getCustomerSalary() {
        return customerSalary;
    }

    public void setCustomerSalary(String customerSalary) {
        this.customerSalary = customerSalary;
    }

    @Override
    public String toString() {
        return "CustomerDTO{" +
                "customerId=" + customerId +
                ", custmerName='" + custmerName + '\'' +
                ", customerAddress='" + customerAddress + '\'' +
                ", contactNumber=" + contactNumber +
                ", nic='" + nic + '\'' +
                ", active=" + active +
                ", customerSalary='" + customerSalary + '\'' +
                '}';
    }
}
