//clase de prueba para SumaMulti
public class testSum
{
public static void main(String[] args) {

    SumaMulti suma = new SumaMulti();

    suma.setNumero1(1);
    suma.setNumero2(2);
    System.out.println("El resultado de la suma es: " + suma.Suma());
    System.out.println("El resultado de la multiplicacion es: " + suma.multiplicar());
}
}
