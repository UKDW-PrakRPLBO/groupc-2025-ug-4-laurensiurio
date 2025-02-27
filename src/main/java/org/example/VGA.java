package org.example;

public class VGA extends Colokan{


    public VGA(int harga, double promisedBandwidth, String merk) {
        super(harga, promisedBandwidth, merk);
    }

    public double getRealBandwidth(){
        int hargapasar= 30000;
        double  rasio = (double) getHarga() / (double) hargapasar;
        if (rasio < 1){
            return rasio * getPromisedBandwidth();
        }else {
            return getPromisedBandwidth();
        }

    }
}
