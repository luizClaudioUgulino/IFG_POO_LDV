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
            println("OLÁ BEM VINDO AO SISTEMA DE LOCADORA");
            println("ENTRAR NO SEU SISTEMA -(1) / CADASTRAR UMA LOCADORA - (2) / FECHAR-(3)");
            println("/////////////////////////////////////////////////////////");
            int escolha = sc.nextInt();
           
            //// função de escolha das opções acima
            switch (escolha){
                case 1 :
                println("/////////////////////////////////////////////////////////");
                println("PODERIA INFORMAR NOME DA SUA LOCADORA ?");
                String nomeLocadora = sc.next();
                int idDaLocadora = 0;
                
                for(int x = 0; x < lcd.size();x++){

                    if(lcd.get(x).getNome().equals(nomeLocadora)){
                        idDaLocadora = x;
                    }
                }
            
                println("/////////////////////////////////////////////////////////");
                System.out.println("SEJA BEM VINDO " + lcd.get(idDaLocadora).getNome() +" AO SISTEMA DE LOCADORA");
                
                while(loop == false){
                println("QUAIS ATIVIDADES VAI SOLICITAR :");
                println(" EMPRESTIMO - (1) / CADASTRAR O VEICULO - (2) / CADASTRAR O CLIENTE - (3) / DEVOLUÇÃO - (4) / FECHAR - (5) ");
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
