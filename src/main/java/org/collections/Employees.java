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
    private String birtDateEmployee;

    @CsvBindByName(column = "Division", required = true)
    private String divisionEmployee;
    @CsvBindByName(column = "Salary", required = true)
    private Integer salaryEmployee;

    /**
     * Конструктор для заполнения элементов класса
     * @param line - строка из считываемого файла
     */
    public Employees(String[] line) {

        idEmployee=Integer.valueOf(line[0]);
        nameEmployee=line[1];
        genderEmployee = line[2];
        birtDateEmployee= line[3];
        divisionEmployee= line[4];
        salaryEmployee=Integer.valueOf(line[5]);

    }

    /**
     * Метод получения значения поля idEmployee
     * @return - возвращает значение поля idEmployee
     */
    public Integer getIdEmployee() {
        return idEmployee;
    }

    /**
     * Метод записи значения в поле
     * @param idEmployee - то, куда записывается значение
     */
    public void setIdEmployee(Integer idEmployee) {
        this.idEmployee = idEmployee;
    }

    /**
     * Метод получения значения поля nameEmployee
     * @return - возвращает значение поля nameEmployee
     */
    public String getNameEmployee() {
        return nameEmployee;
    }

    /**
     * Метод записи значения в поле
     * @param nameEmployee - то, куда записывается значение
     */
    public void setNameEmployee(String nameEmployee) {
        this.nameEmployee = nameEmployee;
    }

    /**
     * Метод получения значения поля genderEmployee
     * @return - возвращает значение поля genderEmployee
     */
    public String getGenderEmployee() {
        return genderEmployee;
    }

    /**
     * Метод записи значения в поле
     * @param genderEmployee - то, куда записывается значение
     */
    public void setGenderEmployee(String genderEmployee) {
        this.genderEmployee = genderEmployee;
    }

    /**
     * Метод получения значения поля birtDateEmployee
     * @return - возвращает значение поля birtDateEmployee
     */
    public String getBirtDateEmployee() {
        return birtDateEmployee;
    }

    /**
     * Метод записи значения в поле
     * @param birtDateEmployee - то, куда записывается значение
     */
    public void setBirtDateEmployee(String birtDateEmployee) {
        this.birtDateEmployee = birtDateEmployee;
    }

    /**
     * Метод получения значения поля divisionEmployee
     * @return - возвращает значение поля divisionEmployee
     */
    public String getDivisionEmployee() {
        return divisionEmployee;
    }

    /**
     * Метод записи значения в поле
     * @param divisionEmployee - то, куда записывается значение
     */
    public void setDivisionEmployee(String divisionEmployee) {
        this.divisionEmployee = divisionEmployee;
    }

    /**
     * Метод получения значения поля salaryEmployee
     * @return - возвращает значение поля salaryEmployee
     */
    public Integer getSalaryEmployee() {
        return salaryEmployee;
    }

    /**
     * Метод записи значения в поле
     * @param salaryEmployee - то, куда записывается значение
     */
    public void setSalaryEmployee(Integer salaryEmployee) {
        this.salaryEmployee = salaryEmployee;
    }
}
