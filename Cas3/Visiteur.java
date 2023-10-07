package Cas3;

public interface Visiteur {

        int visiter(Nombre nombre);

        int visiter(Plus plus);

        int visiter(Moins moins);

        int visiter(Fois fois);

}
