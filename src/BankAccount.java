public class BankAccount {
private  double amount;

    public double getAmount() {
        return amount;
    }
    public void deposit (double sum){
        amount = amount + sum;
        System.out.println("вы внесли счёт" + sum);
    }
public void withDraw (int sum) throws LimitException {
        if (sum > amount ){
            throw new LimitException("ошибка нет среств" + "у вас на считу",amount);
        }
        else {
            amount = amount - sum;
            System.out.println("вы сняли со счита " + sum);
        }
}

}
