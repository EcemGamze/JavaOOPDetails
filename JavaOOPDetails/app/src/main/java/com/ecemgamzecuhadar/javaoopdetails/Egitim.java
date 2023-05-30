package com.ecemgamzecuhadar.javaoopdetails;

public interface Egitim {
    public boolean egitimAl();
    public default boolean egitimAlBody() {
        System.out.println("egitim almıyoruz");
        return false;
    }

}
