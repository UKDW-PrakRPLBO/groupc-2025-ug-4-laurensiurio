package org.example;

public class TV {
    private int maxResolusi;
    private Colokan colokan;

    public int getResolution() {
        if (colokan.getRealBandwidth() >=10 && colokan.getRealBandwidth() <=35){
         return 480;
        } else if (colokan.getRealBandwidth() >=35 && colokan.getRealBandwidth() <=100) {
            return 720;
        }else if (colokan.getRealBandwidth() >100) {
            return 720;
        }else {System.out.println("TV tidak nyala " + colokan.getMerk());
                return 0;}
    }

    

    public TV(int maxResolusi){
        this.maxResolusi = maxResolusi;
    }

    public void connect(Colokan colokan){
        this.colokan = colokan;
        System.out.println("Berhasil Connect ke - " + colokan.getMerk());
    }
}
