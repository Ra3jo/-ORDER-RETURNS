package com.LANDROVER.ONEDAY.YES.SERVICE;

import com.LANDROVER.ONEDAY.YES.ENTITY.OrderReturns;

import java.util.List;

public interface OrderSERVICE {
    OrderReturns createOrderReturns(OrderReturns orderReturns);
    OrderReturns getOrderReturnsById(Long orderReturnsId);
    List<OrderReturns>getAllOrderReturns();
    OrderReturns updateOrderReturns(OrderReturns orderReturns);
    void deleteOrderReturns(Long orderReturnsId);
}
