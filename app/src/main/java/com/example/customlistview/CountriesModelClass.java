package com.example.customlistview;

public class CountriesModelClass {
    private String countries_name,cups_win_count;
    private int flag_img;

    public CountriesModelClass(String countries_name, String cups_win_count, int flag_img) {
        this.countries_name = countries_name;
        this.cups_win_count = cups_win_count;
        this.flag_img = flag_img;
    }

    public String getCountries_name() {
        return countries_name;
    }

    public void setCountries_name(String countries_name) {
        this.countries_name = countries_name;
    }

    public String getCups_win_count() {
        return cups_win_count;
    }

    public void setCups_win_count(String cups_win_count) {
        this.cups_win_count = cups_win_count;
    }

    public int getFlag_img() {
        return flag_img;
    }

    public void setFlag_img(int flag_img) {
        this.flag_img = flag_img;
    }
}
