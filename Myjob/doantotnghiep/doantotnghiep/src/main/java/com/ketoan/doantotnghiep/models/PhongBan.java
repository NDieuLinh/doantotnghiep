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
@Table(name = "phongban")
public class PhongBan {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "MaPB")
    private Integer mapb;
    @Column(name = "TenPB")
    private Integer tenpb;
    @Column(name = "SDT")
    private Integer sdt;

    public Integer getMapb() {
        return mapb;
    }

    public void setMapb(Integer mapb) {
        this.mapb = mapb;
    }

    public Integer getTenpb() {
        return tenpb;
    }

    public void setTenpb(Integer tenpb) {
        this.tenpb = tenpb;
    }

    public Integer getSdt() {
        return sdt;
    }

    public void setSdt(Integer sdt) {
        this.sdt = sdt;
    }
}
