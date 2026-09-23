package com.Iljazia.Subscription.dao;

import com.Iljazia.Subscription.model.Subscription;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SubscriptionRepository extends JpaRepository<Subscription,Long> {


}
