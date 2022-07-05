import model.GuardaVolume;
import model.Vestuario;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Vestuario> roupasJohnDoe = new ArrayList<>();
        List<Vestuario> roupasJaneDoe = new ArrayList<>();

        roupasJohnDoe.add(new Vestuario("MELI Fashion", "Regata"));
        roupasJohnDoe.add(new Vestuario("MELI Fashion", "Boné"));

        roupasJaneDoe.add(new Vestuario("MELI Fashion", "Calça"));
        roupasJaneDoe.add(new Vestuario("MELI Fashion", "Blusa"));

        GuardaVolume guardaVolume = new GuardaVolume();

        guardaVolume.guardarRoupa(roupasJohnDoe);
        guardaVolume.guardarRoupa(roupasJaneDoe);
        System.out.println("Listando Guarda Volume");
        guardaVolume.mostrarRoupas();
        System.out.println();

        System.out.println("Retirando Roupas");
        guardaVolume.getRoupas(3);
        System.out.println();
        System.out.println("Retirando Roupas");
        guardaVolume.getRoupas(1);
        System.out.println();

        System.out.println("Listando Guarda Volume");
        guardaVolume.mostrarRoupas();
    }
}
