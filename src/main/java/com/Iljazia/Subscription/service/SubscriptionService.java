package com.Iljazia.Subscription.service;

import com.Iljazia.Subscription.dao.SubscriptionRepository;
import com.Iljazia.Subscription.model.Subscription;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class SubscriptionService {

    private final SubscriptionRepository subscriptionRepository;

    public SubscriptionService(SubscriptionRepository subscriptionRepository) {
        this.subscriptionRepository = subscriptionRepository;
    }

    public List<Subscription> getAllSubscriptions() {
        return subscriptionRepository.findAll();
    }

    public Optional<Subscription> getSubscriptionById(Long id) {
        return subscriptionRepository.findById(id);
    }

    public Subscription saveSubscription(Subscription subscription) {
        if (subscription.getPrice() < 0) {
            throw new IllegalArgumentException("Der Preis kann nicht negativ sein!");
        }
        return subscriptionRepository.save(subscription);
    }

    public void deleteSubscription(Long id) {
        subscriptionRepository.deleteById(id);
    }
}