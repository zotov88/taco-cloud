package com.example.tacocloud.repository;

import com.example.tacocloud.models.TacoOrder;

public interface OrderRepository {
    TacoOrder save(TacoOrder order);
}