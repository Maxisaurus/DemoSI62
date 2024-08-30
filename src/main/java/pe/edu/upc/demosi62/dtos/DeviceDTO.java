package pe.edu.upc.demosi62.dtos;

import java.time.LocalDate;

public class DeviceDTO {
    private int idDevice;
    private String nameDevice;
    private String brandDevice;
    private LocalDate purchaseDateDevice;

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
