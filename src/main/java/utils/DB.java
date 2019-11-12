package utils;

import com.opencsv.CSVReader;
import com.opencsv.CSVWriter;
import com.opencsv.exceptions.CsvException;
import exceptions.DbException;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

/**
 *
 * @author Alexander Ferenets (Istamendil) <ist.kazan@gmail.com>
 */
public class DB {


    private final static String path = "users.csv";


    public static void addEntry(String db, String[] data) throws DbException {

        try {
            File f = new File("/home/tanya/IdeaProjects/bomba/users.csv");
            FileWriter writer = new FileWriter(f,true);

            writer.write(data[0]+","+data[1]+","+data[2]+","+data[3]+","+data[4]+","+data[5]+","+data[6]);
            writer.flush();
            writer.close();
        } catch (IOException ex) {
            throw new DbException();
        }
    }

    public static List<String[]> getAllEntries(String db) throws DbException {
        try {
            CSVReader reader = new CSVReader(new FileReader(path));
            return reader.readAll();
        } catch (IOException | CsvException ex) {
            throw new DbException();
        }
    }

}