package com.springboot1.domain;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "address")
public class Address {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private Integer id;

    @Column(name = "address_lane_1" , length = 40 , nullable = false)
    private String address_lane_1;

    @Column(name = "address_lane_2" , length = 40 , nullable = false)
    private String address_lane_2;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "city_id" , referencedColumnName = "id")
   private City city;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "state_id" , referencedColumnName = "id")
    private State state;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "country_id" , referencedColumnName = "id")
    private Country country;


    public void setId(Integer id) {
        this.id = id;
    }

    public void setAddress_lane_1(String address_lane_1) {
        this.address_lane_1 = address_lane_1;
    }

    public void setAddress_lane_2(String address_lane_2) {
        this.address_lane_2 = address_lane_2;
    }


    public void setCity(City city) {
        this.city = city;
    }

    public void setState(State state) {
        this.state = state;
    }

    public void setCountry(Country country) {
        this.country = country;
    }

    public Integer getId() {
        return id;
    }

    public String getAddress_lane_1() {
        return address_lane_1;
    }

    public String getAddress_lane_2() {
        return address_lane_2;
    }

   public City getCity() {
        return city;
    }

    public State getState() {
        return state;
    }

    public Country getCountry() {
        return country;
    }
}
