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
@Table(name = "chucvu")
public class ChucVu {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "MaCV")
    private Integer macv;
    @Column(name = "TenCV")
    private Integer tencv;
    @Column(name = "HSPCCV")
    private Integer hspccv;

    public Integer getMacv() {
        return macv;
    }

    public void setMacv(Integer macv) {
        this.macv = macv;
    }

    public Integer getTencv() {
        return tencv;
    }

    public void setTencv(Integer tencv) {
        this.tencv = tencv;
    }

    public Integer getHspccv() {
        return hspccv;
    }

    public void setHspccv(Integer hspccv) {
        this.hspccv = hspccv;
    }
}
