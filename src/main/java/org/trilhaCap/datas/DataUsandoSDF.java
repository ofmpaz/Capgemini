package org.trilhaCap.datas;

import java.text.SimpleDateFormat;
import java.util.TimeZone;

public class DataUsandoSDF {

    public static void main(String[] args) {

        SimpleDateFormat formato1 = new SimpleDateFormat("dd/MM/yyyy");
        SimpleDateFormat formato2 = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        SimpleDateFormat formato3 = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");

        formato3.setTimeZone(TimeZone.getTimeZone("GMT"));

    }
}
