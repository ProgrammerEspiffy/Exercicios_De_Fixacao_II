package Entities;

public class Account {
    //Variáveis da Conta
    private int number;
    private String holder;
    private double balance;

    //Caso o Usuário não queira fazer o Depósito inicial
    public Account(int number, String holder) {
        this.number = number;
        this.holder = holder;
    }

    //Caso o Usuário queira fazer o Depósito Inicial
    public Account(int number, String holder, double initialDeposit) {
        this.number = number;
        this.holder = holder;
        deposit(initialDeposit);
        /*Regra de Negócio:
        * Caso o Banco queira uma Taxa de Depósito
        * O Programador porderá adicionar (Depósito - "Taxa")
        * */
    }

    //Pegar Número e Nome da pessoa
    public int getNumber() {
        return number;
    }

    public String getHolder() {
        return holder;
    }

    //Mudar o Nome
    public void setHolder(String holder) {
        this.holder = holder;
    }

    //Pegar o Saldo
    public double getBalance() {
        return balance;
    }

    //Operação para Fazer o Depósito
    public void deposit(double amount) {
        balance += amount;
    }

    //Operação para Fazer o Saque
    public void withdraw(double amount) {
        balance -= amount + 5.0;
    }

    //to String é para Fazer a formatação de Código para Texto
    public String toString(){
        return "Account "
                + number
                + ", Holder: "
                + holder
                + ", Balance: $ "
                + String.format("%.2f", balance);
    }

}
