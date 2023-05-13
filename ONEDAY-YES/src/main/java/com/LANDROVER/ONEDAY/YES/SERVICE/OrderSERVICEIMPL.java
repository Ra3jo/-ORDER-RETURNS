package com.LANDROVER.ONEDAY.YES.SERVICE;

import com.LANDROVER.ONEDAY.YES.ENTITY.OrderReturns;
import com.LANDROVER.ONEDAY.YES.REPOSITORY.OrderREPOSITORY;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@AllArgsConstructor
public class OrderSERVICEIMPL implements OrderSERVICE{
    private OrderREPOSITORY  orderREPOSITORY;
    @Override
    public OrderReturns createOrderReturns(OrderReturns orderReturns) {
        return orderREPOSITORY.save(orderReturns);
    }

    @Override
    public OrderReturns getOrderReturnsById(Long orderReturnsId) {
        Optional<OrderReturns>optionalOrderReturns=orderREPOSITORY.findById(orderReturnsId);
        return optionalOrderReturns.get();
    }

    @Override
    public List<OrderReturns> getAllOrderReturns() {
        return orderREPOSITORY.findAll();
    }

    @Override
    public OrderReturns updateOrderReturns(OrderReturns orderReturns) {
        OrderReturns existingOrderReturns=orderREPOSITORY.findById(orderReturns.getId()).get();
        existingOrderReturns.setOrderName(orderReturns.getOrderName());
        existingOrderReturns.setDate(orderReturns.getDate());
        existingOrderReturns.setLocation(orderReturns.getLocation());
        OrderReturns updatedOrderReturns=orderREPOSITORY.save(existingOrderReturns);
        return updatedOrderReturns;
    }

    @Override
    public void deleteOrderReturns(Long orderReturnsId) {
     orderREPOSITORY.deleteById(orderReturnsId);

    }
}
