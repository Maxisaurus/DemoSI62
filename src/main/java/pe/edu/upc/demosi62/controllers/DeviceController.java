package pe.edu.upc.demosi62.controllers;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.demosi62.dtos.DeviceDTO;
import pe.edu.upc.demosi62.entities.Device;
import pe.edu.upc.demosi62.serviceinterfaces.IDeviceService;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/dispositivos")
public class DeviceController {
    @Autowired
    private IDeviceService dS;

    @GetMapping
    public List<DeviceDTO> listar() {

        return dS.list().stream().map(x -> {
            ModelMapper m = new ModelMapper();
            return m.map(x, DeviceDTO.class);
        }).collect(Collectors.toList());
    }

    @PostMapping
    public void insertar(@RequestBody DeviceDTO dto) {
        ModelMapper m = new ModelMapper();
        Device d = m.map(dto, Device.class);
        dS.insert(d);
    }

    @GetMapping("/{id}")  //se le coloca entre llaves porque es un valor cambiante
    public DeviceDTO listarId(@PathVariable("id") Integer id) {
        ModelMapper m = new ModelMapper();
        DeviceDTO dto = m.map(dS.listId(id), DeviceDTO.class);
        return dto;
    }

    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable("id") Integer id) {
        dS.delete(id);
    }

    @PutMapping
    public void modificar(@RequestBody DeviceDTO dto) {
        ModelMapper m=new ModelMapper();
        Device d=m.map(dto, Device.class);
        dS.update(d);
    }

    @GetMapping("/busquedas")
    public List<DeviceDTO> BuscarEjemplo(@RequestParam String n) {

        return dS.buscar(n).stream().map(x -> {
            ModelMapper m = new ModelMapper();
            return m.map(x, DeviceDTO.class);
        }).collect(Collectors.toList());
    }
}
