import java.util.Scanner;

public class Main
{
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		double mPessoa;
		double imposto;
		double imposto2;
		
		mPessoa= sc.nextDouble();
		
		if(mPessoa <= 2000){
		    System.out.printf("Isento");
		}else if(mPessoa >= 2000.01 && mPessoa <= 3000){
		    imposto=(mPessoa - 2000) * 0.08;
		    System.out.printf("R$ %.2f%n", imposto);
		}else if(mPessoa >= 3000.01 && mPessoa <= 4500){
		    imposto=(mPessoa - 3000);
		    imposto2=(imposto * 0.18) + 80;
		    System.out.printf("R$ %.2f%n", imposto2);
		}else if(mPessoa >= 4500.01){
		    imposto=(mPessoa - 4500);
		    imposto2=(imposto * 0.28) + 350;
		    System.out.printf("R$ %.2f%n", imposto2);
		}
		
		    sc.close();
		    
		    }
		}
