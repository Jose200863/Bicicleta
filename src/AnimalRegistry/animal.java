/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package AnimalRegistry;

import java.time.LocalDate;

/**
 *
 * @author Braya
 */
public class animal {
    private String id;
    private boolean idValido;
    private String name;
    private Species species;
    private LocalDate date_of_birth;
    private boolean valid_date;
    private Zone zone;

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Species getSpecies() {
        return species;
    }

    public LocalDate getDate_of_birth() {
        return date_of_birth;
    }

    public Zone getZone() {
        return zone;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setZone(Zone zone) {
        this.zone = zone;
    }

    public animal(String id, String name, Species species, LocalDate date_of_birth) {
        if (validarId(id)) {
            this.id = id;
            this.idValido = true;
        } else {
            this.id = null;
            this.idValido = false;
        }
        this.name = name;
        this.species = species;
        if (validar_date_of_birth(date_of_birth)) {
            this.date_of_birth = date_of_birth;
            this.valid_date = true;
        } else {
            this.date_of_birth = null; 
            this.valid_date = false;
        }
        this.zone = zone.CONSERVATIO_AND_RESCUE;
    }

    @Override
    public String toString() {
        return "animal " + "id: " + id + " name: " + name + " species: " + species + " date_of_birth: " + date_of_birth + " zone: " + zone;
    }
    
    public static boolean validarId(String id) {
        return id != null && id.matches("[A-Z]-\\d{4}");
    }
    
    public static boolean validar_date_of_birth(LocalDate date_of_birth) {
        return !date_of_birth.isAfter(LocalDate.now());
    }
    
}
