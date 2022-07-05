package aula1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;

import javax.swing.JOptionPane;

public class Aula1 {

	public static void main(String[] args) {
		// conceitos();
		// System.out.print("no main novamente");
		// variaveis();
		// conversao();
		// desvioConvencional();
		// estruturaControle();
		// arrays();
		// arrayLista();
		// listaLinkada();
		//listaHashMap();
		listaHashSet();
	}
	public static void listaHashSet() {
		//não aceita valores duplicados
		HashSet<String> cars = new HashSet<String>();
		cars.add("Volvo");
		cars.add("BMW");
		cars.add("Ford");
		
		for(String car : cars) {
			System.out.println(car);
		}
	}
	
	public static void listaHashMap() {
		HashMap<String, String> capitais = new HashMap<>();
		capitais.put("sc","Florianopolis");
		capitais.put("pr", "Curitiba");
		capitais.put("rs", "Porto Alegre");
		
		System.out.println(capitais.get("sc"));
		
		for(String Key : capitais.keySet()) {
			System.out.println("Chave: " + Key + " | Valores: " + capitais.get(Key));
		}
	}
	
	public static void listaLinkada() {
		//armazena os valores em containers
		LinkedList<String> cars = new LinkedList<>();
		cars.add("mobi");
		cars.add("Focus");
		
		imprimirLista(cars);
		cars.add(0, "chevete");
	}
	
	public static void arrayLista() {
		//simula o array
		ArrayList<String> cars = new ArrayList<>();
		cars.add("fusca");
		cars.add("Brasilia");
		cars.add("Kombi");
		
		imprimirLista(cars);
		
		cars.set(1,  "Chevete");
		
		imprimirLista(cars);
		cars.add("etios");
		cars.add("corola");
		
		imprimirLista(cars);
		
	}
	
	private static void imprimirLista(LinkedList<String> cars) {
		for(String car : cars) {
			System.out.println(car);
		}
	}
	
	public static void arrays() {
		String [] cars = {"fusca", "Kombi", "Brasilia", "tl"};
		System.out.println(cars);
		
		System.out.println();
		
		String [] frutas = new String[3];
		frutas[0] = "maçã";
		frutas[1] = "banana";
		frutas[2] = "laranja";
		
		for(int i = 0; i < frutas.length; i++) {
			System.out.println(frutas[i]);
		}
	}
	
	public static void estruturaControle() {
		int x = 0;
		System.out.println(x < 5);
		
		while (x < 5) {
			System.out.println("Linha  " + x);
			x++;
		}
		System.out.println("Next line to for");
		
		int i;
		for (i = 0; i <5; i++) {
			System.out.println("Linha for " + i);
		}
		System.out.println();
		
		//executa o teste logico no final do bloco de comando
		int z = 9;
		do {
			System.out.println("Linha do " + z);
			z++;
		} while(z < 5);
	}
	
	public static void desvioConvencional() {
		int numero = 19;
		if( numero < 18 ) {
			System.out.println(numero + " é menor que 18");
		} else if (numero > 18) {
			System.out.println(numero + " é maior que 18");
		}
		else {
			System.out.println(numero + " é igual a 18");
		}
	}
	
	public static void conversao() {
		byte idade;
		
		idade = Byte.parseByte(JOptionPane.showInputDialog("Informe a idade"));
		
		JOptionPane.showMessageDialog(null, "sua idade é: " + idade);
		System.out.println(idade);
		
		
		float peso = Float.parseFloat(JOptionPane.showInputDialog("Informe peso"));
		JOptionPane.showMessageDialog(null, "seu peso é: " + peso);
		 
		double altura = Double.parseDouble(JOptionPane.showInputDialog("Informe sua altura"));
		JOptionPane.showMessageDialog(null, "Sua altura é: " + altura);
		
		float nota = 9.8f;
		double notad = 9.8;
		String notaString = String.valueOf(nota);
		System.out.println(notaString);
	}

	//casesensitive maiuscula <> minuscula
	public static void variaveis() {
		
		String nome;
		String sobrenome;
		
		nome = JOptionPane.showInputDialog("Informe nome");
		sobrenome = "Feldhaus";
		String endereçoDoCliente;
		
		String nomeCompleto = nome + " " + sobrenome;
		
		System.out.println(nomeCompleto);
	}
	
	public static void conceitos() {
		Aula2 obj; //declara um obj
		obj = new Aula2(); //instancia um obj
		obj = soma();
		
		//tipos primitivos:
		float x;
		double d;
		int print;
		
		// se colocar "x." não recebemos nenhum metodo
		
		//tipos complexos:
		Float y;
		Double z;
		Integer cInt;
		
		// se colocar "y." recebemos indicações de metodos
		
		//conversores classes wrapper
		String nota = "10";
		
		System.out.println("Aula de conceitos");
	}
}
