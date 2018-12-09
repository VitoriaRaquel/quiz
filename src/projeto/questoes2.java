package projeto;


import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author 20171174010010
 */
class questoes2 {
    private int num;
    ArrayList<Questao> questao = new ArrayList<Questao>();
    
    ///int op= this.num;
    ///Random gerador = new Random(1);
    ///int x = gerador.nextInt(16);
    
    public ArrayList<Questao> Questao1(){
        Questao w = new Questao();
        w.enunciado="Resolva a equação \n"
                + "|1 0 2|\n"
                + "|2 4 1|\n"
                + "|3 2 0|\n";
        w.a="";
        w.b="";
        w.c="";
        w.d="-18";
        w.e="";
        w.questaoCorreta=w.d;
        questao.add(w);


        w.enunciado= "Calcule a determinante da seguinte matriz de ordem 3: \n"
                + "|1 1 2|\n"
                + "|2 1 3|\n"
                + "|1 4 2|\n";
         w.a="";
         w.b="";
         w.c="3";
         w.d="";
         w.e="";
         w.questaoCorreta=w.c;
         questao.add(w);

      w.enunciado= "Descubra a determinante da matriz abaixo usando a lei de Sarrus: \n"
                + "|3 -1 -2|\n"
                + "|2  1  1|\n"
                + "|2  1 -2|\n";
        w.a="-15";
        w.b="";
        w.c="";
        w.d="";
        w.e="";
        w.questaoCorreta=w.a;
        questao.add(w);

       w.enunciado="Qual é o determinante de E? \n"
                + "|2 0 4|\n"
                + "|1 0 4|\n"
                + "|4 4 2|\n";
        w.a="";
        w.b="-40";
        w.c="";
        w.d="";
        w.e="";
        w.questaoCorreta=w.b;
        questao.add(w);

       w.enunciado="Qual é o determinante de A? \n"
                + "|-2  1  0|\n"
                + "| 3  4  0|\n"
                + "|10 -8  0|\n";
        w.a="";
        w.b="";
        w.c="0";
        w.d="";
        w.e="";
        w.questaoCorreta=w.c;
        questao.add(w);

       w.enunciado="Calcule o determinante de Vandermonde  ? \n"
                + "|1 1 1|\n"
                + "|2 3 5|\n"
                + "|4 9 25|\n";
        w.a="";
        w.b="6";
        w.c="";
        w.d="";
        w.e="";
        w.questaoCorreta=w.b;
        questao.add(w);

       w.enunciado="Calcule o determinante de Vandermonde  ? \n"
                + "| 1 1  1|\n"
                + "| 2 3 4|\n"
                + "| 4 9 36 |\n";
        w.a="180";
        w.b="";
        w.c="";
        w.d="";
        w.e="";
        w.questaoCorreta=w.a;
        questao.add(w);

       w.enunciado="Calcule o determinante de Vandermonde  ? \n"
                + "| 1 1  1|\n"
                + "| 4 6 9 |\n"
                + "| 4 9 36|\n";
        w.a="";
        w.b="";
        w.c="30";
        w.d="";
        w.e="";
        w.questaoCorreta=w.c;
        questao.add(w);


       w.enunciado="Calcule o determinante de Vandermonde  ? \n"
                + "|   1         1         1       |\n"
                + "|  log2     log20     log200    |\n"
                + "| (log2)^2 (log20)^2 (log200)^2 |\n";
        w.a="";
        w.b="";
        w.c="";
        w.d="2";
        w.e="";
        w.questaoCorreta=w.d;
        questao.add(w);

               
       w.enunciado="Calcule o valor de x, a fim de que o determinante da matriz A seja nulo. ? \n"
                + "|1 2 1|\n"
                + "|4 9 4|\n"
                + "|6 x x-7|\n";
        w.a="";
        w.b="x=13";
        w.c="";
        w.d="";
        w.e="";
        w.questaoCorreta=w.b;
        questao.add(w);

      w.enunciado="Considere a matriz S = "
                    + "( S11 S12  S13)\n" +" dada por Sij = {0, se i<j}\n" + "Então, resolva a inequação det S > 3x²."
                    +" ( S21 S22  S23)\n"                 +"{i+j, se i=j} ?\n"
                    +" ( S31 S32  S33)\n"                 +"{i-j, se i>j} \n";
        w.a="";
        w.b="";
        w.c="-4< x >4";
        w.d="";
        w.e="";
        w.questaoCorreta=w.c;
        questao.add(w);
               

      w.enunciado= "Calcule o determinante \n"
                + "|-1  2  9|\n"
                + "| 4  7 10|\n"
                + "| 0  0  0|\n";
        w.a="0";
        w.b="";
        w.c="";
        w.d="";
        w.e="";
        w.questaoCorreta=w.a;
        questao.add(w);

      w.enunciado="Calcule o determinante da matriz triangular \n"
                + "| 2  0  0 |\n"
                + "| 2  3  0 |\n"
                + "|-4  5 -7 |\n";
        w.a="";
        w.b="-42";
        w.c="";
        w.d="";
        w.e="";
        w.questaoCorreta=w.b;
        questao.add(w);

      w.enunciado="Qual o determinante da matriz aseguir: \n"
                + "|   1        1          1     |\n"
                + "| log2     log20     log200   |\n"
                + "|(log2)^2 (log20)^2 (log200)^2|\n";
        w.a="";
        w.b="";
        w.c="";
        w.d="2";
        w.e="";
        w.questaoCorreta=w.d;
        questao.add(w);
        
      w.enunciado="Sabendo que A é uma matriz quadrada de ordem 3 e que o determinante de A é -2, calcule o valor do determinante da matriz 3A. \n";
        w.a="-54";
        w.b="";
        w.c="";
        w.d="";
        w.e="";
        w.questaoCorreta=w.a;
        
    questao.add(w);
    return null;


    
}}
