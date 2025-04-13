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
@Table(name = "thuetncn")
public class ThueTncn {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "Bacthue")
    private Integer bacthue;
    @Column(name = "Tu")
    private Integer tu;
    @Column(name = "Den")
    private Integer den;
    @Column(name = "Thuesuat")
    private Integer thuesuat;

    public Integer getBacthue() {
        return bacthue;
    }

    public void setBacthue(Integer bacthue) {
        this.bacthue = bacthue;
    }

    public Integer getTu() {
        return tu;
    }

    public void setTu(Integer tu) {
        this.tu = tu;
    }

    public Integer getDen() {
        return den;
    }

    public void setDen(Integer den) {
        this.den = den;
    }

    public Integer getThuesuat() {
        return thuesuat;
    }

    public void setThuesuat(Integer thuesuat) {
        this.thuesuat = thuesuat;
    }
}
