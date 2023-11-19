
//O adapatador esta recebendo um Objeto generico
//não esta fazendo nenhum tipo de adaptação

abstract class DispositivoAudio {
    public abstract void reproduzir();
}

class LeitorCD extends DispositivoAudio {
    @Override
    public void reproduzir() {
        System.out.println("Reproduzindo CD de Engenheiros do Hawaii");
    }
}
class TocaVinil extends DispositivoAudio {
    @Override
    public void reproduzir() {
        System.out.println("Reproduzindo vinil de Engenheiros do Hawaii");
    }
}
interface SistemaAudio {
    void reproduzirAudio();
}
class AdaptadorAudio implements SistemaAudio {
    private final DispositivoAudio dispositivoAudio;

    public AdaptadorAudio(DispositivoAudio dispositivoAudio) {
        this.dispositivoAudio = dispositivoAudio;
    }

    @Override
    public void reproduzirAudio() {
        dispositivoAudio.reproduzir();
    }
}
public class questao1Vitrola {
    public static void main(String[] args) {
        DispositivoAudio leitorCD = new LeitorCD();
        DispositivoAudio tocaVinil = new TocaVinil();
        SistemaAudio sistemaCD = new AdaptadorAudio(leitorCD);
        SistemaAudio sistemaVinil = new AdaptadorAudio(tocaVinil);
        sistemaCD.reproduzirAudio();
        sistemaVinil.reproduzirAudio();

         //Deveria ser algo como isso:
            // public class AdapterCDtoVinil extends Vitrola {
        //     public String adapta(CD cd){
        //         return cd.conecta() + getConector();
        //     }
        // }


       // CD cd = new CD("Scorpions");

       // AdapterCDtoVinil adapter = new AdapterCDtoVinil();

        //System.out.println(adapter.adapta(cd));

    }
}
