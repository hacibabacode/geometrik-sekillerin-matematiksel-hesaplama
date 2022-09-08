package com.company;
import java.util.Scanner;


public class Main {


    public static void main(String[] args) {

        int secenek;
        Scanner s=new Scanner(System.in);



        menuGoster();
        System.out.println("Lütfen seçenek girin");
        secenek=s.nextInt();

        if (secenek == 1){
            dikdortgen();
        }
        else if(secenek ==2){
            kare();
        }
        else if(secenek ==3){
            kup();
        }
        else if(secenek ==4){
            koni();
        }
        else if(secenek ==5){
            ucgen();
        }
        else if(secenek ==6){
            kare_piramit();
        }
        else if(secenek ==7){
            silindir();
        }
        else if(secenek ==8){
            daire();
        }
        else if(secenek ==9){
            kure();
        }
        else if(secenek ==10){
            cokgen();
        }
        else if(secenek ==11){
            paralelKenar();
        }
        else if(secenek ==12){
            yamuk();
        }
        else if(secenek ==13){
            elips();
        }
        else if(secenek ==14){
            ortalamaHesapla();
        }
        else if(secenek ==15){
            carpimTablosu();
        }
        else{
            System.out.println("Yanlış tuşlama yaptınız! Lütfen tekrar deneyin.");
        }



    }

    public static void menuGoster(){
        System.out.println("*************MENU*************");
        System.out.println("1.Dikdortgen");
        System.out.println("2.Kare");
        System.out.println("3.Kup");
        System.out.println("4.Koni");
        System.out.println("5.Ucgen");
        System.out.println("6.Kare Piramit");
        System.out.println("7.Silindir");
        System.out.println("8.Daire");
        System.out.println("9.Kare");
        System.out.println("10.Cokgen");
        System.out.println("11.Paralelkenar");
        System.out.println("12.Yamuk");
        System.out.println("13.Elips");
        System.out.println("14.Ortalama Hesaplama");
        System.out.println("15.Carpim Tablosu");
    }

    public static void dikdortgen(){
        Scanner s= new Scanner(System.in);

        int a,b,cevre,alan;
        System.out.println("Uzun kenar girin: ");
        a=s.nextInt();
        System.out.println("Kisa kenar girin: ");
        b=s.nextInt();
        cevre = 2*(a+b);
        alan = a*b;
        System.out.println("Cevre = " + cevre);
        System.out.println("Alan =" + alan);

    }

    public static void kare(){
        Scanner s= new Scanner(System.in);

        int a,cevre,alan;
        System.out.println("Kenar uzunluğu girin: ");
        a=s.nextInt();
        cevre = 4*a;
        alan = a*a;
        System.out.println("Cevre = " + cevre);
        System.out.println("Alan =" + alan);

    }

    public static void kup(){
        Scanner s= new Scanner(System.in);

        int a,hacim,alan;
        System.out.println("Kenar uzunluğu girin: ");
        a=s.nextInt();
        hacim = a*a*a;
        alan = 6*a*a;
        System.out.println("Hacim = " + hacim);
        System.out.println("Alan =" + alan);

    }

    public static void koni(){
        Scanner s= new Scanner(System.in);

        double hacim,r,h;
        System.out.println("Yaricap uzunluğu girin: ");
        r=s.nextInt();
        System.out.println("Yukseklik girin: ");
        h=s.nextInt();
        hacim = ((1/3)*(3.14)*r*r*h);
        System.out.println("Hacim = " + hacim);

    }


    public static void ucgen(){
        Scanner s= new Scanner(System.in);

        float a,b,c,h,cevre,alan;
        System.out.println("Taban uzunluğu girin: ");
        a=s.nextInt();
        System.out.println("Kenar uzunluğu girin: ");
        b=s.nextInt();
        System.out.println("Kenar2 uzunluğu girin: ");
        c=s.nextInt();
        System.out.println("Yukseklik girin: ");
        h=s.nextInt();
        cevre = a+b+c;
        alan = (a*h)/2;
        System.out.println("Cevre = " + cevre);
        System.out.println("Alan =" + alan);

    }

    public static void kare_piramit(){
        Scanner s= new Scanner(System.in);

        int a,h,hacim;
        System.out.println("Uzun kenar girin: ");
        a=s.nextInt();
        System.out.println("Yükseklik girin: ");
        h=s.nextInt();
        hacim = (a*a*h)/3;
        System.out.println("Hacim =" + hacim);

    }

