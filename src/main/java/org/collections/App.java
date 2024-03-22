package org.collections;

import com.opencsv.CSVParser;
import com.opencsv.CSVParserBuilder;
import com.opencsv.CSVReader;
import com.opencsv.CSVReaderBuilder;
import com.opencsv.exceptions.CsvValidationException;

import java.io.*;
import java.util.List;



public class App
{
    public static void readDataFromCustomSeparator(String file){
        try {
            FileReader filereader = new FileReader(file);
            CSVParser parser = new CSVParserBuilder().withSeparator(';').build();

            CSVReader csvReader = new CSVReaderBuilder(filereader)
                    .withCSVParser(parser)
                    .build();

            //List<String> data = List.of(csvReader.readNext());
            List<String> data2 = List.of(csvReader.readNext());
            System.out.println(data2);

//            for (String[] row : allData) {
//                for (String cell : row) {
//                    System.out.print(cell + "\t");
//                }
//                System.out.println();
//            }
        } catch (CsvValidationException | IOException e) {
            throw new RuntimeException(e);
        }


    }

    public static void main( String[] args )
    {
        readDataFromCustomSeparator("/Users/annakulova/IdeaProjects/collections/src/main/resources/foreign_names.csv");
    }
}
