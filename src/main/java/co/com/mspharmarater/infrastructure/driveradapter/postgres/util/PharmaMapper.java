package co.com.mspharmarater.infrastructure.driveradapter.postgres.util;

import co.com.mspharmarater.domain.model.ResponseMs;
import co.com.mspharmarater.infrastructure.driveradapter.postgres.Pharma;
import co.com.mspharmarater.infrastructure.helper.MapperGeneric;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Component
public class PharmaMapper implements MapperGeneric<Pharma, ResponseMs> {
    @Override
    public Pharma toEntity(ResponseMs model) {
        return Pharma.builder()
                .name(model.getName())
                .price(model.getPrice())
                .image(model.getImage())
                .origin(model.getOrigin())
                .city(model.getCity())
                .nameMarket(model.getNameMarket())
                .address(model.getAddress())
                .location(model.getLocation())
                .build();
    }

    @Override
    public ResponseMs toModel(Pharma entity) {
        return ResponseMs.builder()
                .name(entity.getName())
                .price(entity.getPrice())
                .image(entity.getImage())
                .origin(entity.getOrigin())
                .city(entity.getCity())
                .nameMarket(entity.getNameMarket())
                .address(entity.getAddress())
                .location(entity.getLocation())
                .score(null)
                .longitude(entity.getLongitude())
                .latitude(entity.getLatitude())
                .build();
    }

    public List<ResponseMs> toModelList(List<Pharma> entityList){
        return entityList.stream()
                .map(this::toModel)
                .collect(Collectors.toList());
    }
}
