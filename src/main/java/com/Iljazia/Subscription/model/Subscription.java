package com.Iljazia.Subscription.model;


import com.Iljazia.Subscription.Enum.BillingCycle;
import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
@Table(name = "sub")
public class Subscription {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;


    private String name;
    private double price;

    @Enumerated(EnumType.STRING)
    private BillingCycle billingCycle;

    private LocalDate startDate;
    private boolean active;

    public Subscription() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public BillingCycle getBillingCycle() {
        return billingCycle;
    }

    public void setBillingCycle(BillingCycle billingCycle) {
        this.billingCycle = billingCycle;
    }

    public LocalDate getStartDate() {
        return startDate;
    }

    public void setStartDate(LocalDate startDate) {
        this.startDate = startDate;
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }
}
