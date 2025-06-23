/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Main;

import AnimalRegistry.Species;
import AnimalRegistry.animal;
import java.time.LocalDate;

/**
 *
 * @author Braya
 */
public class Main {
    public static void main(String[] args) {
        animal A1 = new animal("L-0001", "Simba", Species.TIGER, LocalDate.of(2025, 5, 12));
        System.out.println(A1);
    }
    
}
