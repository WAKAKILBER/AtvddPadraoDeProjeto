package questao2;
class Veiculo {
    private final String modelo;
    private final boolean direcaoHidraulica;
    private final boolean vidroEletrico;
    private final boolean sistemaSom;
    private final boolean tetoSolar;
    private final boolean arCondicionado;

    private Veiculo(ConstrutorVeiculo construtor) {
        this.modelo = construtor.modelo;
        this.direcaoHidraulica = true;  // Obrigatório
        this.vidroEletrico = true;      // Obrigatório
        this.sistemaSom = construtor.sistemaSom;
        this.tetoSolar = construtor.tetoSolar;
        this.arCondicionado = construtor.arCondicionado;
    }

    public String toString() {
        return "Veiculo " + modelo +
                " - Direção Hidráulica: " + direcaoHidraulica +
                ", Vidro Elétrico: " + vidroEletrico +
                ", Sistema de Som: " + sistemaSom +
                ", Teto Solar: " + tetoSolar +
                ", Ar Condicionado: " + arCondicionado;
    }

    static class ConstrutorVeiculo {
        private final String modelo;
        private boolean sistemaSom = false;
        private boolean tetoSolar = false;
        private boolean arCondicionado = false;

        ConstrutorVeiculo(String modelo) {
            this.modelo = modelo;
        }

        ConstrutorVeiculo adicionarSistemaSom() {
            this.sistemaSom = true;
            return this;
        }

        ConstrutorVeiculo adicionarTetoSolar() {
            this.tetoSolar = true;
            return this;
        }

        ConstrutorVeiculo adicionarArCondicionado() {
            this.arCondicionado = true;
            return this;
        }

        Veiculo construir() {
            return new Veiculo(this);
        }
    }
}


public class questao2Carro {
    public static void main(String[] args) {
        Veiculo veiculo1 = new Veiculo.ConstrutorVeiculo("Sedan")
                .adicionarSistemaSom()
                .adicionarArCondicionado()
                .construir();

        Veiculo veiculo2 = new Veiculo.ConstrutorVeiculo("SUV")
                .adicionarTetoSolar()
                .adicionarArCondicionado()
                .construir();


        System.out.println(veiculo1);
        System.out.println(veiculo2);
    }
}