// Farkas Csaba
// 2023-002-19
// SZOFT II/N
// Dolgozat IV
package controllers;

import java.util.ArrayList;
import java.util.Arrays;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import models.Ingatlan;
import models.Restapi;
import views.MainConsole;

public class MainController {
    MainConsole mainConsole;

    public MainController() {
        this.mainConsole = new MainConsole();
        this.showEmp();
    }

    private void showEmp() {
        Restapi restapi = new Restapi();
        String res = restapi.getIngatlan();
        ArrayList<Ingatlan> empList = convertStringToArray(res);
        this.mainConsole.printEmployees(empList);
    }

    private ArrayList<Ingatlan> convertStringToArray(String text) {
        ArrayList<Ingatlan> empList = null;
        GsonBuilder builder = new GsonBuilder();
        Gson gson = builder.create();
        Ingatlan[] empArray = gson.fromJson(text, Ingatlan[].class);
        empList = new ArrayList<>(Arrays.asList(empArray));
        return empList;
    }
}
