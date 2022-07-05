package model;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GuardaVolume {
    private Map<Integer, List<Vestuario>> dicionario;
    private Integer contador;

    public GuardaVolume() {
        this.dicionario = new HashMap<>();
        this.contador = 0;
    }

    public Integer guardarRoupa(List<Vestuario> listaDeVestuario) {
        this.contador++;
        this.dicionario.put(contador, listaDeVestuario);
        return contador;
    }

    public void mostrarRoupas() {
        this.dicionario.forEach((id, listaDeVestuario) -> {
                    System.out.println("Identificação: " + id);
                    System.out.println("Roupas: ");
                    listaDeVestuario.forEach(System.out::println);
                });
    }

    public List<Vestuario> getRoupas(Integer numero) {
        List<Vestuario> listaDeVestuario = this.dicionario.get(numero);
        if(listaDeVestuario == null) {
            System.out.println("O Guarda Volume número " + numero + " está vazio.");
        } else {
            System.out.println("Roupas retiradas com sucesso.");
            this.dicionario.remove(numero);
        }
        return this.dicionario.get(numero);
    }
}
