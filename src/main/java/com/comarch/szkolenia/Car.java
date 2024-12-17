package com.comarch.szkolenia;

import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@ToString
@EqualsAndHashCode
public class Car {
    @Getter
    @Setter
    private int id;
    private String brand;
    private String model;
    private String plate;
    private double price;

    public void setBrand(String brand) {
        this.brand = brand + "ABC";
    }
}
