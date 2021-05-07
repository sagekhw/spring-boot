package com.jpa.base.entity;


import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.*;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.List;

@Entity
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "user")
public class User {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @Column(name = "id")
    public Long id;

    public String account;

    public String password;

    public String status;

    public String email;

    public String phone_number;

    public LocalDateTime registered_at;

    public LocalDateTime unregistered_at;

    public LocalDateTime created_at;

    public String created_by;

    public LocalDateTime updated_at;

    public String updated_by;

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "user")
    @JsonIgnore
    private List<OrderDetail> orderDetailList;


}
