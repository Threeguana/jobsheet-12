import java.util.Scanner;  
public class Tugas02 {  
    public static int totRekursif(int[] angka, int n) {  
        if (n == 0) {  
            return 0;  
        } else {  
            return angka[n - 1] + totRekursif(angka, n - 1);  
        }  
    }   
    public static int totInteratif(int[] angka) {  
        int total = 0;  
        for (int num : angka) {  
            total += num;  
        }  
        return total;  
    }  
    public static void main(String[] args) {  
        Scanner sc = new Scanner(System.in);  

        System.out.print("Masukkan jumlah angka yang ingin dihitung (N): ");  
        int n = sc.nextInt();  
        int[] angka = new int[n];  

        for (int i = 0; i < n; i++) {  
            System.out.print("Masukkan angka ke-" + (n - i) + ": ");  
            angka[i] = sc.nextInt();  
        }

        int rekursifHasil = totRekursif(angka, n);  
        System.out.println("Total dari " + n + " angka yang dimasukkan adalah: " + rekursifHasil);  
        
        sc.close();
    }  
}
