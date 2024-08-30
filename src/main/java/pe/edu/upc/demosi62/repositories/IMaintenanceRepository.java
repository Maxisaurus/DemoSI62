package pe.edu.upc.demosi62.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pe.edu.upc.demosi62.entities.Maintenance;

@Repository
public interface IMaintenanceRepository extends JpaRepository<Maintenance, Integer> {
}
