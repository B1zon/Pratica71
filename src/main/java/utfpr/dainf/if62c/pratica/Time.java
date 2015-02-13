/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utfpr.dainf.if62c.pratica;
import java.util.HashMap;
import java.util.Collections;
import java.util.List;
/**
 *
 * @author b1zon_000
 */
public class Time {
       private final HashMap<String, Jogador> jogadores = new HashMap<>();

       public HashMap<String, Jogador> getJogador(){
              return jogadores;
       }
       public void addJogador(String posicao,Jogador nome){
              jogadores.put(posicao, nome);
       }
       public List ordena(JogadorComparator comparador){
        List<Jogador> time = null;
        Collections.sort(time ,comparador);
        String format = "%3d %-20s";
        System.out.println("Num Nome");
        for (Jogador j: time) {
            System.out.println(String.format(format, j.getNumero(), j.getNome()));
        }
        return time;
       }
       
}
