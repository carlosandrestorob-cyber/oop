/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.rolldices;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author PC
 */
public class RollDices {
    
public static int rollDices(){
    Random random = new Random();
    return random.nextInt(6)+1;
}

    public static void main(String[] args) {
        Scanner data = new Scanner (System.in);
        int lives= 5, dice1, dice2, suma, lanzamientos= 0, sumasPares= 0, sumasImpares= 0, dadosIguales= 0, rachaIguales= 0;
        String player_name, key;
        
        System.out.println(":::WELCOME TO ROLL DICES:::");
        System.out.println("Your player name: ");
        player_name = data.nextLine();
        
        while (lives > 0 && rachaIguales <3) {
            lanzamientos++;
            System.out.println("\nPress any key to roll dices !!!");
            key= data.nextLine();
            
            dice1 = rollDices();
            dice2 = rollDices();
            suma= dice1 + dice2;
            
            System.out.println("Jugador: " + player_name + " | Vidas: " + lives);
            System.out.println("Dado1 = " + dice1 + " | Dado2 = " + dice2 + " | Suma = " + suma);

            // Condiciones del juego
            if (suma % 2 == 0) {
                sumasPares++;
            } else {
                sumasImpares++;
                lives--;
                if (lives == 0) {
                    System.out.println("GAME OVER");
                    break;
                }
            }

            // Si ambos dados son iguales
            if (dice1 == dice2) {
                dadosIguales++;
                rachaIguales++;

                // Si son dos seis → gana una vida extra
                if (dice1 == 6 && dice2 == 6) {
                    lives++;
                    System.out.println("¡Par de seis! Ganas una vida extra. Vidas actuales: " + lives);
                }

                // Si logra tres lanzamientos consecutivos con dados iguales → gana
                if (rachaIguales == 3) {
                    System.out.println("YOU WIN");
                    break;
                }
            } else {
                rachaIguales = 0; // reinicia la racha si no son iguales
            }
        }

        // Informe final
        System.out.println("\n--- INFORME FINAL ---");
        System.out.println("Total de lanzamientos: " + lanzamientos);
        System.out.println("Total de sumas pares: " + sumasPares);
        System.out.println("Total de sumas impares: " + sumasImpares);
        System.out.println("Total de dados iguales: " + dadosIguales);
    }
}
