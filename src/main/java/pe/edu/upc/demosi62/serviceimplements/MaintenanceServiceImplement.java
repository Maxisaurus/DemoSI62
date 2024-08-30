package pe.edu.upc.demosi62.serviceimplements;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.demosi62.entities.Maintenance;
import pe.edu.upc.demosi62.repositories.IMaintenanceRepository;
import pe.edu.upc.demosi62.serviceinterfaces.IMaintenanceService;

import java.util.List;
@Service
public class MaintenanceServiceImplement implements IMaintenanceService {

    @Autowired
    private IMaintenanceRepository mR;

    @Override
    public List<Maintenance> list() {
        return mR.findAll();
    }

    @Override
    public void insert(Maintenance man) {
        mR.save(man);
    }
}
