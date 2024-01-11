package com.sprigsummer.summer.entity;

import com.vladmihalcea.hibernate.type.json.JsonType;
import org.hibernate.annotations.Type;
import org.hibernate.annotations.TypeDef;
import org.hibernate.annotations.TypeDefs;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.ArrayList;

@Entity
@Table(name = "cutomer")
@TypeDefs({
        @TypeDef(name ="json" , typeClass = JsonType.class)
})
public class Customer {

    @Id
    @Column(name = "customer_id",length = 45)
    private int customerId;

    @Column(name = "customer_name", length = 100,nullable = false)
    private  String custmerName;

    @Column(name = "customer_address", length = 225)
    private String customerAddress;

    @Type(type = "json")
    @Column(name = "contact_number", columnDefinition = "json")
    private ArrayList contactNumber;

    @Column(name = "nic")
    private String nic;

    @Column(name = "active_state",columnDefinition = "TINYINT default 0")
    private boolean active;

    @Column(name = "customer_salary")
    private String customerSalary;

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

    public Customer(int customerId, String custmerName, String customerAddress, String customerSalary, ArrayList contactNumber, String nic, boolean active) {
        this.customerId = customerId;
        this.custmerName = custmerName;
        this.customerAddress = customerAddress;
        this.customerSalary = customerSalary;
        this.contactNumber = contactNumber;
        this.nic = nic;
        this.active = active;
    }

    public Customer() {
    }



    @Override
    public String toString() {
        return "Customer{" +
                "customerId=" + customerId +
                ", custmerName='" + custmerName + '\'' +
                ", customerAddress='" + customerAddress + '\'' +
                ", customerSalary='" + customerSalary + '\'' +
                ", contactNumber=" + contactNumber +
                ", nic='" + nic + '\'' +
                ", active=" + active +
                '}';
    }



}
