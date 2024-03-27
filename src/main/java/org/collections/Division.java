package org.collections;

public class Division {
    private Integer idDivision;
    private char nameDivision;

    /**
     * Конструктор для присвоения значения полям и генерации id
     *
     * @param symbol - название подразделения из файла
     */
    public Division(char symbol) {
        idDivision = Integer.valueOf(symbol) - 64;
        nameDivision = symbol;
    }

    /**
     * Метод получения значения поля idDivision
     *
     * @return - возвращает значение поля idDivision
     */
    public Integer getIdDivision() {
        return idDivision;
    }

    /**
     * Метод записи значения в поле
     *
     * @param idDivision - то, куда записывается значение
     */
    public void setIdDivision(Integer idDivision) {
        this.idDivision = idDivision;
    }

    /**
     * Метод получения значения поля nameDivision
     *
     * @return - возвращает значение поля nameDivision
     */
    public char getNameDivision() {
        return nameDivision;
    }

    /**
     * Метод записи значения в поле
     *
     * @param nameDivision - то, куда записывается значение
     */
    public void setNameDivision(char nameDivision) {
        this.nameDivision = nameDivision;
    }
}
