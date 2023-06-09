package com.example.lcthack;

public class ItemControlBanner {

    String kno;
    String typeofcontrol;
    String themeofconsulting;
    String date;
    String time;

    public ItemControlBanner(){

    }

    public ItemControlBanner(String kno, String typeofcontrol, String themeofconsulting, String date, String time) {
        this.kno = kno;
        this.typeofcontrol = typeofcontrol;
        this.themeofconsulting = themeofconsulting;
        this.date = date;
        this.time = time;

    }

    public String getKno() {
        return kno;
    }

    public void setKno(String kno) {
        this.kno = kno;
    }

    public String getTypeofcontrol() {
        return typeofcontrol;
    }

    public void setTypeofcontrol(String typeofcontrol) {
        this.typeofcontrol = typeofcontrol;
    }

    public String getThemeofconsulting() {
        return themeofconsulting;
    }

    public void setThemeofconsulting(String themeofconsulting) {
        this.themeofconsulting = themeofconsulting;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }
}
