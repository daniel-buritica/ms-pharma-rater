package co.com.mspharmarater.domain.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class ResponseMs {

    private String name;
    private float distance;
    private float price;
    private float latitude;
    private float longitude;
    private String market;
    private String address;
    private String score;
}
