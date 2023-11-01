package co.com.mspharmarater.domain.usecase;

import co.com.mspharmarater.domain.model.ResponseMs;
import co.com.mspharmarater.domain.model.gateway.PharmaModelRepository;
import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@AllArgsConstructor
public class PharmaUseCase  {

     final PharmaModelRepository pharmaModelRepository;

    public List<ResponseMs> searchProducts(String name, String longitude, String latitude, int distance){
        return pharmaModelRepository.searchProducts(name, longitude, latitude, distance);
    }

}
