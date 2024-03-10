package uchebnikTeoria.passport_p3;

import uchebnikTeoria.data_p2.Date;

public class Passport {
    private String name;
    private int number;
    private Date limitDate;

    public Passport(String name, int number, Date limitDate) {
        this.name = name;
        this.number = number;
        this.limitDate = limitDate;
    }

    public void setLimitDate(Date other) {
        this.limitDate = other;
    }

    public boolean isValid(Date other){
        if(this.limitDate.compareTo(other) > 0){
            return true;
        }else {
            return false;
        }
    }

    @Override
    public String toString() {
        return "Passport{" +
                "name='" + name + '\'' +
                ", number=" + number +
                ", limitDate=" + limitDate +
                '}';
    }
}
