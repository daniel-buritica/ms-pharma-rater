package co.com.mspharmarater.infrastructure.driveradapter.postgres;

import co.com.mspharmarater.domain.model.ResponseMs;
import co.com.mspharmarater.domain.model.gateway.PharmaModelRepository;
import co.com.mspharmarater.infrastructure.driveradapter.postgres.util.PharmaMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.sql.SQLException;
import java.util.List;
import java.util.stream.Collectors;

@Component
@RequiredArgsConstructor
public class PharmaImpl implements PharmaModelRepository {

    private final PharmaRepository pharmaRepository;
    private final PharmaMapper pharmaMapper;


    @Override
    public List<ResponseMs> searchProducts(String name, String longitude, String latitude, int distance) {

        return pharmaRepository
                .findProductsByNameAndDistance(name, longitude, latitude, distance)
                .stream()
                .map(pharmaMapper::toModel)
                .collect(Collectors.toList());
    }
}
