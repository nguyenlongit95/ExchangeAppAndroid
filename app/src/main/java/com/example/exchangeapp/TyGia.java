package com.example.exchangeapp;

public class TyGia {

    private String time;
    private String bank;
    private int bank_id;
    private int id;
    private int cron_id;
    private String code;
    private String vname;
    private float muatienmat;
    private float bantienmat;
    private float muachuyenkhoan;
    private float banchuyenkhoan;
    private String bank_name;

    public TyGia(String time, String bank, int bank_id, int id, int cron_id, String code, String vname, float muatienmat, float bantienmat, float muachuyenkhoan, float banchuyenkhoan, String bank_name) {
        this.time = time;
        this.bank = bank;
        this.bank_id = bank_id;
        this.id = id;
        this.cron_id = cron_id;
        this.code = code;
        this.vname = vname;
        this.muatienmat = muatienmat;
        this.bantienmat = bantienmat;
        this.muachuyenkhoan = muachuyenkhoan;
        this.banchuyenkhoan = banchuyenkhoan;
        this.bank_name = bank_name;
    }

    public TyGia() {
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getBank() {
        return bank;
    }

    public void setBank(String bank) {
        this.bank = bank;
    }

    public int getBank_id() {
        return bank_id;
    }

    public void setBank_id(int bank_id) {
        this.bank_id = bank_id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getCron_id() {
        return cron_id;
    }

    public void setCron_id(int cron_id) {
        this.cron_id = cron_id;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getVname() {
        return vname;
    }

    public void setVname(String vname) {
        this.vname = vname;
    }

    public float getMuatienmat() {
        return muatienmat;
    }

    public void setMuatienmat(float muatienmat) {
        this.muatienmat = muatienmat;
    }

    public float getBantienmat() {
        return bantienmat;
    }

    public void setBantienmat(float bantienmat) {
        this.bantienmat = bantienmat;
    }

    public float getMuachuyenkhoan() {
        return muachuyenkhoan;
    }

    public void setMuachuyenkhoan(float muachuyenkhoan) {
        this.muachuyenkhoan = muachuyenkhoan;
    }

    public float getBanchuyenkhoan() {
        return banchuyenkhoan;
    }

    public void setBanchuyenkhoan(float banchuyenkhoan) {
        this.banchuyenkhoan = banchuyenkhoan;
    }

    public String getBank_name() {
        return bank_name;
    }

    public void setBank_name(String bank_name) {
        this.bank_name = bank_name;
    }

}
