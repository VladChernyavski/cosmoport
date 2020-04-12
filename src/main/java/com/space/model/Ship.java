package com.space.model;

import org.hibernate.annotations.Type;

import javax.persistence.*;
import java.sql.Date;
import java.util.Objects;

@Entity
public class Ship {

    public Ship() {
    }

    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private Long id;


    @Column(unique = true, nullable = false, length = 50)
    private String name;


    @Column(nullable = false, length = 50)
    private String planet;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private ShipType shipType;

    @Column(nullable = false)
    private Date prodDate;

    private Boolean isUsed;

    private Double speed;

    private Integer crewSize;

    private Double rating;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPlanet() {
        return planet;
    }

    public void setPlanet(String planet) {
        this.planet = planet;
    }

    public ShipType getShipType() {
        return shipType;
    }

    public void setShipType(ShipType shipType) {
        this.shipType = shipType;
    }

    public Date getProdDate() {
        return prodDate;
    }

    public void setProdDate(Date prodDate) {
        this.prodDate = prodDate;
    }

    public Boolean getUsed() {
        return isUsed;
    }

    public void setUsed(Boolean used) {
        isUsed = used;
    }

    public Double getSpeed() {
        return speed;
    }

    public void setSpeed(Double speed) {
        this.speed = speed;
    }

    public Integer getCrewSize() {
        return crewSize;
    }

    public void setCrewSize(Integer crewSize) {
        this.crewSize = crewSize;
    }

    public Double getRating() {
        return rating;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    public void setRating(Double rating) {
        this.rating = rating;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Ship ship = (Ship) o;
        return name.equals(ship.name) &&
                planet.equals(ship.planet) &&
                shipType == ship.shipType &&
                prodDate.equals(ship.prodDate) &&
                Objects.equals(isUsed, ship.isUsed) &&
                crewSize.equals(ship.crewSize);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, planet, shipType, prodDate, isUsed, crewSize);
    }
}
