package com.example.lcthack;

public class ItemControlBanner {

    String kno;
    String typeofcontrol;
    String themeofconsulting;
    String date;
    String time;
    String userid;
    String useremail;

    public ItemControlBanner(){

    }

    public ItemControlBanner(String kno, String typeofcontrol, String themeofconsulting, String date, String time, String userid, String useremail) {
        this.kno = kno;
        this.typeofcontrol = typeofcontrol;
        this.themeofconsulting = themeofconsulting;
        this.date = date;
        this.time = time;
        this.userid = userid;
        this.useremail = useremail;
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

    public String getUserid() {
        return userid;
    }

    public void setUserid(String userid) {
        this.userid = userid;
    }

    public String getUseremail() {
        return useremail;
    }

    public void setUseremail(String useremail) {
        this.useremail = useremail;
    }
}
