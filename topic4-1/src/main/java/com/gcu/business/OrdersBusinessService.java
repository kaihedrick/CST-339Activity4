package com.gcu.business;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.gcu.data.DataAccessInterface;
import com.gcu.model.OrderModel;

public class OrdersBusinessService implements OrdersBusinessServiceInterface {
    @Autowired
    private DataAccessInterface<OrderModel> service;

    @Override
    public void test() {
        // TODO Auto-generated method stub
        System.out.println("Hello from the OrdersBusinessService");
    }

    @Override
    public List<OrderModel> getOrders() {
        return service.findAll();
    }

    @Override
    public void init() {
        // TODO Auto-generated method stub
        System.out.println("this is the init method");
    }

    @Override
    public void destroy() {
        // TODO Auto-generated method stub
        System.out.println("This is the destroy method");
    }
}
