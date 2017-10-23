/* Modificado po Yair Reyes*/

public class OperacionBinaria{
	private int numero1;
	private int numero2;

//Constructor sin parametros

public OperacionBinaria(){
	numero1=0;
	numero2=0;

}

//Constructor con dos parametros que inicializan los atributos

public OperacionBinaria(int numero1, int numero2){
	this.numero1=numero1;
	this.numero2=numero2;
}


/*Metodo suma() sin parametros
Calcula la suma de 2 numeros enteros
@return[entero]
*/

public int Suma(){
	return numero1 + numero2;
}

public void setNumero1(int numero1){
	this.numero1 = numero1;
}

public void setNumero2(int numero2){
	this.numero2 = numero2;
}

public int multiplicar(){
	return numero1 * numero2;
}

}
