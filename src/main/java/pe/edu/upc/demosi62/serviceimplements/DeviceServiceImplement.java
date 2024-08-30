package pe.edu.upc.demosi62.serviceimplements;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.demosi62.entities.Device;
import pe.edu.upc.demosi62.repositories.IDeviceRepository;
import pe.edu.upc.demosi62.serviceinterfaces.IDeviceService;

import java.util.List;

@Service
public class DeviceServiceImplement implements IDeviceService {
    @Autowired
    private IDeviceRepository dR;

    @Override
    public List<Device> list() {
        return dR.findAll();
    }

    @Override
    public void insert(Device dev) {
        dR.save(dev);
    }

    @Override
    public Device listId(int id) {
        return dR.findById(id).orElse(new Device());
    }

    @Override
    public void delete(int id) {
        dR.deleteById(id);
    }

    @Override
    public void update(Device dev) {
        dR.save(dev);
    }

    @Override
    public List<Device> buscar(String nombre) {
        return dR.buscar(nombre);
    }
}
