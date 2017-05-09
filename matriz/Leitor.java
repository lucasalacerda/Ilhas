package matriz;

import java.io.File;
import java.util.Scanner;

public class Leitor {
	
	int x = 0;
	int y = 0;
		
	public int[][] lerArquivo() {
		int matriz[][];
		String linha;
		int a = 0;
		int b = 0;
		
		try {
			Scanner file = new Scanner(new File("src/files/example_1.txt"));
			x = file.nextInt(); 
			y = file.nextInt();
			matriz = new int[x][y];
			linha = file.nextLine();
			while (file.hasNext()) {
				for (int i = 0; i < y; i++) {				
					linha = file.nextLine(); 
					a = 0;
					b = 1;
					for (int j = 0; j < x; j++) {
						int valor = Integer.parseInt(linha.substring(a, b));	
						matriz[j][i] = valor;
						a++;
						b++;
					}
				}
			}	
			file.close();
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
		return matriz;
	}

	public int getLargura(){
		return x;
	}
	
	public int getAltura() {
		return y;
	}
}