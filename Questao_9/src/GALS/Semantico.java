package GALS;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Stack;

public class Semantico implements Constants {
    Stack<Integer> Pilha = new Stack<>();
    Map<String, Integer> Variaveis_Valor;
    String VariavelAtual;
    Scanner leitor = new Scanner(System.in);
    

    public Semantico(){
        this.Variaveis_Valor  = new HashMap<>();
    }
    
    public void executeAction(int action, Token token) throws SemanticError {
        System.out.println("Ação #" + action + ", Token: " + token);
        Integer n1, n2;
//        System.out.println(Variaveis_Valor);
        switch (action) {
            case 1 -> {
                VariavelAtual = token.getLexeme();

                if (!Variaveis_Valor.containsKey(VariavelAtual)){
                    Variaveis_Valor.put(VariavelAtual,0);
                                }

//                System.out.println("---------"+ VariavelAtual);

            }
            
            case 2->{
                Pilha.push(Integer.parseInt(token.getLexeme()));
            }
            case 3 -> {
                n2 = Pilha.pop();
                n1 = Pilha.pop();
                Pilha.push(n1*n2);

            }
            case 4 -> {
                n2 = Pilha.pop();
                n1 = Pilha.pop();
                Pilha.push(n1/n2);
            }
            case 5 -> {
                n2 = Pilha.pop();
                n1 = Pilha.pop();
                Pilha.push(n1+n2);
            }
            case 6 -> {
                n2 = Pilha.pop();
                n1 = Pilha.pop();
                Pilha.push(n1-n2);
            }
            
//            case 16 ->{
//                Variaveis_Valor.put(VariavelAtual, Pilha.pop());
//            }
//            case 8 -> {
//               VariavelAtual = token.getLexeme();
//               System.out.println("---------"+ VariavelAtual);
//            }
//            case 7 -> {
//                System.out.println("coloque os dois");
//            }
            case 13 -> {
                n1 = leitor.nextInt();
                Variaveis_Valor.put(VariavelAtual, n1);

                Pilha.push(n1);
                
            }
            case 15 -> {
                
                n2 = leitor.nextInt();
                Pilha.push(n2);
                Variaveis_Valor.put(VariavelAtual, n2);
            }
            case 10 ->{
                System.out.println("Coloque os dois numeros: ");
            }            
            
//            }
////            //case 20 -> Variaveis_Valor.put(VariavelAtual, Pilha.pop());
////            //case 21 -> VariavelAtual = token.getLexeme();
            case 18 -> {
//                System.out.println(Variaveis_Valor.get(VariavelAtual) );
                Variaveis_Valor.put(VariavelAtual,Pilha.pop());

                System.out.println(Variaveis_Valor);
                System.out.println(Variaveis_Valor.get(VariavelAtual) );
            }
        }
    
        
         }
}


