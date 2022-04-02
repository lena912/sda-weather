package com.sda.weather;


import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@NoArgsConstructor
@Entity
@Table(name = "location")
public class Location {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String region;
    private String country;
    private Double longitude;
    private Double latitude;

    public Location(String name, String region, String country, Double longitude, Double latitude) {
        this.name = name;
        this.region = region;
        this.country = country;
        this.longitude = longitude;
        this.latitude = latitude;
    }
}
