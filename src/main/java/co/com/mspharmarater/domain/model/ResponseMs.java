package co.com.mspharmarater.domain.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ResponseMs {

    private String name;
    private float price;
    private String image;
    private String origin;
    private String city;
    private String nameMarket;
    private String address;
    private String location;
    private String score;
    private String longitude;
    private String latitude;




}
