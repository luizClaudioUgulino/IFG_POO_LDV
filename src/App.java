import java.util.ArrayList;
import java.util.Scanner;
//System.out.println("");
public class App {
    public static void main(String[] args) throws Exception {
        
    

        Scanner sc = new Scanner(System.in);
        ArrayList<Locadora> lcd = new ArrayList<Locadora>();
         boolean loop = false;

        while(loop == false){
            println("/////////////////////////////////////////////////////////");
            println("Olá seja bem vindo ao sistema de gestão de locadora");
            println("Já Possui Locadora ? -(1), ou gostaria de cadastrar uma ? - (2)");
            println("Se caso quizer sair n° -(3)");
            println("/////////////////////////////////////////////////////////");
            int escolha = sc.nextInt();
           
            switch (escolha){
                case 1 :
                println("Poderia digitar nome Locadora ?");
                String nomeLocadora = sc.next();
                int idDaLocadora = 0;
                
                for(int x = 0; x < lcd.size();x++){

                    if(lcd.get(x).getNome().equals(nomeLocadora)){
                        idDaLocadora = x;
                     ///   println("encontrou!!");
                    }
                }
            
                println("/////////////////////////////////////////////////////////");
                System.out.println("Seja bem vindo " + lcd.get(idDaLocadora).getNome() +" Ao seu sistema de gestão Locadora");
                
                while(loop == false){
                println("quais atividades vai Desejar :");
                println(" Emprestimo - (1) / Cadastro de veículo - (2) / Cadastrar Cliente - (3) / Devolução - (4) ");
                println("Para sair escolha -(5)");
                escolha = sc.nextInt();

                switch (escolha){
                    case 1 :
                    println("emprestimo");
                    break;

                    case 2:
                    println("cadastrodo de veiculo");
                    break;

                    case 3:
                    println("cadastrar cliente");
                    break;

                    case 4:
                    println("devolução");
                    break;

                    case 5: 
                    loop = true;
                    break;
                }

                
            }
                loop = false;
                break;

                case 2 :
                println("Vamos estar criando sua Locadora, Poderia estar fornecendos os seguintes dados :");
                String[] dados = {"nome","endereco", "telefone"};
                
                for(int x =0 ; x < dados.length; x++){
                    System.out.println("por favor digita " + dados[x]);
                    dados[x] = sc.next();
                }
                Locadora lc = new Locadora(dados[0], dados[1], dados[2]);
                lcd.add(lc);
                

                break;

                case 3 :
                loop =true;
                break;
            }

        }
    }

    public static void println(String valor){
        System.out.println(valor);
    }



}
