public class Calculator {
    private float salaries;

    public Calculator(float salaries) {
        this.salaries = salaries;
    }
    public float setPayments(Operations training){
        return training.setPayments(salaries);
    }
}
