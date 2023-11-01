package co.com.mspharmarater.infrastructure.driveradapter.postgres;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;


import javax.persistence.*;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder(toBuilder = true)
@Table(name = "payment_method")
public class Pharma {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id_payment_method")
    private Long id;
    @Column(name = "name")
    private String name;
    @Column(name = "price")
    private float price;
    @Column(name = "image")
    private String image;
    @Column(name = "address")
    private String address;
    @Column(name = "origin")
    private String origin;




}
