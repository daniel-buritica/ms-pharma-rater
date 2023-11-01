package co.com.mspharmarater.domain.model.gateway;



import co.com.mspharmarater.domain.model.ResponseMs;

import java.util.List;

public interface PharmaModelRepository {

    List<ResponseMs> searchProducts(String name, String longitude, String latitude, int distance);

}
