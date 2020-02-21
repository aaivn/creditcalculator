package alexander.ivanov.creditcalculator.backend.repository;

import alexander.ivanov.creditcalculator.backend.model.Credit;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CreditRepository extends JpaRepository<Credit, Long> {

}
