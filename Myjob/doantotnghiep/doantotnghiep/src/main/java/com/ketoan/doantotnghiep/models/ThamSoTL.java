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
@Table(name = "thamsotl")
public class ThamSoTL {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "Thangnam")
    private Integer thangnam;
    @Column(name = "Luongcb")
    private Integer luongcb;
    @Column(name = "Ngcchuan")
    private Integer ngcchuan;
    @Column(name = "Giocchuan")
    private Integer giocchuan;
    @Column(name = "HSGioTh")
    private Integer hsgioTh;
    @Column(name = "HSGioLe")
    private Integer hsgioLe;
    @Column(name = "PCAn")
    private Integer pcan;
    @Column(name = "TLBHXH")
    private Integer tlbhxh;
    @Column(name = "TLBHYT")
    private Integer tlbhyt;
    @Column(name = "TLBHTN")
    private Integer tlbhtn;
    @Column(name = "TLKPCD")
    private Integer tlkpcd;

    public Integer getThangnam() {
        return thangnam;
    }

    public void setThangnam(Integer thangnam) {
        this.thangnam = thangnam;
    }

    public Integer getLuongcb() {
        return luongcb;
    }

    public void setLuongcb(Integer luongcb) {
        this.luongcb = luongcb;
    }

    public Integer getNgcchuan() {
        return ngcchuan;
    }

    public void setNgcchuan(Integer ngcchuan) {
        this.ngcchuan = ngcchuan;
    }

    public Integer getGiocchuan() {
        return giocchuan;
    }

    public void setGiocchuan(Integer giocchuan) {
        this.giocchuan = giocchuan;
    }

    public Integer getHsgioTh() {
        return hsgioTh;
    }

    public void setHsgioTh(Integer hsgioTh) {
        this.hsgioTh = hsgioTh;
    }

    public Integer getHsgioLe() {
        return hsgioLe;
    }

    public void setHsgioLe(Integer hsgioLe) {
        this.hsgioLe = hsgioLe;
    }

    public Integer getPcan() {
        return pcan;
    }

    public void setPcan(Integer pcan) {
        this.pcan = pcan;
    }

    public Integer getTlbhxh() {
        return tlbhxh;
    }

    public void setTlbhxh(Integer tlbhxh) {
        this.tlbhxh = tlbhxh;
    }

    public Integer getTlbhyt() {
        return tlbhyt;
    }

    public void setTlbhyt(Integer tlbhyt) {
        this.tlbhyt = tlbhyt;
    }

    public Integer getTlbhtn() {
        return tlbhtn;
    }

    public void setTlbhtn(Integer tlbhtn) {
        this.tlbhtn = tlbhtn;
    }

    public Integer getTlkpcd() {
        return tlkpcd;
    }

    public void setTlkpcd(Integer tlkpcd) {
        this.tlkpcd = tlkpcd;
    }
}
