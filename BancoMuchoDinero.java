/**
 * @author Leo V
 * @version 1.1
 * @since 2024
 * @param argumentos de la línea de comandos
 */

 public class BancoMuchoDinero {

    public static void main(String[] args) {

        // Crear instancias de las cuentas
        Cuenta cuentaPP = new Cuenta("301-2", 3330.49, "Ahorros");
        Cuenta cuentaLL = new Cuenta("390-3", 5040.99, "Corriente");

        // Simular acciones de Pepe Pérez
        System.out.println("El señor Pepe Pérez se acerca al cajero.");
        cuentaPP.consultarSaldo();

        // Simular acciones de Lola López
        System.out.println("La señora Lola López se acerca al cajero.");
        cuentaLL.retirar(200000);
        cuentaLL.consultarSaldo();
    }
}

class Cuenta {
    private String numeroCuenta;
    private double saldo;
    private String tipoCuenta;

    public Cuenta(String numeroCuenta, double saldo, String tipoCuenta) {
        this.numeroCuenta = numeroCuenta;
        this.saldo = saldo;
        this.tipoCuenta = tipoCuenta;
    }

    public void consultarSaldo() {
        System.out.println("El número de cuenta es: " + numeroCuenta);
        System.out.println("El saldo de la cuenta es de: " + saldo);
        System.out.println("El tipo de cuenta es: " + tipoCuenta);
    }

    public void retirar(double monto) {
        if (saldo >= monto) {
            saldo -= monto;
            System.out.println("Se han retirado $" + monto + ". El nuevo saldo es de: " + saldo);
        } else {
            System.out.println("Saldo insuficiente para retirar $" + monto);
        }
    }
}