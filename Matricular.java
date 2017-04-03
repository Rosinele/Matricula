package alunotop;

import java.util.Scanner;

public class Matricular {

	public static void main(String[] args) {	
		matricular();
		
	}
	public static void matricular(){
			Scanner sc = new Scanner(System.in);
			Aluno a1 = new Aluno();
    		
			System.out.println("Digite o nome do aluno:");
			a1.setNome(sc.nextLine());
			System.out.print("Digite a matricula do aluno: ");
    		a1.setMatricula(Integer.parseInt(sc.nextLine()));
			System.out.println("\nDigite a data de Nascimento do aluno:");
			a1.setDt_nasc(sc.nextLine());
			System.out.println("\nDigite o nome da Mãe do aluno:");
			a1.setMae(sc.nextLine());
			System.out.println("\nDigite o nome do Pai do aluno:");
			a1.setPai(sc.nextLine());
			
			a1.imprimmir();
		}
	
	

}
