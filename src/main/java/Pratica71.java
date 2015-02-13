/**
 * UTFPR - Universidade Tecnológica Federal do Paraná
 * DAINF - Departamento Acadêmico de Informática
 * IF62C - Fundamentos de Programação 2
 * 
 * Template de projeto de programa Java usando Maven.
 * @author Wilson Horstmeyer Bogado <wilson@utfpr.edu.br>
 */
import utfpr.dainf.if62c.pratica.Jogador;
import utfpr.dainf.if62c.pratica.JogadorComparator;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Pratica71 {
    public static void main(String[] args) {
        
        ArrayList<Jogador> time = new ArrayList<>();   
        
        Scanner scanner = new Scanner(System.in);
        int numItens = -1, numJogador = -1;
        boolean Cond  = true;
        String nome;
        System.out.println("Qualquer número é valido, menos 0!");
        while(Cond){    
            System.out.print("Número de itens: ");
            if (scanner.hasNextInt()) {
                numItens = scanner.nextInt();
            } else {
                    System.out.println("Digite um número!");
                   }
            if(numItens == 0){
                Cond = false;
            }

                  while(numItens != 0){

                  System.out.print("Digite o numero do jogador: ");
                  numJogador = scanner.nextInt();
                  if(numJogador == 0){
                     numItens = 0;
                     Cond = false;
                  }
                  else{    
                  System.out.print("Digite o nome do jogador: ");
                  nome = scanner.next();
                  time.add(new Jogador(numJogador, nome));
                  numItens--;
                  }

                }
            JogadorComparator comparador = new JogadorComparator(false, true, false);
            Collections.sort(time,comparador);
            String format = "%3d %-20s";
            System.out.println("Num Nome");
            for (Jogador j: time) {
                System.out.println(String.format(format, j.getNumero(), j.getNome()));
            }


       }
    }
}
