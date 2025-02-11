public class Conta {
    private final int Numero;
    private final String Agencia;
    private final String NomeCliente;
    private final double Saldo;

    public Conta(int numero, String agencia, String nomeCliente, double saldo) {
        this.Numero = numero;
        this.Agencia = agencia;
        this.NomeCliente = nomeCliente;
        this.Saldo = saldo;
    }

    @Override
    public String toString() {
        return "Olá " + this.getNomeCliente() +
                ", obrigado por criar uma conta em nosso banco, sua agência é " + this.getAgencia() +
                ", conta " + this.getNumero() +
                " e seu saldo " + this.getSaldo() +
                " já está disponível para saque.";
    }

    public int getNumero() {
        return Numero;
    }

    public String getAgencia() {
        return Agencia;
    }

    public String getNomeCliente() {
        return NomeCliente;
    }

    public double getSaldo() {
        return Saldo;
    }
}
