package com.ecemgamzecuhadar.javaoopdetails;

public class Kopek extends Hayvan implements Egitim {
    public Kopek(){
        super();
    }
    public Kopek(String isim, String gozRengi, String tuyRengi) {
        super(isim, gozRengi, tuyRengi);

    }


    @Override
    public boolean egitimAl() {
        System.out.println("kopekler egitim alır");
        return true;
    }

    @Override
    public boolean egitimAlBody() {
        System.out.println("köpekler gayet de eğitim alır");
        return true;
    }
}
