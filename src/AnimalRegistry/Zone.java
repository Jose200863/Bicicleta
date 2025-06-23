/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Enum.java to edit this template
 */
package AnimalRegistry;

/**
 *
 * @author Braya
 */
public enum Zone {
    FARM("Farm"),
    CONTACT("Contact"),
    FEEDING("Feeding"),
    CONSERVATIO_AND_RESCUE("Conservation and rescue"),
    NIGHT_TUNEL("Night tunel"),
    LOCAL_BIODIVERSITY("Local biodiversity");
    
    private final String Zone;

    Zone(String Zone) {
        this.Zone = Zone;
    }

    public String getZone() {
        return Zone;
    }

    @Override
    public String toString() {
        return Zone;
    } 
}
