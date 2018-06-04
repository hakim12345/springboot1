package com.springboot1.domain;

import org.codehaus.jackson.annotate.JsonIgnoreProperties;
import org.springframework.context.annotation.Lazy;

import javax.persistence.*;

@Entity
@Table(name = "employee")
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private Integer id;

    @Column(name = "NAME" , nullable = false , length = 40)
    private String name;

    @OneToOne(cascade = CascadeType.ALL ,  fetch = FetchType.LAZY)
    @JoinColumn(name = "address_id" , referencedColumnName = "id")
    private Address address;

    public Employee() {
        super();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }
}
