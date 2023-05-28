import java.util.ArrayList;
import java.util.Scanner;

//System.out.println("");
public class App {
    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);
        ArrayList<Locadora> lcd = new ArrayList<Locadora>();
        boolean loop = false;

        while (loop == false) {
            println("/////////////////////////////////////////////////////////");
            println("OLÁ BEM VINDO AO SISTEMA DE LOCADORA");
            println("ENTRAR NO SEU SISTEMA - (1) / CADASTRAR UMA LOCADORA - (2) / FECHAR - (3)");
            System.out.print("VALOR DA ESCOLHA:");
            int escolha = sc.nextInt();
            println("/////////////////////////////////////////////////////////");

            //// função de escolha das opções acima
            switch (escolha) {
                case 1:
                    println("/////////////////////////////////////////////////////////");
                    System.out.print("DIGITE NOME DA SUA LOCADORA:");
                    String nomeLocadora = sc.next();
                    println("/////////////////////////////////////////////////////////");
                    int idDaLocadora = 0;

                    for (int x = 0; x < lcd.size(); x++) {

                        if (lcd.get(x).getNome().equals(nomeLocadora)) {
                            idDaLocadora = x;
                        }
                    }

                    if (lcd.get(idDaLocadora).getNome().equals(null)) {

                        println("nenhuma locadora foi encontrada");
                        break;
                    }

                    println("////////////////////////// CONECTADO /////////////////////////////");
                    System.out.println("SEJA BEM VINDO " + lcd.get(idDaLocadora).getNome() + " AO SISTEMA DE LOCADORA");

                    while (loop == false) {
                        println("/////////////////////////////////////////////////////////////////");
                        println("QUAIS ATIVIDADES VAI SOLICITAR :");
                        println(" EMPRESTIMO - (1) / CADASTRAR O VEICULO - (2) / CADASTRAR O CLIENTE - (3) / DEVOLUÇÃO - (4) / LISTA CLIENTE - (5) / LISTA CARROS - (6) /  FECHAR - (7) ");
                        System.out.print("VALOR DA ESCOLHA:");
                        escolha = sc.nextInt();
                        println("/////////////////////////////////////////////////////////////////");

                        switch (escolha) {
                            case 1:
                                println("emprestimo");
                                break;
                            ///////////////////////////////////////////////////////
                            case 2:
                                println("cadastrodo de veiculo");
                                break;
                            ///////////////////////////////////////////////////////
                            case 3:
                                println("////////////// CADASTRAR CLIENTE ///////////////");
                                println("FISICO - (1) / JURIDICO - (2)");
                                System.out.print("VALOR DA ESCOLHA:");
                                int escolhaCliente = sc.nextInt();

                                if (escolhaCliente == 1) { /// Fisico
                                    println("////////////// CADASTRAR PESSOA FISICA ///////////////");
                                    String[] escolhaFisico = { "nome", "endereco", "telefone", "cpf" };

                                    for (int x = 0; x < escolhaFisico.length; x++) {
                                        System.out.print("Digide " + escolhaFisico[x] + ":");
                                        escolhaFisico[x] = sc.nextLine();
                                        escolhaFisico[x] = sc.nextLine();
                                        System.out.println("");
                                    }
                                    int valordacontaget = sc.nextInt();

                                    PessoaFisica clFisco = new PessoaFisica(escolhaFisico[0], escolhaFisico[1],
                                            escolhaFisico[2], escolhaFisico[3], valordacontaget);
                                    lcd.get(idDaLocadora).clp.add(clFisco);

                                } else if (escolhaCliente == 2) { //// JURIDICO

                                    String[] escolhaJuridico = { "nome", "endereco", "telefone", "cnpj",
                                            "nomeReprestante" };

                                    for (int x = 0; x < escolhaJuridico.length; x++) {
                                        System.out.print("Digide " + escolhaJuridico[x] + ":");
                                        escolhaJuridico[x] = sc.nextLine();
                                        System.out.println("");
                                    }
                                    println("valor da conta :");
                                    int valordacontaget = sc.nextInt();

                                    PessoaJuridica clJuridica = new PessoaJuridica(escolhaJuridico[0],
                                            escolhaJuridico[1], escolhaJuridico[2], escolhaJuridico[3],
                                            escolhaJuridico[4], valordacontaget);

                                    lcd.get(idDaLocadora).clj.add(clJuridica);

                                } else {

                                    System.out.println("Opção inválida");
                                    break;

                                }

                                break;
                            ///////////////////////////////////////////////////////
                            case 4:
                                println("devolução");
                                break;
                            ///////////////////////////////////////////////////////
                            case 5:
                                println("/////////////////LISTA DE CLIENTES/////////////////////");
                                for (int x = 0; x < lcd.get(idDaLocadora).clp.size(); x++) {
                                    System.out.println(lcd.get(idDaLocadora).clp.toString());
                                }
                                for (int x = 0; x < lcd.get(idDaLocadora).clj.size(); x++) {
                                    System.out.println(lcd.get(idDaLocadora).clj.toString());
                                }
                                break;
                            ///////////////////////////////////////////////////////
                            case 6:
                                loop = false;
                                break;
                            ///////////////////////////////////////////////////////
                            case 7:
                                loop = true;
                                break;
                        }

                    }
                    loop = false;
                    break;

                case 2:
                    println("//////////////////////// CADASTRO LOCADORA ///////////////////////");
                    println("VAMOS ESTAR CRIANDO SUA LOCADORA, POR FAVOR FORNECER SEGUINDES DADOS:");
                    String[] dados = { "NOME", "ENDERECO", "TELEFONE" };

                    for (int x = 0; x < dados.length; x++) {
                        System.out.print(" DADO " + dados[x] + ":");
                        dados[x] = sc.next();
                    }
                    System.out.println();

                    Locadora lc = new Locadora(dados[0], dados[1], dados[2]);
                    lcd.add(lc);

                    break;

                case 3:
                    loop = true;
                    break;
            }

        }
    }

    public static void println(String valor) {
        System.out.println(valor);
    }

}
