
package Questao_9;

import GALS.*;
public class Questao_nine {

    
    public static void main(String[] args) {
        try{
          Lexico Analise_Lexica;
          Analise_Lexica = new Lexico("""
                                      int n1, n2, resultado;
                                      printf ("coloque os dois");
                                      scanf (n1);
                                      scanf (n2);
                                      resultado = (n1+(n2/2))/(((2*(1+1))*2)/2);
                                      printf (resultado);""");//4
          Sintatico Analisador_Sintatico = new Sintatico();
          Semantico Analisador_Semantico = new Semantico();
          Analisador_Sintatico.parse(Analise_Lexica, Analisador_Semantico);
          
        } catch(LexicalError | SyntaticError | SemanticError Erro){
            System.out.println("Comando não identificado. Erro: "+Erro);
        }
    }
    
}
