package org.example;

import org.example.DataEntry.DataEntryClass;
import org.example.Sourcing.Loan;
import org.example.Sourcing.SourcingData;

import java.util.ArrayList;

public interface Customer {


    SourcingData getPersonal();



    void setId(int id);

    Loan getLoan();

    int getId();

    void setIncome(float nextFloat);

    void setAssets(float nextFloat);

    void setLiability(float nextFloat);

    void setEducation(String next);

    float actualIncome();


    void setRemarks(String remarks);

    String getEducation();

    int getStatus();

    public ArrayList<Customer> getFraudCustomers();

    public void setStatus(int status);
}