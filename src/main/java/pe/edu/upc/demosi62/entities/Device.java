package pe.edu.upc.demosi62.entities;

import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
@Table(name = "Device")
public class Device {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idDevice;

    @Column(name = "nameDevice", nullable = false, length = 40)
    private String nameDevice;

    @Column(name = "brandDevice", nullable = false, length = 35)
    private String brandDevice;

    @Column(name = "purchaseDateDevice", nullable = false)
    private LocalDate purchaseDateDevice;

    public Device() {
    }

    public Device(int idDevice, String nameDevice, String brandDevice, LocalDate purchaseDateDevice) {
        this.idDevice = idDevice;
        this.nameDevice = nameDevice;
        this.brandDevice = brandDevice;
        this.purchaseDateDevice = purchaseDateDevice;
    }

    public int getIdDevice() {
        return idDevice;
    }

    public void setIdDevice(int idDevice) {
        this.idDevice = idDevice;
    }

    public String getNameDevice() {
        return nameDevice;
    }

    public void setNameDevice(String nameDevice) {
        this.nameDevice = nameDevice;
    }

    public String getBrandDevice() {
        return brandDevice;
    }

    public void setBrandDevice(String brandDevice) {
        this.brandDevice = brandDevice;
    }

    public LocalDate getPurchaseDateDevice() {
        return purchaseDateDevice;
    }

    public void setPurchaseDateDevice(LocalDate purchaseDateDevice) {
        this.purchaseDateDevice = purchaseDateDevice;
    }
}
