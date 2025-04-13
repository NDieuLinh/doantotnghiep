package com.ketoan.doantotnghiep.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "bangchamcong")
public class BangChamCong {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "bcc")
    private Integer bcc;
    @Column(name = "Ncdilam")
    private Integer ncdilam;
    @Column(name = "Thangcc")
    private Integer thangcc;
    @Column(name = "MaNV")
    private Integer manv;
    @Column(name = "Nclephep")
    private Integer nclephep;
    @Column(name = "Xeploai")
    private Integer xeploai;
    @Column(name = "NgayThThem")
    private Integer ngayththem;
    @Column(name = "NgayLeThem")
    private Integer ngaylethem;

    public Integer getBcc() {
        return bcc;
    }

    public void setBcc(Integer bcc) {
        this.bcc = bcc;
    }

    public Integer getNcdilam() {
        return ncdilam;
    }

    public void setNcdilam(Integer ncdilam) {
        this.ncdilam = ncdilam;
    }

    public Integer getThangcc() {
        return thangcc;
    }

    public void setThangcc(Integer thangcc) {
        this.thangcc = thangcc;
    }

    public Integer getManv() {
        return manv;
    }

    public void setManv(Integer manv) {
        this.manv = manv;
    }

    public Integer getNclephep() {
        return nclephep;
    }

    public void setNclephep(Integer nclephep) {
        this.nclephep = nclephep;
    }

    public Integer getXeploai() {
        return xeploai;
    }

    public void setXeploai(Integer xeploai) {
        this.xeploai = xeploai;
    }

    public Integer getNgayththem() {
        return ngayththem;
    }

    public void setNgayththem(Integer ngayththem) {
        this.ngayththem = ngayththem;
    }

    public Integer getNgaylethem() {
        return ngaylethem;
    }

    public void setNgaylethem(Integer ngaylethem) {
        this.ngaylethem = ngaylethem;
    }
}
