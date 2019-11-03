package com.example.exchangeapp;

public class TyGia {

    private String time;
    private String bank;
    private int bank_id;
    private int id;
    private String code;
    private String vname;
    private String muatienmat;
    private String muatienmat_diff;
    private String bantienmat;
    private String bantienmat_diff;
    private String muachuyenkhoan;
    private String muachuyenkhoan_diff;
    private String banchuyenkhoan;
    private String banchuyenkhoan_diff;
    private String bank_name;
    private String bank_code;

    public TyGia(String time, String bank, int bank_id, int id, String code, String vname, String muatienmat, String muatienmat_diff, String bantienmat, String bantienmat_diff, String muachuyenkhoan, String muachuyenkhoan_diff, String banchuyenkhoan, String banchuyenkhoan_diff, String bank_name, String bank_code) {
        this.time = time;
        this.bank = bank;
        this.bank_id = bank_id;
        this.id = id;
        this.code = code;
        this.vname = vname;
        this.muatienmat = muatienmat;
        this.muatienmat_diff = muatienmat_diff;
        this.bantienmat = bantienmat;
        this.bantienmat_diff = bantienmat_diff;
        this.muachuyenkhoan = muachuyenkhoan;
        this.muachuyenkhoan_diff = muachuyenkhoan_diff;
        this.banchuyenkhoan = banchuyenkhoan;
        this.banchuyenkhoan_diff = banchuyenkhoan_diff;
        this.bank_name = bank_name;
        this.bank_code = bank_code;
    }

    public String getBank_code() {
        return bank_code;
    }

    public void setBank_code(String bank_code) {
        this.bank_code = bank_code;
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

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getVname() {
        return vname;
    }

    public String getMuatienmat() {
        return muatienmat;
    }

    public void setMuatienmat(String muatienmat) {
        this.muatienmat = muatienmat;
    }

    public String getMuatienmat_diff() {
        return muatienmat_diff;
    }

    public void setMuatienmat_diff(String muatienmat_diff) {
        this.muatienmat_diff = muatienmat_diff;
    }

    public String getBantienmat() {
        return bantienmat;
    }

    public void setBantienmat(String bantienmat) {
        this.bantienmat = bantienmat;
    }

    public String getBantienmat_diff() {
        return bantienmat_diff;
    }

    public void setBantienmat_diff(String bantienmat_diff) {
        this.bantienmat_diff = bantienmat_diff;
    }

    public String getMuachuyenkhoan() {
        return muachuyenkhoan;
    }

    public void setMuachuyenkhoan(String muachuyenkhoan) {
        this.muachuyenkhoan = muachuyenkhoan;
    }

    public String getMuachuyenkhoan_diff() {
        return muachuyenkhoan_diff;
    }

    public void setMuachuyenkhoan_diff(String muachuyenkhoan_diff) {
        this.muachuyenkhoan_diff = muachuyenkhoan_diff;
    }

    public String getBanchuyenkhoan() {
        return banchuyenkhoan;
    }

    public void setBanchuyenkhoan(String banchuyenkhoan) {
        this.banchuyenkhoan = banchuyenkhoan;
    }

    public String getBanchuyenkhoan_diff() {
        return banchuyenkhoan_diff;
    }

    public void setBanchuyenkhoan_diff(String banchuyenkhoan_diff) {
        this.banchuyenkhoan_diff = banchuyenkhoan_diff;
    }

    public void setVname(String vname) {
        this.vname = vname;
    }

    public String getBank_name() {
        return bank_name;
    }

    public void setBank_name(String bank_name) {
        this.bank_name = bank_name;
    }

}
