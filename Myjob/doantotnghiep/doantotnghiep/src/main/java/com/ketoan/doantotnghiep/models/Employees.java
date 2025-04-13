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
@Table(name = "yemployees")
public class Employees {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "Manv")
    private Integer manv;
    @Column(name = "Hoten")
    private Integer hoten;
    @Column(name = "Ngaysinh")
    private Integer ngaysinh;
    @Column(name = "Gioitinh")
    private Integer gioitinh;
    @Column(name = "Quequan")
    private Integer quequan;
    @Column(name = "Diachi")
    private Integer diachi;
    @Column(name = "MaPB")
    private Integer mapb;
    @Column(name = "MaCV")
    private Integer macv;
    @Column(name = "HSLuong")
    private Integer hsluong;
    @Column(name = "MSThue")
    private Integer msthue;

    public Integer getManv() {
        return manv;
    }

    public void setManv(Integer manv) {
        this.manv = manv;
    }

    public Integer getHoten() {
        return hoten;
    }

    public void setHoten(Integer hoten) {
        this.hoten = hoten;
    }

    public Integer getNgaysinh() {
        return ngaysinh;
    }

    public void setNgaysinh(Integer ngaysinh) {
        this.ngaysinh = ngaysinh;
    }

    public Integer getGioitinh() {
        return gioitinh;
    }

    public void setGioitinh(Integer gioitinh) {
        this.gioitinh = gioitinh;
    }

    public Integer getQuequan() {
        return quequan;
    }

    public void setQuequan(Integer quequan) {
        this.quequan = quequan;
    }

    public Integer getDiachi() {
        return diachi;
    }

    public void setDiachi(Integer diachi) {
        this.diachi = diachi;
    }

    public Integer getMapb() {
        return mapb;
    }

    public void setMapb(Integer mapb) {
        this.mapb = mapb;
    }

    public Integer getMacv() {
        return macv;
    }

    public void setMacv(Integer macv) {
        this.macv = macv;
    }

    public Integer getHsluong() {
        return hsluong;
    }

    public void setHsluong(Integer hsluong) {
        this.hsluong = hsluong;
    }

    public Integer getMsthue() {
        return msthue;
    }

    public void setMsthue(Integer msthue) {
        this.msthue = msthue;
    }
}
