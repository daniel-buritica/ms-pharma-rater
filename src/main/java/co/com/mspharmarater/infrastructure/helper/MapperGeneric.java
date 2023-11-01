package co.com.mspharmarater.infrastructure.helper;

public interface MapperGeneric <E, M>{
    E toEntity(M model);
    M toModel(E entity);
}
