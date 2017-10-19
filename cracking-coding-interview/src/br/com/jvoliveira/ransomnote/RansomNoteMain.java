package br.com.jvoliveira.ransomnote;

import java.util.Scanner;

public class RansomNoteMain {

	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int m = scanner.nextInt();
        int n = scanner.nextInt();
        
        // Eat whitespace to beginning of next line
        scanner.nextLine();
        
        RansomNote s = new RansomNote(scanner.nextLine(), scanner.nextLine());
        scanner.close();
        
        boolean answer = s.solve(n,m);
        if(answer)
            System.out.println("Yes");
        else System.out.println("No");
      
    }
	
}
