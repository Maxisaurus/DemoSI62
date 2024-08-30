package pe.edu.upc.demosi62.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import pe.edu.upc.demosi62.entities.Device;

import java.util.List;

@Repository
public interface IDeviceRepository extends JpaRepository<Device, Integer> {
    @Query("Select d from Device d where d.nameDevice like %:nombre")
    public List<Device> buscar(@Param("nombre") String nombre);

}
