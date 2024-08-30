package pe.edu.upc.demosi62.serviceinterfaces;

import org.springframework.data.repository.query.Param;
import pe.edu.upc.demosi62.entities.Device;

import java.util.List;

public interface IDeviceService {

    public List<Device> list();

    public void insert(Device dev);

    public Device listId(int id);

    public void delete(int id);

    public void update(Device dev);

    public List<Device>buscar(String nombre);

}
