package com.jpa.base.service;

import com.jpa.base.entity.OrderDetail;
import com.jpa.base.entity.User;
import com.jpa.base.repository.OrderDetailRepository;
import com.jpa.base.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
public class OrderDetailService {
    @Autowired
    private OrderDetailRepository orderDetailRepository;

    @Transactional
    public List<OrderDetail> readAllOrderDetail(){
        return orderDetailRepository.findAll();
    }
}
