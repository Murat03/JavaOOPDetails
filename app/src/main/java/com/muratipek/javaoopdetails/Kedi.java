package com.muratipek.javaoopdetails;

public class Kedi implements Egitim{
    private String isim;
    private String gozRengi;
    private String tuyRengi;

    //statik sınıfın kendisine ait obje ve metotlar
    // oluşturur instanceına değil
    public static String turIsmi = "felis";

    //Polymprohism
    public Kedi(){

    }

    public Kedi(String isim, String gozRengi, String tuyRengi){
        this.isim = isim;
        this.gozRengi = gozRengi;
        this.tuyRengi = tuyRengi;
    }
    public static void konusKediStatic(){
        System.out.println("Benim türüm:" + turIsmi);
    }
    public void konusKedi(){
        System.out.println("Benim ismim: " + this.isim + "Benim türüm:" + turIsmi);
    }

    @Override
    public boolean egitimAl() {
        System.out.println("kediler eğitim almaz");
        return false;
    }
}
