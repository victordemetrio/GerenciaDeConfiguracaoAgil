import java.util.ArrayList;

public class Valores implements ValoresITF{
	
	ArrayList<Integer> valores = new ArrayList();//trocar pra arry.... nem lembro como usar kk
	

	@Override
	public boolean ins(int v) {
		valores.add(v);
		if(valores.contains(v)) {
			return true;
		};
		return false;
	}

	@Override
	public int del(int i) {
		valores.remove(i);
		if(valores.contains(i)) {
			return i;
		}
		return -1;
	}

	@Override
	public int size() {
		int tamanho = valores.size();
		if (tamanho==0) {
			return -1;
		} 
		return tamanho;
	}

}
