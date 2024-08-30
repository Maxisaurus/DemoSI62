package pe.edu.upc.demosi62.serviceinterfaces;

import pe.edu.upc.demosi62.entities.Maintenance;

import java.util.List;

public interface IMaintenanceService {

    public List<Maintenance> list();

    public void insert(Maintenance man);
}
