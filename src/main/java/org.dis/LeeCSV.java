// lectura del fichero csv mediante el objeto plano y su carga en una lista de objetos de este tipo
package org.dis;

import com.opencsv.bean.CsvToBean;
import com.opencsv.bean.CsvToBeanBuilder;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.List;

// Otros imports ...

public class LeeCSV {
    public static List<golfPlayer> parseaCSV(String path) {
        try {
            BufferedReader lectorFichero = new BufferedReader(new FileReader(path));
            CsvToBean csvToBean = new CsvToBeanBuilder(lectorFichero).withType(golfPlayer.class).withIgnoreLeadingWhiteSpace(true).build();

            List<golfPlayer> players = csvToBean.parse();
            return players;
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            return null;
        }
    }
}
