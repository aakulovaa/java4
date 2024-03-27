package org.collections;

import com.opencsv.CSVParser;
import com.opencsv.CSVParserBuilder;
import com.opencsv.CSVReader;
import com.opencsv.CSVReaderBuilder;

import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

public class ReadFile {
    public static void readDataFromCustomSeparator(String file) {
        try {
            FileReader filereader = new FileReader(file);

            CSVParser parser = new CSVParserBuilder().withSeparator(';').build();

            CSVReader csvReader = new CSVReaderBuilder(filereader)
                    .withCSVParser(parser)
                    .build();


            csvReader.readNext();
            List<String[]> allData = csvReader.readAll();

            List<Employees> list = new ArrayList<>();

            for (String[] row : allData) {
                Employees object = new Employees(row);
                list.add(object);
            }
            for (Employees row : list) {

                System.out.print(STR."\{row.getIdEmployee()}\t\{row.getNameEmployee()}\t\{row.getGenderEmployee()}\t\{row.getBirtDateEmployee()}\t\{row.getDivisionIdEmployee()}\t\{row.getDivisionNameEmployee()}\t\{row.getSalaryEmployee()}\n");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
