abstract class Individuos {

    protected int moedas = 10;
    abstract boolean contribuicao();
    abstract int value();

    public int getMoeda() {
        return this.moedas;
    }

    public void addMoedas(int quantidade) {
        this.moedas += quantidade;
    }
    
    public void removeMoedas() {
        this.moedas -= 1;
    }

    // public void probabilidadeRemoveMoedas() {
    //     this.moedas -= 1;
    // } 
}
