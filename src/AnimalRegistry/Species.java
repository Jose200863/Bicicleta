/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Enum.java to edit this template
 */
package AnimalRegistry;

/**
 *
 * @author Braya
 */
public enum Species {
    LION("Lion"),
    ELEPHANT("Elephant"),
    TIGER("Tiger");
    
    private final String species;

    private Species(String species) {
        this.species = species;
    }

    public String getSpecies() {
        return species;
    }

    @Override
    public String toString() {
        return species;
    }
}
