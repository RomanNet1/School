package uchebnikTeoria.data_p2;

public class Date {
    private int day;
    private int mounth;
    private int year;

    public Date(int day, int mounth, int year) {
        this.day = day;
        this.mounth = mounth;
        this.year = year;
    }

    public Date(Date other){
        this.day = other.getDay();
        this.mounth = other.getMounth();
        this.year = other.getYear();
    }

    public int getDay() {
        return this.day;
    }

    public int getMounth() {
        return this.mounth;
    }

    public int getYear() {
        return this.year;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public void setMounth(int mounth) {
        this.mounth = mounth;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int compareTo(Date other){
        if(this.year<other.year)return -1;
        if(this.year>other.year)return 1;
        if(this.mounth<other.mounth)return -1;
        if(this.mounth>other.mounth)return 1;
        if(this.day<other.day)return -1;
        if(this.day>other.day)return 1;
        return 0;
    }

    @Override
    public String toString() {
        return this.day + "." + this.mounth + "." + this.year;
    }
}











