package org.collections;

import com.opencsv.CSVParser;
import com.opencsv.CSVParserBuilder;
import com.opencsv.CSVReader;
import com.opencsv.CSVReaderBuilder;


import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
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


            List<String> data = List.of(csvReader.readNext());
            List<String[]> allData = csvReader.readAll();

            List<Employees> list = new ArrayList<Employees>();

            for (String[] row : allData) {
                Employees object = new Employees(row);
                list.add(object);
            }
            for (Employees row : list) {
                    System.out.print(STR."\{row.getIdEmployee()}\t\{row.getNameEmployee()}\t\{row.getGenderEmployee()}\t\{row.getBirtDateEmployee()}\t\{row.getDivisionEmployee()}\t\{row.getSalaryEmployee()}\n");
            }
        }
        catch (Exception e) {
            e.printStackTrace();
        }

    }

    public static void main( String[] args )
    {
        readDataFromCustomSeparator("/Users/annakulova/IdeaProjects/collections/src/main/resources/foreign_names.csv");
    }
}
