package co.com.mspharmarater.infrastructure.driveradapter.postgres;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface PharmaRepository extends JpaRepository<Pharma, Integer> {


    String SQL_QUERY = "" +
            "select \n" +
            "\tp.id\n" +
            "\t, p.name\n" +
            "\t, p.price\n" +
            "\t, p.image\n" +
            "\t, f.farmacia\n" +
            "\t, f.ciudad\n" +
            "\t, f.nombre\n" +
            "\t, f.direccion\n" +
            "\t, f.ubicacion\n" +
            "\t, f.latitud\n" +
            "\t, f.longitud\n" +
            "from product p\n" +
            "join farmacias f on p.origin = f.farmacia \n" +
            "where p.name ~* :name \n" +
            "and ST_DWithin(f.ubicacion, ST_MakePoint(:longitude, :latitude), :distance)";

    @Query(value = SQL_QUERY, nativeQuery = true)
    List<Pharma> findProductsByNameAndDistance(String name, double longitude, double latitude, int distance);
}
