package gerenciadeconfiguracao;
import java.util.ArrayList;

public class Valores implements ValoresITF{
	
	int valores[] = new int [10];
	

	@Override
	public boolean ins(int v) {
		for(int i =0; i <valores.length; i++) {
			if(valores[i]==0) {
				valores[i]=v;
				return true;
			}
		}
		return false;
	}

	@Override
	public int del(int i) { //"i" valor da posiçao do array
		int aux =0;
		boolean flag = false;
		for(int a = 0; a < valores.length; a++) {
			if(valores[a]!=0) {
				flag = true;
			}
		}
		if(flag) {
			if(i >=0 && i<=9) {
				aux =valores[i];
				valores[i] = 0;
			}
			return aux;
		}else {
			return -1;
		}
		
	}

	@Override
	public int size() {
		int tamanho = 0;
		for(int i =0; i <valores.length; i++) {
			if(valores[i]!=0){
				tamanho = tamanho +1;
			}
		}
		return tamanho;
	}

}
