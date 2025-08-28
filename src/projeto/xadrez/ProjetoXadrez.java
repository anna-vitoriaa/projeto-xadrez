/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package projeto.xadrez;

import Tabuleiro.Posicao;
import Tabuleiro.Tabuleiro;
import xadrez.PartidaDeXadrez;
import xadrez.PecaDeXadrez;

/**
 *
 * @author USer
 */
public class ProjetoXadrez {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Tabuleiro tab = new Tabuleiro(8, 8);
        PartidaDeXadrez px = new PartidaDeXadrez();
        UI.imprimirTabuleiro(px.MostrarPecas());
        
    }
    
}
