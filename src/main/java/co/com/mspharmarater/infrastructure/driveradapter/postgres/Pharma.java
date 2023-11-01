package co.com.mspharmarater.infrastructure.driveradapter.postgres;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


import javax.persistence.*;

@Entity
@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Pharma {

    @Id
    @Column(name = "id")
    private Long id;
    @Column(name = "name")
    private String name;
    @Column(name = "price")
    private float price;
    @Column(name = "image")
    private String image;
    @Column(name = "farmacia")
    private String origin;
    @Column(name = "ciudad")
    private String city;
    @Column(name = "nombre")
    private String nameMarket;
    @Column(name = "direccion")
    private String address;
    @Column(name = "ubicacion")
    private String location;
    @Column(name = "latitud")
    private String latitude;
    @Column(name = "longitud")
    private String longitude;

}
