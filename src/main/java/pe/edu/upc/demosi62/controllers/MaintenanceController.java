package pe.edu.upc.demosi62.controllers;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.demosi62.dtos.DeviceDTO;
import pe.edu.upc.demosi62.dtos.MaintenanceDTO;
import pe.edu.upc.demosi62.entities.Device;
import pe.edu.upc.demosi62.entities.Maintenance;
import pe.edu.upc.demosi62.serviceinterfaces.IMaintenanceService;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/mantenimiento")
public class MaintenanceController {

    @Autowired
    private IMaintenanceService mS;

    @PostMapping
    public void insertar(@RequestBody MaintenanceDTO dto)
    {
        ModelMapper m = new ModelMapper();
        Maintenance mn = m.map(dto, Maintenance.class);
        mS.insert(mn);
    }

    @GetMapping
    public List<MaintenanceDTO> listar() {

        return mS.list().stream().map(x -> {
            ModelMapper m = new ModelMapper();
            return m.map(x, MaintenanceDTO.class);
        }).collect(Collectors.toList());
    }
}
