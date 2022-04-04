package Quis_123200170;
import java.util.Scanner;

import Criteria.ProgrammerCriteria;
import Criteria.DesignerCriteria;
import Criteria.ManagerCriteria;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ASUS
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        
        int pilih;
        boolean y = false;
        
        System.out.println("+ -------------------------- +");
        System.out.println("| Pelamar Lowongan Pekerjaan |");
        System.out.println("+ -------------------------- +");
        System.out.println(" Terdapat 3 Posisi yang Kosong ");
        System.out.println("1. Programmer ");
        System.out.println("2. Designer ");
        System.out.println("3. Manager ");
        System.out.print("Pilih Pekerjaan yang ingin dilamar : ");
        pilih = input.nextInt();
        
                
               
        if(pilih == 1){
            String nama;
                int nilai1;
                int nilai2;
                int nilai3;
                
                System.out.println(" ");
                Scanner data = new Scanner(System.in);
                
                System.out.println("== Formulir Pelamar ==\n");
                System.out.print("Input Nama : ");
                nama = data.nextLine();
                
                System.out.println("-- Penilaian --\n");
                System.out.println(" Nilai yang Valid berada pada 1 - 100");
                
                System.out.print("Nilai Programming Knowledge : ");
                nilai1 = data.nextInt();
                
                System.out.print("Nilai Clean Coding : ");
                nilai2 = data.nextInt();
                
                System.out.print("Nilai Debugging : ");
                nilai3 = data.nextInt();
            ProgrammerCriteria programmerCriteria = new ProgrammerCriteria(nama, nilai1, nilai2, nilai3);
            do{
            System.out.println("\nMENU");
            System.out.println("1. Tampil");
            System.out.println("2. Ubah");
            System.out.println("3. Exit");
            System.out.print("Pilih : ");
            pilih = input.nextInt();
            
            if (pilih == 1){
                System.out.println("Nilai akhir : " + programmerCriteria.nilai());
                System.out.println("KETERANGAN : " + programmerCriteria.keterangan());
            }
            else if(pilih == 2){
                System.out.print("Nilai Programming Knowledge : ");
                programmerCriteria.setNilai1(input.nextInt());
                System.out.print("Nilai Clean Coding : ");
                programmerCriteria.setNilai2(input.nextInt());
                System.out.print("Nilai Debugging : ");
                programmerCriteria.setNilai3(input.nextInt());
            }
            else {
                break;
            }
            }while(true);
        }
        else if (pilih == 2){
            String nama;
                int nilai1;
                int nilai2;
                int nilai3;
                
                System.out.println(" ");
                Scanner data = new Scanner(System.in);
                
                System.out.println("== Formulir Pelamar ==\n");
                System.out.print("Input Nama : ");
                nama = data.nextLine();
                
                System.out.println("-- Penilaian --\n");
                
                System.out.print("Nilai Design Portofolio  : ");
                nilai1 = data.nextInt();
                
                System.out.print("Nilai Prototyping : ");
                nilai2 = data.nextInt();
                
                System.out.print("Nilai Creativity  : ");
                nilai3 = data.nextInt();
            DesignerCriteria designerCriteria = new DesignerCriteria(nama, nilai1, nilai2, nilai3);
            do{
            System.out.println("\nMENU");
            System.out.println("1. Tampil");
            System.out.println("2. Ubah");
            System.out.println("3. Exit");
            System.out.print("Pilih : ");
            pilih = input.nextInt();
            
            if (pilih == 1){
                System.out.println("Nilai akhir : " + designerCriteria.nilai());
                System.out.println("KETERANGAN : " + designerCriteria.keterangan());
            }
            else if(pilih == 2){
                System.out.print("Nilai Design Portofolio  : ");
                designerCriteria.setNilai1(input.nextInt());
                System.out.print("Nilai Prototyping : ");
                designerCriteria.setNilai2(input.nextInt());
                System.out.print("Nilai Creativity : ");
                designerCriteria.setNilai3(input.nextInt());
            }
            else {
                break;
            }
            }while(true);
        }
        
        else if (pilih == 3){
            String nama;
                int nilai1;
                int nilai2;
                int nilai3;
                
                System.out.println(" ");
                Scanner data = new Scanner(System.in);
                
                System.out.println("== Formulir Pelamar ==\n");
                System.out.print("Input Nama : ");
                nama = data.nextLine();
                
                System.out.println("-- Penilaian --\n");
                
                System.out.print("Nilai Innovation : ");
                nilai1 = data.nextInt();
                
                System.out.print("Nilai Decision Making : ");
                nilai2 = data.nextInt();
                
                System.out.print("Nilai Communication : ");
                nilai3 = data.nextInt();
            ManagerCriteria managerCriteria = new ManagerCriteria(nama, nilai1, nilai2, nilai3);
            do{
            System.out.println("\nMENU");
            System.out.println("1. Tampil");
            System.out.println("2. Ubah");
            System.out.println("3. Exit");
            System.out.print("Pilih : ");
            pilih = input.nextInt();
            
            if (pilih == 1){
                System.out.println("Nilai akhir : " + managerCriteria.nilai());
                System.out.println("KETERANGAN : " + managerCriteria.keterangan());
            }
            else if(pilih == 2){
                System.out.print("Nilai Innovation : ");
                managerCriteria.setNilai1(input.nextInt());
                System.out.print("Nilai Decision Making : ");
                managerCriteria.setNilai2(input.nextInt());
                System.out.print("Nilai Communication : ");
                managerCriteria.setNilai3(input.nextInt());
            }
            else {
                break;
            }
            }while(true);
        }

        }
    }
    

