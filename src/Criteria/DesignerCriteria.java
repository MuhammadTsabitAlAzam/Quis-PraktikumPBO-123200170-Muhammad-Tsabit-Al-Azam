/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Criteria;
import Pendaftar.Pendaftar;
/**
 *
 * @author ASUS
 */
public class DesignerCriteria extends Pendaftar implements Perhitungan {
     public DesignerCriteria(String nama, int nilai1, int nilai2, int nilai3) {
        super(nama, nilai1, nilai2, nilai3);
    }

    public void setNilai1(int nilai1) {
        this.nilai1 = nilai1;
    }

    public void setNilai2(int nilai2) {
        this.nilai2 = nilai2;
    }

    public void setNilai3(int nilai3) {
        this.nilai3 = nilai3;
    }

    @Override
    public double nilai() {
        return (super.nilai1 * 0.3) + (super.nilai2 * 0.45) + (super.nilai3 * 0.25);
    }

    @Override
    public String keterangan() {
        if(this.nilai() >= 85) return "LULUS\nSelamat kepada " + this.nama + " telah diterima sebagai Designer";
        else return "GAGAL\nMohon maaf kepada " + this.nama + " telah ditolak sebagai Designer";
    }
}
