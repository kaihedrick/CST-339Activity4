package com.gcu.data;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.gcu.data.entity.OrderEntity;
import com.gcu.data.repository.OrdersRepository;
import java.util.ArrayList;
import java.util.List;


@Service
public class OrdersDataService implements DataAccessInterface<OrderEntity> {
    private OrdersRepository ordersRepository;
    @Autowired  // Add this annotation
    public OrdersDataService(OrdersRepository ordersRepository) {
        this.ordersRepository = ordersRepository;
    }
    public OrderEntity findById(int id)
    {
        return null;
    }

    public List<OrderEntity> findAll() {
        List<OrderEntity> orders = new ArrayList<OrderEntity>();
        try{
            //get all the entity orders
            Iterable<OrderEntity> ordersIterable = ordersRepository.findAll();
            //convert to a list and return the list
            orders = new ArrayList<OrderEntity>();
            ordersIterable.forEach(orders::add);
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
        //return the list
        return orders;
    }


    public boolean create(OrderEntity order) {
        try{
            this.ordersRepository.save(order);
        }
        catch(Exception e)
        {
            e.printStackTrace();
            return false;
        }
        return true;
    }


    public boolean update(OrderEntity t) {
        return true;
    }


    public boolean delete(OrderEntity t) {
        return true;
    }


}
