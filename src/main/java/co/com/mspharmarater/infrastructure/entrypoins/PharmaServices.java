package co.com.mspharmarater.infrastructure.entrypoins;

import co.com.mspharmarater.domain.model.ResponseMs;
import co.com.mspharmarater.domain.usecase.PharmaUseCase;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping(value = "/api/v1/pharma")
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class PharmaServices {


    private final PharmaUseCase pharmaUseCase;
    @GetMapping("/health")
    public ResponseEntity<ResponseMs> healthCheck(){
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @GetMapping("")
    public ResponseEntity<List<ResponseMs>> getProducts(@RequestParam(name = "name") String name,
                                                       @RequestParam(name = "longitude") double longitude,
                                                       @RequestParam(name = "latitude") double latitude,
                                                       @RequestParam(name = "distance") int distance){
        var data = pharmaUseCase.searchProducts(name, longitude, latitude, distance);
        return new ResponseEntity<>(data, HttpStatus.OK);
    }

}
