import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {


        Campana campana = new Campana();
        List<Suono> suoni = new ArrayList<>();
        Suono s1 = new Suono(campana, Sounds.DIN);
        Suono s2 = new Suono(campana, Sounds.DON);
        Suono s3 = new Suono(campana, Sounds.DAN);
        Suono s4 = new Suono(campana, Sounds.DAN);
        Suono s5 = new Suono(campana, Sounds.DON);
        Suono s6 = new Suono(campana, Sounds.DIN);
        suoni.add(s1);
        suoni.add(s2);
        suoni.add(s3);
        suoni.add(s4);
        suoni.add(s5);
        suoni.add(s6);

        for(Suono suono : suoni)
            suono.start();

    }
}