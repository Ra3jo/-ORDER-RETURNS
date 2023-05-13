package com.LANDROVER.ONEDAY.YES.CONTROLLER;

import com.LANDROVER.ONEDAY.YES.ENTITY.OrderReturns;
import com.LANDROVER.ONEDAY.YES.SERVICE.OrderSERVICE;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/api/v1/Order")
public class OrderCONTROLLER {
    private OrderSERVICE orderSERVICE;

    // OrderReturns POST REST API
    @PostMapping
    public ResponseEntity<OrderReturns> createOrderReturns(@RequestBody OrderReturns orderReturns) {
        OrderReturns savedOrderReturns = orderSERVICE.createOrderReturns(orderReturns);
        return new ResponseEntity<>(savedOrderReturns, HttpStatus.CREATED);
    }

    // OrderReturns By Id REST API
    @GetMapping("/{id}")
    public ResponseEntity<OrderReturns> getOrderReturnsById(@PathVariable("/id") Long orderReturnsId) {
        OrderReturns orderReturns = orderSERVICE.getOrderReturnsById(orderReturnsId);
        return new ResponseEntity<>(orderReturns, HttpStatus.OK);
    }
    //Updated ORDERRETURNS GET ALL REST API
    @GetMapping
    public ResponseEntity<List<OrderReturns>>getAllOrderReturns() {
        List<OrderReturns> orderReturns =orderSERVICE.getAllOrderReturns();
        return new ResponseEntity<>(orderReturns,HttpStatus.OK);
    }
    // Updated Get ALL  API
    @PutMapping
    public  ResponseEntity<OrderReturns>updatedOrderReturns(@PathVariable("/id") Long orderReturnsId,@RequestBody OrderReturns orderReturns){
        orderReturns.setId(orderReturnsId);
       OrderReturns updatedOrderReturns=orderSERVICE.updateOrderReturns(orderReturns);
       return new ResponseEntity<>(updatedOrderReturns,HttpStatus.OK);
    }
    public  ResponseEntity<String>deleteOrderReturns(@PathVariable("/id")Long orderId){
        orderSERVICE.deleteOrderReturns(orderId);
        return new ResponseEntity<>("OederReturns Deleted Succefully!",HttpStatus.OK);
    }
}

