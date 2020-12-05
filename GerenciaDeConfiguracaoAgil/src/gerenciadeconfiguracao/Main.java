package gerenciadeconfiguracao;

public class Main {

	public static void main(String[] args) {
		Valores vl = new Valores();
		System.out.println(vl.ins(1));
		System.out.println(vl.size());
		System.out.println(vl.ins(2));
		System.out.println(vl.size());
		System.out.println(vl.del(0));
		System.out.println(vl.size());
		System.out.println(vl.del(1));
		System.out.println(vl.size());

	}

}
