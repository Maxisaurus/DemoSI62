package pe.edu.upc.demosi62.dtos;

import pe.edu.upc.demosi62.entities.Device;

import java.time.LocalDate;

public class MaintenanceDTO {

    private int idMaintenance;

    private LocalDate dateMaintenance;

    private double priceMaintenance;

    private String descriptionMaintenance;

    private Device dev;


    public int getIdMaintenance() {
        return idMaintenance;
    }

    public void setIdMaintenance(int idMaintenance) {
        this.idMaintenance = idMaintenance;
    }

    public LocalDate getDateMaintenance() {
        return dateMaintenance;
    }

    public void setDateMaintenance(LocalDate dateMaintenance) {
        this.dateMaintenance = dateMaintenance;
    }

    public double getPriceMaintenance() {
        return priceMaintenance;
    }

    public void setPriceMaintenance(double priceMaintenance) {
        this.priceMaintenance = priceMaintenance;
    }

    public String getDescriptionMaintenance() {
        return descriptionMaintenance;
    }

    public void setDescriptionMaintenance(String descriptionMaintenance) {
        this.descriptionMaintenance = descriptionMaintenance;
    }

    public Device getDev() {
        return dev;
    }

    public void setDev(Device dev) {
        this.dev = dev;
    }
}
