/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package desafio;

import java.util.Scanner;

/**
 *
 * @author mpeht
 */
public class Desafio {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        //vetoores pré estabelecidos
        int indice[] = {0, 1, 2, 3, 4, 5, 6, 7, 8};
        int valor[] = {4, 6, 5, 8, 1, 7, 3, -1, 2};
        int i, aux;

        System.out.println("Digite um algarismo de 0 a 8:");
        i = sc.nextInt();

        if (i >= 0 && i <= 8) {
            do {
                System.out.print(indice[i] + " - " + valor[i] + " / ");
                aux = valor[i];
                i = aux;

            } while (valor[i] != -1);
        }else{
            System.out.println("Digite de qualquer número de 0 a 8");
        }
    }
}
