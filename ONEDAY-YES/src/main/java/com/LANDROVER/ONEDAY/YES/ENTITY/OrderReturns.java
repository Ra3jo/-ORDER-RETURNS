package com.LANDROVER.ONEDAY.YES.ENTITY;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "order")
public class OrderReturns {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long Id;
    @Column(name="OrderName")
    private String OrderName;
    @Column(name="Location")
    private String Location;
    @Column(name = "Date")
    private LocalDate Date;

}
