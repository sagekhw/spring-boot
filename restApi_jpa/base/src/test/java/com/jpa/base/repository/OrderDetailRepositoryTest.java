package com.jpa.base.repository;

import com.jpa.base.BaseApplicationTests;
import com.jpa.base.entity.OrderDetail;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.time.LocalDateTime;
import java.util.Optional;

public class OrderDetailRepositoryTest extends BaseApplicationTests {

    @Autowired
    private OrderDetailRepository orderDetailRepository;

    @Test
    public void create(){
        OrderDetail orderDetail = OrderDetail.builder()
                .order_at(LocalDateTime.now())
//                .user_id(2L)
//                .item_id(1L)
                .build();

        OrderDetail newOrderDetail = orderDetailRepository.save(orderDetail);
        System.out.println(newOrderDetail);
    }

    @Test
    public void read(){

    }

}
