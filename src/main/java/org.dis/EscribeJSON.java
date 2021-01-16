//Fichero para mostrar por consola el JSON generado a partir del CSV y almacenarlo en el fichero best-golf-players.json
package org.dis;


import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class EscribeJSON {

    public static void main(String[] args) {
        String json = new Gson().toJson(LeeCSV.parseaCSV("best-golf-players.csv"));
        System.out.println(json);
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter("jugadoresJson.json"));
            writer.write(json);
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    
 }
