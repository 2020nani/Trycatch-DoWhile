import java.util.Scanner;

import javax.swing.JOptionPane;

public class exceptionTratment {
static String voo;
static String auxx;
static int decisao;
static double peso;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String aux = JOptionPane.showInputDialog(null, "Digite numero do voo");
		voo = String.format(aux);
		try {
		String aux1 = JOptionPane.showInputDialog(null, "Digite o peso da bagagem");
	    peso = Double.parseDouble(aux1);
		}catch(Exception e) {
			JOptionPane.showMessageDialog(null,"Apenas numeros e . antes casa decimal");
		}
		System.out.println( "Digite 1 para continuar e 0 para terminar pesagem da bagagem");
		decisao = sc.nextInt();
		do {
			try {
				String aux3 = JOptionPane.showInputDialog(null, "Digite o peso da bagagem");
			    peso = Double.parseDouble(aux3)+peso;
				}catch(Exception e) {
					JOptionPane.showMessageDialog(null,"Apenas numeros e . antes casa decimal");
				}
			System.out.println( "Digite 1 para continuar e 0 para terminar pesagem da bagagem");
			decisao = sc.nextInt();
		}while (decisao == 1); 
	
		System.out.println("Voo N: " + voo + "  Peso:  " + peso);
		sc.close();
	}
	}


