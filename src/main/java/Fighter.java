public class Fighter {
    private float salaries;

    public float getSalaries() {
        return salaries;
    }

    public void setSalaries(float salaries) {
        this.salaries = salaries;
    }
    public void paymentsFightofNight(float salaries) {
        Calculator calculadora = new Calculator(salaries);
        this.salaries = calculadora.setPayments(new OperationsFightofNight());
    }
    public void paymentsKOofNight(float salaries) {
        Calculator calculadora = new Calculator(salaries);
        this.salaries = calculadora.setPayments(new OperationsKOofNight());
    }
    public void paymentsSubmissionofNight(float salaries) {
        Calculator calculadora = new Calculator(salaries);
        this.salaries = calculadora.setPayments(new OperationsSubmissionofNight());
    }
    public void paymentsFailedWeighing(float salaries) {
        Calculator calculadora = new Calculator(salaries);
        this.salaries = calculadora.setPayments(new OperationsFailedWeighing());
    }
}
/*
public class Player {
    private float dano;

    public float getDano() {
        return dano;
    }

    public void danoGolpeRapido(float forca, float velocidade) {
        Espada calculadora = new Espada(forca, velocidade);
        this.dano = calculadora.calcularDano(new HabilidadeRapida());
    }

    public void danoGolpeForte(float forca, float velocidade) {
        Espada calculadora = new Espada(forca, velocidade);
        this.dano = calculadora.calcularDano(new HabilidadeForte());
    }

    public void danoGolpeGiratorio(float forca, float velocidade) {
        Espada calculadora = new Espada(forca, velocidade);
        this.dano = calculadora.calcularDano(new HabilidadeGiratoria());
    }

    public void danoGolpeAereo(float forca, float velocidade) {
        Espada calculadora = new Espada(forca, velocidade);
        this.dano = calculadora.calcularDano(new HabilidadeAerea());
    }

}
*/