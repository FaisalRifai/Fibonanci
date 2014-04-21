import javax.swing.*;
class Fibonanci{
	public static void main (String [] args){
		int t = 1, p = 1, hasil = 0;
		String s = JOptionPane.showInputDialog("Masukkan banyak deret fibonannci : ");
		int x = Integer.parseInt(s);
		for(int i=1; i<=x; i++){
			t = p;
			p = hasil;
			System.out.print(hasil+"");
			hasil=t+p;
		}
	}
}
