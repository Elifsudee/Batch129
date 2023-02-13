package miniproject.biletrezevasyon;

import java.util.ArrayList;
import java.util.List;

public class Bus {
    //2-plaka,koltuk numaralari

    public String numberPlate;//plaka

    public List<String> seats =new ArrayList<>();//koltuk numaralari
    //3-otobus olusturdugumuzda koltuk nolari olsun ve plaka set edilsin

    public Bus(String numberPlate){

        this.numberPlate=numberPlate;
        for (int i = 1; i <32 ; i++) {
            this.seats.add(i+"");// ya da String.valueOf()
        }
    }


}
