// Farkas Csaba
// 2023-002-19
// SZOFT II/N
// Dolgozat IV
package views;

import java.util.ArrayList;

import models.Ingatlan;

public class MainConsole {

    public MainConsole() {
    }

    public void printEmployees(ArrayList<Ingatlan> emps) {
        for (Ingatlan emp : emps) {
            System.out.println(emp.getName());
        }
    }
}
