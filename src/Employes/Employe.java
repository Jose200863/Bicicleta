/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Employes;

import java.time.LocalDate;
import java.time.Period;

/**
 *
 * @author Braya
 */
public abstract class Employe {

    protected String id;
    protected String name;
    protected LocalDate date_of_birth;
    protected String phone;
    protected String nombre;
    protected double salary;

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public LocalDate getDate_of_birth() {
        return date_of_birth;
    }

    public String getPhone() {
        return phone;
    }

    public double getSalary() {
        return salary;
    }

    public void setPhone(String phone) {
        if (validarPhone(phone)) {
            this.phone = phone;
        }
    }

    public void setSalaryo(double salary) {
        if (salary>= 300_000) {
            this.salary= salary;
        }
    }

    public static boolean validarPhone(String telefono) {
        return telefono != null && telefono.matches("\\d{2}-\\d{2}-\\d{2}-\\d{2}");
    }

    public static boolean validarEdad(LocalDate fechaNacimiento) {
        return fechaNacimiento != null &&
        fechaNacimiento.isAfter(LocalDate.now()) &&
        Period.between(fechaNacimiento, LocalDate.now()).getYears() >= 18;
    }
}

