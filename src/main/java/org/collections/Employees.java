package org.collections;

import com.opencsv.bean.CsvBindByName;
import com.opencsv.bean.CsvDate;

import java.util.Date;

public class Employees {
    @CsvBindByName(column = "id", required = true)
    private Integer idEmployee;
    @CsvBindByName(column = "name", required = true)
    private String nameEmployee;
    @CsvBindByName(column = "gender", required = true)
    private String genderEmployee;
    @CsvBindByName(column = "BirtDate", required = true)
    @CsvDate("dd.MM.yyyy")
    private Date BirtDateEmployee;
    @CsvBindByName(column = "Division", required = true)
    private Division divisionEmployee;
    @CsvBindByName(column = "Salary", required = true)
    private Integer salaryEmployee;
}
