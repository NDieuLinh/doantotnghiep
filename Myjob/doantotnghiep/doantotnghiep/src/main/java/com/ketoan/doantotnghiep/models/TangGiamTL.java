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
@Table(name = "tanggiamtl")
public class TangGiamTL {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "malg")
    private Integer malg;
    @Column(name = "MaNV")
    private Integer manv;
    @Column(name = "ngaythang")
    private Integer ngaythang;
    @Column(name = "TKN")
    private Integer tkn;
    @Column(name = "TKC")
    private Integer tkc;
    @Column(name = "Sotien")
    private Integer sotien;
    @Column(name = "Diengiai")
    private Integer diengiai;

    public Integer getMalg() {
        return malg;
    }

    public void setMalg(Integer malg) {
        this.malg = malg;
    }

    public Integer getManv() {
        return manv;
    }

    public void setManv(Integer manv) {
        this.manv = manv;
    }

    public Integer getNgaythang() {
        return ngaythang;
    }

    public void setNgaythang(Integer ngaythang) {
        this.ngaythang = ngaythang;
    }

    public Integer getTkn() {
        return tkn;
    }

    public void setTkn(Integer tkn) {
        this.tkn = tkn;
    }

    public Integer getTkc() {
        return tkc;
    }

    public void setTkc(Integer tkc) {
        this.tkc = tkc;
    }

    public Integer getSotien() {
        return sotien;
    }

    public void setSotien(Integer sotien) {
        this.sotien = sotien;
    }

    public Integer getDiengiai() {
        return diengiai;
    }

    public void setDiengiai(Integer diengiai) {
        this.diengiai = diengiai;
    }
}
