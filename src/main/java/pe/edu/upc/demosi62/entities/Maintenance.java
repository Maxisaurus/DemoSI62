package pe.edu.upc.demosi62.entities;

import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
@Table(name = "Maintenance")
public class Maintenance {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idMaintenance;

    @Column(name = "dateMaintenance", nullable = false)
    private LocalDate dateMaintenance;

    @Column(name = "priceMaintenance", nullable = false)
    private double priceMaintenance;

    @Column(name = "descriptionMaintenance", nullable = false, length = 400)
    private String descriptionMaintenance;

    @ManyToOne
    @JoinColumn(name = "idDevice")
    private Device dev; //viene de la tabla device y tiene el campo en comun

    public Maintenance() {
    } //inicializa el objeto

    public Maintenance(int idMaintenance, LocalDate dateMaintenance, double priceMaintenance, String descriptionMaintenance, Device dev) {
        this.idMaintenance = idMaintenance;
        this.dateMaintenance = dateMaintenance;
        this.priceMaintenance = priceMaintenance;
        this.descriptionMaintenance = descriptionMaintenance;
        this.dev = dev;
        //inicializa los atributos
    }

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
