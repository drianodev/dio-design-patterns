package br.com.drianodev.strategy;

public class Robo {

    // strategy
    private Comportamento comportamento;

    public void setComportamento(Comportamento comportamento) {
        this.comportamento = comportamento;
    }

    public void mover () {
        comportamento.mover();
    }
}
