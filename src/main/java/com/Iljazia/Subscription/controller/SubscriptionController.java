package com.Iljazia.Subscription.controller;

import com.Iljazia.Subscription.model.Subscription;
import com.Iljazia.Subscription.service.SubscriptionService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/subscriptions")
public class SubscriptionController {

    private final SubscriptionService subscriptionService;

    public SubscriptionController(SubscriptionService subscriptionService) {
        this.subscriptionService = subscriptionService;
    }

    @GetMapping
    public List<Subscription> getAllSubscriptions() {
        return subscriptionService.getAllSubscriptions();
    }

    @PostMapping
    public Subscription createSubscription(@RequestBody Subscription subscription) {
        return subscriptionService.saveSubscription(subscription);
    }

    @DeleteMapping("/{id}")
    public void deleteSubscription(@PathVariable Long id) {
        subscriptionService.deleteSubscription(id);
    }
}