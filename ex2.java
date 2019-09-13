/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author matheus.bmelo
 */
public class ex2 {

    public static void main(String[] args) {
        int v[] = {3, 5, 9, 11, 15, 17, 19, 0};
        int valor = 6;
        inserir(v, valor);
        bolha(v);
        ler(v);

    }

    public static void ler(int v[]) {
        for (int i = 0; i < v.length; i++) {
            System.out.println("[" + i + "]" + "=" + v[i] + " ");

        }
    }

    public static void inserir(int v[], int valor) {

        for (int i = 0; i < v.length; i++) {
            if (v[i] == 0) {
                v[i] += v[i] + valor;
            }

        }

    }

    public static void bolha(int v[]) {
        for (int k = 1; k < v.length; k++) {
            for (int i = 0; i < v.length - k; i++) {
                if (v[i] > v[i + 1]) {
                    int tmp = v[i];
                    v[i] = v[i + 1];
                    v[i + 1] = tmp;
                }

            }
        }
    }
}
