package conversor_temperatura;

public class Temperatura {

	public static void main(String[] args) {
		
		double celsius;
		double fahrenheit;
		
		celsius = 25;
		
		fahrenheit = (9 * celsius + 160) / 5;
		
		System.out.println("Temperatura em Celsius: " + celsius);
		System.out.println("Temperatura em Fahrenheit: " + fahrenheit);
		
	}
}
