package co.com.mspharmarater.infrastructure.driveradapter.postgres;

import org.springframework.data.jpa.repository.JpaRepository;

public interface PharmaRepository extends JpaRepository<Pharma, Integer> {
}
