package com.muratipek.javaoopdetails;

public interface Egitim {
    //bunu uygulamak zorundayız
    public boolean egitimAl();

    //bodysi varsa uygulamak zorunda değiliz
    public default boolean egitimAlBody(){
        System.out.println("Eğitim almıyoruz");
        return false;
    }
}
