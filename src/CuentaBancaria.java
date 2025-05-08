public class CuentaBancaria {
    private String numeroCuenta;
    private String nombreTitular;
    private double saldo;
    private String tipoCuenta;

    public CuentaBancaria() {
        this.saldo = 100.000;
    }

    public CuentaBancaria(String numeroCuenta, String nombreTitular, String tipoCuenta) {
        this.numeroCuenta = numeroCuenta;
        this.nombreTitular = nombreTitular;
        this.tipoCuenta = tipoCuenta;
        this.saldo = 100.000;
    }



    public String getNumeroCuenta() {
        return numeroCuenta;
    }

    public void setNumeroCuenta(String numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }

    public String getNombreTitular() {
        return nombreTitular;
    }

    public void setNombreTitular(String nombreTitular) {
        this.nombreTitular = nombreTitular;
    }

    public double getSaldo() {
        return saldo;
    }


    public String getTipoCuenta() {
        return tipoCuenta;
    }

    public void setTipoCuenta(String tipoCuenta) {
        this.tipoCuenta = tipoCuenta;
    }


    public void mostrarInformacion() {
        System.out.println("Cuenta N°: " + numeroCuenta);
        System.out.println("Titular: " + nombreTitular);
        System.out.println("Tipo de cuenta: " + tipoCuenta);
        System.out.println("Saldo: $" + saldo);
    }
}
