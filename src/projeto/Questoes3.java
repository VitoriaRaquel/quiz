package projeto;


import java.util.ArrayList;
import java.util.Random;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author 20171174010006
 */
class Questoes3 {
    private int num;
    ArrayList<Questao> questao = new ArrayList<Questao>();
    
    ///int op= this.num;
    ///Random gerador = new Random(1);
    ///int x = gerador.nextInt(16);
    
    public ArrayList<Questao> randomizar(){
        Random r = new Random();
        
        Questao y = new Questao();
        y.enunciado =" *(MACK) Calcule o valor do determinante: \n"
                + "|1 1 3 1|\n"
                + "|1 3 3 2|\n"
                + "|2 5 3 3|\n"
                + "|1 1 1 1|\n";
        y.a = "-4";
        y.b = "-2";
        y.c = "0";
        y.d = "1";
        y.e = "2";
        y.questaoCorreta=y.c;
        questao.add(y);

        //RESPOSTA: C*

        y.enunciado="Calcule o valor do determinante \n"
                + "| 2  3  -1  0 |\n"
                + "| 4 -2   1  3 |\n"
                + "| 1 -5   2  1 | \n"
                + "| 0  3  -2  6 |\n";
        y.a="13";
        y.b="14";
        y.c="24";
        y.d="1";
        y.e="-24";
        y.enunciado=y.a;
        questao.add(y);
               
              
       //RESPOSTA: A*

        y.enunciado="Calcule o valor do determinante \n"
                + "| 3  1  -2  1 |\n"
                + "| 5  2   2  3 |\n"
                + "| 7  4  -5  0 | \n"
                + "| 1 -1  11  2 |\n";
        y.a="110";
        y.b="107";
        y.c="108";
        y.d="-10";
        y.e="10";
        y.questaoCorreta=y.c;
        questao.add(y);
   //RESPOSTA: C*

        y.enunciado="Calcule o valor do determinante \n"
                + "| 4  0   0  0 |\n"
                + "| 2 -1   3  1 |\n"
                + "| 1 -3   2  1 | \n"
                + "| 0  2  -2  5 |\n";
              y.a="25";
              y.b="-1";
              y.c="200";
              y.d="210";
              y.e="-25";
              y.questaoCorreta=y.d;
              questao.add(y);
              
     //RESPOSTA: D*

        y.enunciado="- O determinante da matriz A abaixo vale 2 \n"
             +  " A=| a  b  c  d |\n"
             +   "  | e  f  g  h |\n"
             +  "   | i  j  k  l |\n"
             +  "   | m  n  o  p |\n"
        


             +"- Qual o valor do determinante da matriz B abaixo?\n"
                    +  "B =|-5a -5b -5c -5d|\n"
                        + "| m   n    o   p|\n"
                        + "|-2i -2j -2k -2l|\n"
                        + "| 3e  3f  3g  3h|\n";
        y.a="";
        y.b="";
        y.c="";
        y.d="";
        y.e="";
        questao.add(y);
        


        y.enunciado="Considere a seguinte matriz: |x 0 0 0|\n"
		+"                                |1 x 1 2|\n"
		+"                                |2 0 x 3|\n"
                +"                                |0 0 0 3|\n"

              +"Sabendo-se que det A = 81,podemos dizer que o valor de x²é: ";
        y.a="9";
        y.b="um numero par";
        y.c="maior que 100";
        y.d="menor que 7";
        y.e="um numero impar";
        y.questaoCorreta=y.d; 
        questao.add(y);
        //resposta d

        y.enunciado= " O determinante da matriz: |1 -1 2 0|\n" 
                    +"                           |0  3 4 0|\n" 
                    +"                           |5  1 2 0|\n" 
                    +"                           |0  0 0 1|\n"
               +"é igual a:";
        y.a="-48";
        y.b="-24";
        y.c="0";
        y.d="24";
        y.e="48";
        y.questaoCorreta=y.b;
        questao.add(y);
        //resposta: b*

        y.enunciado="o valor do determinante é:"
               + " |1 1 3 1| \n" 
               +"  |1 3 3 2|\n"
               +"  |2 5 3 3|\n"
               +"  |1 1 1 1|\n";
        y.a="-4";
        y.b="-2";
        y.c="0";
        y.d="1";
        y.e="2";
        y.questaoCorreta=y.c;
        questao.add(y);
       //resposta:c*

       y.enunciado="o valor do determinante é:"
               + " | 1  0  2 0| \n" 
               +"  | 3 -2  1 5|\n"
               +"  | 6  0 -1 4|\n"
               +"  |-5  0  3 2|\n";
        y.a="-100";
        y.b="156";
        y.c="154";
        y.d="0";
        y.e="-154";
        y.questaoCorreta=y.b;
        questao.add(y);
        
   //resposta: b
        y.enunciado="o valor do determinante é:"
                
               + " | 1 1 1 -1| \n" 
               +"  | 0 1 0  0|\n"
               +"  | 1 0 0  0|\n"
               +"  |-1 2 0  1|\n";
        y.a="1";
        y.b="2";
        y.c="0";
        y.d="-1";
        y.e="-2";
        y.questaoCorreta=y.d;
       //resposta: d
       questao.add(y);
        return questao;
    }
}
