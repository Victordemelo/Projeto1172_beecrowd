/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

/**
 *
 * @author victo
 */
import java.util.Scanner;

public class Projeto1172 {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        int posicao;
        int X[] = new int[10];

        for (int i = 0; i < X.length; i++) {
            X[i] = leitor.nextInt();
            posicao = i;

            if (X[i] <= 0) {
                X[i] = 1;
            }
            System.out.println("X[" + posicao + "] = " + X[i]);
        }
    }
}
