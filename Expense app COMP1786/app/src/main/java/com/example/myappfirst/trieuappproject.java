package com.example.myappfirst;

import android.app.Application;

import java.util.ArrayList;
import java.util.List;

public class trieuappproject extends Application {
    private static List<Listperson> personList = new ArrayList<>();
    public static int nextId;





    public static List<Listperson> getPersonList() {
        return personList;
    }

    public static void setPersonList(List<Listperson> personList) {
        trieuappproject.personList = personList;
    }

    public static int getNextId() {
        return nextId;
    }

    public static void setNextId(int nextId) {
        trieuappproject.nextId = nextId;
    }
}
