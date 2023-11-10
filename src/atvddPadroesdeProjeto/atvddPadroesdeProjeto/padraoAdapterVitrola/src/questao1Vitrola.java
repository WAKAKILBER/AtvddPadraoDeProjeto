interface ReproduzirAudio {
    void reproduzir();
}

class LeitordeCD implements ReproduzirAudio {
    @Override
    public void reproduzir() {
        System.out.println("Reproduzindo CD de Engenheiros do Hawaii...");
    }
}

class TocadorVinil implements ReproduzirAudio {
    @Override
    public void reproduzir() {
        System.out.println("Reproduzindo vinil de Engenheiros do Hawaii...");
    }
}

interface DispositivoDeAudio {
    void reproduzirAudio();
}

class AdaptadorDeAudio implements DispositivoDeAudio {
    private final ReproduzirAudio reproduzirAudio;

    public AdaptadorDeAudio(ReproduzirAudio reproduzirAudio) {
        this.reproduzirAudio = reproduzirAudio;
    }

    @Override
    public void reproduzirAudio() {
        reproduzirAudio.reproduzir();
    }
}

public class questao1Vitrola {
    public static void main(String[] args) {
        ReproduzirAudio leitorCD = new LeitordeCD();
        ReproduzirAudio tocaVinil = new TocadorVinil();

        DispositivoDeAudio dispositivoCD = new AdaptadorDeAudio(leitorCD);
        DispositivoDeAudio dispositivoVinil = new AdaptadorDeAudio(tocaVinil);

        dispositivoCD.reproduzirAudio();
        dispositivoVinil.reproduzirAudio();
    }
}