    public static void silindir(){
        Scanner s= new Scanner(System.in);

        double r,h,hacim,alan;
        System.out.println("Yarıçap uzunluğu girin: ");
        r=s.nextInt();
        System.out.println("Yükseklik girin: ");
        h=s.nextInt();
        hacim = (3.14)*r*r*h;
        alan = 2*(3.14)*r*h*(r+h);
        System.out.println("Hacim = " + hacim);
        System.out.println("Alan =" + alan);

    }

    public static void daire(){
        Scanner s= new Scanner(System.in);

        double r,cevre,alan;
        System.out.println("Yarıçap uzunluğu girin: ");
        r=s.nextInt();
        cevre = 2*(3.14)*r;
        alan = (3.14)*r*r;
        System.out.println("Hacim = " + cevre);
        System.out.println("Alan =" + alan);

    }

    public static void kure(){
        Scanner s= new Scanner(System.in);

        double r,hacim,alan;
        System.out.println("Yarıçap uzunluğu girin: ");
        r=s.nextInt();
        hacim = (4/3*(3.14)*r*r*r);
        alan = 4*(3.14)*r*r;
        System.out.println("Hacim = " + hacim);
        System.out.println("Alan =" + alan);

    }

    public static void cokgen(){
        Scanner s= new Scanner(System.in);

        double n,k,cevre,alan;
        System.out.println("Kenar uzunluğu girin: ");
        k=s.nextInt();
        System.out.println("Kenar sayisini girin: ");
        n=s.nextInt();
        cevre = n*k;
        alan = (1/4)*n*k;
        System.out.println("Cevre = " + cevre);
        System.out.println("Alan =" + alan);

    }

    public static void paralelKenar(){
        Scanner s= new Scanner(System.in);

        double a,b,h,cevre,alan;
        System.out.println("Kenar uzunluğu girin: ");
        a=s.nextInt();
        System.out.println("Taban uzunluğu girin: ");
        b=s.nextInt();
        System.out.println("Yükseklik girin: ");
        h=s.nextInt();
        cevre = (2*a)+(2*b);
        alan = b*h;
        System.out.println("Cevre = " + cevre);
        System.out.println("Alan =" + alan);

    }

    public static void yamuk(){
        Scanner s= new Scanner(System.in);

        double a,b,c,d,h,cevre,alan;
        System.out.println("Kenar uzunluğu girin: ");
        a=s.nextInt();
        System.out.println("Kenar uzunluğu girin: ");
        b=s.nextInt();
        System.out.println("Kenar uzunluğu girin: ");
        c=s.nextInt();
        System.out.println("Kenar uzunluğu girin: ");
        d=s.nextInt();
        System.out.println("Yükseklik girin: ");
        h=s.nextInt();
        cevre = a+b+c+d;
        alan = (a+b)/2*h;
        System.out.println("Cevre = " + cevre);
        System.out.println("Alan =" + alan);

    }

    public static void elips(){
        Scanner s= new Scanner(System.in);

        double a,b,alan;
        System.out.println("Kisa yaricap girin: ");
        a=s.nextInt();
        System.out.println("Uzun yaricap girin: ");
        b=s.nextInt();
        alan = (3.14)*a*b;
        System.out.println("Alan =" + alan);

    }

    public static void ortalamaHesapla(){
        Scanner s= new Scanner(System.in);

        double a,b,c,x,sonuc,sonuc2,sonuc3;
        System.out.println("İlk sayiyi girin: ");
        a=s.nextInt();
        System.out.println("İkinci sayiyi girin: ");
        b=s.nextInt();
        System.out.println("Ucuncu sayiyi girin: ");
        c=s.nextInt();

        System.out.println("1.Aritmetik Ortalama");
        System.out.println("2.Geometrik Ortalama");
        System.out.println("1.Harmonik Ortalama");

        System.out.println("Seçiminizi girin: ");
        x=s.nextInt();

        if (x==1){
            sonuc = (a+b+c)/3;
            System.out.println("Sonuc= " + sonuc);
        }
        else if (x==2){
            sonuc2 = (a+b+c)*(1/3);
            System.out.println("Sonuc= " + sonuc2);
        }
        else if(x==3){
            sonuc3 = (3/((1/a)+(1/b)+(1/c)));
            System.out.println("Sonuc= " + sonuc3);
        }

    }

    public static void carpimTablosu(){

        for(int i=0; i<10; i++){
            for (int j=0; j<10; j++){
                System.out.print("    " + i + "*" + j + "=" + i*j);
            }
            System.out.println("\n");
        }

    }



}
